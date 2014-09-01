import java.net.*;

class Server
{
	public static void main(String v[]) throws Exception
	{
		final int port=1500;
		System.out.println("Start of server..");
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