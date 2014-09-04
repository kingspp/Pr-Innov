import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

class Client
{
	private ObjectInputStream sInput;		// to read from the socket
	private ObjectOutputStream sOutput;		// to write on the socket
	private Socket s;
	private static String server, username;
	private static int port;
	
	

	public boolean start() {
		// try to connect to the server
		try {
			s = new Socket(server, port);
		} 
		// if it failed not much I can so
		catch(Exception ec) {		
			System.out.println("Error connectiong to server:" + ec);
			System.exit(0);
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
		catch (IOException eIO) {
			System.out.println("Exception creating new Input/output Streams: " + eIO);
			return false;
		}

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
	
	
	
	public static void main(String v[]) 
	{
		System.out.println("Client Started");
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Port");
		int port=scan.nextInt();		
		Client client=new Client();
		client.port=1500;
		client.server="localhost";
		client.username="King";
		client.start();
	}
}
