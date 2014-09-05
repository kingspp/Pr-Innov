/* Created on 22-08-14
 * @author Prathyush SP
 * 
 *  Commands:
 *	java server [port] [servername]
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
	private static String servername;
	private static int port;
	private Scanner scan=new Scanner(System.in);
	private static String args[];
	String date= sdf.format(new Date()).toString();
	ServerSocket obj ;
	
	
	public  boolean init(){
		System.out.print("Enter the Port: ");
		port=Integer.parseInt(scan.nextLine());
		System.out.print("Enter the Servername:  ");
		servername=scan.nextLine();	
		System.out.println("");
		return true;
	}
	
	public boolean def(){
		port=1500;
		servername="Developer Server";
		return true;
	}
		
	public boolean start() {
		System.out.println("Start of "+servername);
		System.out.println(date);
		try{
		obj=new ServerSocket(port);}
		catch(Exception ex){}
		
		
		while(true)		{
			
			Socket s=null;
			while(s==null)
			{
				try{
				s=obj.accept();
				}
				catch(Exception ex){}
				System.out.println(s);
				try
				{
					// create output first
					sOutput = new ObjectOutputStream(s.getOutputStream());
					sInput  = new ObjectInputStream(s.getInputStream());
					// read the username
					username = (String) sInput.readObject();
					System.out.println(username + " just connected.");
					//user[i]=username;
					//i++;
					sOutput.writeObject("Connected to "+servername);
				}
				catch (IOException e) {
					System.out.println("Exception creating new Input/output Streams: " + e);
					return false;
				}
				// have to catch ClassNotFoundException
				// but I read a String, I am sure it will work
				catch (ClassNotFoundException e) {
				}
	            date = new Date().toString() + "\n";
			}
			}		
		
		
	}
	
	public static void main(String args[]) throws Exception	{
		Server server=new Server();		
		if (args.length==2) {
			port=Integer.parseInt(args[0]);
			servername=args[1];
		}
		else
			//server.init();
			server.def();
		server.start();		
	}	
}