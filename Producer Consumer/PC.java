class Shop{
	int number;
	boolean book=false;
	int sp=0; // sleep value

	public void buy(int num){
	if(book==true){
		try{wait();}catch(Exception ex){}}
		System.out.println("Book bought: "+num+"th book");	
		book=true;
		number=num;
		try{notify();}catch(Exception ex){ }
	}

	public void sell(int num){
		if(book==false){
		try{wait();}catch(Exception ex){}}
		System.out.println("Book sold: "+num+"th book");
		System.out.println();
		book=false;
		try{notify();}catch(Exception ex){ }
	}
}

class Producer extends Thread  {
	Shop s;
	int book;
	synchronized public void run(){
	for(int i=1;i<=book;i++){
		s.buy(i);
		try{sleep(s.sp);} catch(Exception ex){}}
	}
}

class Consumer extends Thread{
	Shop s;
	int book;
	synchronized public void run(){
	for(int i=1;i<=book;i++){
		s.sell(i);
		try{sleep(s.sp);} catch(Exception ex){}}
	}
}

class PC{
	public static void main(String args[]){
	System.out.println("Start of the Transaction...");
	try{Thread.sleep(1000);}catch(Exception ex){}
	Producer producer=new Producer();
	Consumer consumer=new Consumer();
	producer.s=consumer.s=new Shop();	
	producer.book=10;
	consumer.book=20;
	try{
	producer.start();	
	consumer.start();
	producer.join();
	consumer.join();
	}
	catch(Exception ex){}	
	System.out.println("End of the Transaction");
	}
}