/*

Default: 
Port =1500

Commands:
java server [port]

*/

import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

class Server
{
	private static SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yy  HH:mm");
	public static void main(String args[]) throws Exception
	{
		int port=1500;
		String date= new Date().toString();
		date = sdf.format(new Date()).toString();
		
		//if (args[0]!="\0") port=Integer.parseInt(args[0]);
		//else port=1500;
		
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
		}
		
	}
	
	
}