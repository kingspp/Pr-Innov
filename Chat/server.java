/*

Default: 
Port =1500

Commands:
java server [port]

*/

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Server
{
	private static String []user=new String[10];
	private static String username; 
	private static ObjectOutputStream sOutput;
	private static ObjectInputStream sInput;
	private static SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yy  HH:mm");
	public static void main(String args[]) throws Exception
	{
		int i=0;
		int port=1500;
		Scanner scan=new Scanner(System.in);
		String date= new Date().toString();
		date = sdf.format(new Date()).toString();
		
		if (args.length>0) 
			port=Integer.parseInt(args[0]);
		else 
			System.out.println("Enter the port no: ");
			port=scan.nextInt();
		
		System.out.println("Start of server..");
		System.out.println(date);
		
		ServerSocket obj = new ServerSocket(port);
		
		while(true)
		{
			
			Socket s=null;
			while(s==null)
			{
				s=obj.accept();
				System.out.println(s);
			}		
			
			try
			{
				// create output first
				sOutput = new ObjectOutputStream(s.getOutputStream());
				sInput  = new ObjectInputStream(s.getInputStream());
				// read the username
				username = (String) sInput.readObject();
				System.out.println(username + " just connected.");
				user[i]=username;
				i++;
			}
			catch (IOException e) {
				System.out.println("Exception creating new Input/output Streams: " + e);
				return;
			}
			// have to catch ClassNotFoundException
			// but I read a String, I am sure it will work
			catch (ClassNotFoundException e) {
			}
            date = new Date().toString() + "\n";
		}
		
	}
	
	
}