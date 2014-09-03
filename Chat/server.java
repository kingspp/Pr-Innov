import java.net.*;
import java.text.SimpleDateFormat;
class Server
{
	private SimpleDateFormat sdf;
	public static void main(String v[]) throws Exception
	{
		final int port=1500;
		System.out.println("Start of server..");
		ServerSocket obj = new ServerSocket(port);
		display();
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
	
	private void display(String msg) {
		String time = sdf.format(new Date()) + " " + msg;
		if(sg == null)
			System.out.println(time);
		else
			sg.appendEvent(time + "\n");
	}
}