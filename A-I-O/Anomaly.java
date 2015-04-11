/*
Created on Aug 28, 2014
@author: Prathyush
Description: This program finds the anamoly of the given string.
Example: Input:  Hello
	 Output: olleH
	 
	 Input:  My name is Prathyush
 	 Output: yM eman  si hsuyhtarP
*/
import java.util.Scanner;

public class Anomaly {
	public static int length(String s)
	{
		int i=0,c=0;
		try{
			for(i=0,c=0;i>=0;i++,c++)
				s.charAt(i);
		}
		catch(Exception ex){}
		return c;
	}

	public static void main(String args[])
	{
		System.out.println("String Anomaly");
		int i=0,k,t=0;
		Scanner scan=new Scanner(System.in);
		String str;
		System.out.print(" ");
		str=scan.nextLine();
		//System.out.println(length(str));
		scan.close();
		final int len=length(str);
		for(i=0;i<len;i++)		  
			if(str.charAt(i)==' ')
			{			
				for(k=i;k>=t;k--)								
					System.out.print(str.charAt(k));				
				t=i;			
			}		
		i=len-1;
		//System.out.print(" ");

		while( i>=0 && str.charAt(i)!=' ' )		
			System.out.print(str.charAt(i--));			
	}	
}
