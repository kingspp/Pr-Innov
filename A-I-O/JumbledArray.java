import java.util.Random;

public class JumbledArray {	
	 int MAX=100;
	 int arr[]=new int[MAX+1];
	 boolean test[]=new boolean[MAX+1];
	
	public void initArray()
	{
		Random rand=new Random();
		for(int i=0;i<MAX+1;i++){
			arr[i]=rand.nextInt(MAX+1);
			test[i]=false;}
	}
	
	public void printArray(){	
		for(int i=0;i<MAX+1;i++)
			System.out.print(i+":"+arr[i]+",");}	
	
	public void missingArray()
	{
		int i,n;
		for( i=0;i<MAX+1;i++){
			 n=arr[i];
			 test[n]=true; }			
		System.out.println("\n");
		System.out.println("The missing numbers are: ");
		for(i=0;i<MAX+1;i++)
			if(test[i]==false)
				System.out.print(i+",");		
	}
	
	public static void main(String args[])
	{		
		JumbledArray arr=new JumbledArray();
		arr.initArray();
		arr.printArray();
		arr.missingArray();		
	}
}
