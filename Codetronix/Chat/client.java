/* Created on 22-08-14
 * @author Prathyush SP
 * 
 *  Commands:
 *	java client [server address] [port] [username]
 */

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Client 
{
	private ObjectInputStream sInput;		// to read from the socket
	private ObjectOutputStream sOutput;		// to write on the socket
	private Socket s;
	private static SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yy  HH:mm");
	private static String server, username;
	private static int port;
	private Scanner scan=new Scanner(System.in);
	String date= sdf.format(new Date()).toString();
	private String servername;	
	
	public boolean init(){
		System.out.print("Enter the Server Address: ");
		server=scan.nextLine();
		System.out.print("Enter the Port: ");
		port=Integer.parseInt(scan.nextLine());
		System.out.print("Enter the Username:  ");
		username=scan.nextLine();	
		System.out.println("");
		return true;
	}
	
	public boolean def(){
		server="localhost";
		port=1500;
		username="King";
		return true;
	}

	public boolean start() {		
		try {
			s = new Socket(server, port);
		}
		
		catch(Exception ec) {		
			System.out.println("Error connectiong to server:" + ec);
			init();
			return false;
		}
		String msg = "Connection accepted " + s.getInetAddress() + ":" + s.getPort();
		System.out.println(msg);
	
		/* Creating both Data Stream */
		try
		{
			sInput  = new ObjectInputStream(s.getInputStream());
			sOutput = new ObjectOutputStream(s.getOutputStream());
			
		}
		catch(Exception ex){}
		

		new ListenFromServer().start();
		try
		{
			sOutput.writeObject(username);
			
		}
		catch (IOException eIO) {
			System.out.println("Exception doing login : " + eIO);			
			return false;
		}
		// success we inform the caller that it worked
		return true;
	}
	
	
	
	public static void main(String args[]) 
	{
		System.out.println("Client Started");
		Client client=new Client();
		if(args.length==3)
		{
			client.server=args[0];
			client.port=Integer.parseInt(args[1]);
			client.username=args[2];
		}
		
		else		
		//client.init();
		client.def();
		client.start();	
	}	
	
	class ListenFromServer extends Thread {

		public void run() {
			while(true) 
				try {
					String msg = (String) sInput.readObject();
					// if console mode print the message and add back the prompt					
						System.out.println(msg);
						System.out.print("> ");	}
				catch(IOException e) {
					System.out.println("Server has close the connection: " + e);
					System.exit(0);	}
				// can't happen with a String object but need the catch anyhow
				catch(ClassNotFoundException e2) {}
			}
	}
}







