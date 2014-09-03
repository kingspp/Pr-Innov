import java.net.*;
import java.util.*;

class Client
{
	public static void main(String v[]) 
	{
		System.out.println("Client Started");
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Port");;
		int port=scan.nextInt();
		//Socket s=new Socket("Hello",port);
		
		try{
		Socket s=new Socket("localhost",port);
		System.out.println(s);
		}
		catch (Exception ex){
		System.out.println("Please Check the port");
		System.exit(0);
		}
		
		
	}
}
