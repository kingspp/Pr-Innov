/*
Created on Dec 21, 2014

@author: Prathyush
*/


/*
 * 
 */

import java.util.*;

public class Triangle_number{
	
	static final int tl=100000; // MAX Triangle number
	static int tnum[]=new int[tl+100];
	
	public static void main(String[] v)
	{
		double start = System.nanoTime();
		System.out.println("Triangle Number");
		triangle_simple();
		//triangle_complex();		
		double end = System.nanoTime();
		System.out.println("Time Elapsed is: " + String.valueOf((end - start))
				+ "ns");		
	}
	
	// Algorithm :  T(n)=n(n+1)/2
	static void triangle_simple()
	{
		tnum[1]=1;
		for(int i=1;i<tl;i++)
		{
			tnum[i]=((i*(i+1))/2);
			System.out.println(i+":"+tnum[i]);
		}
	}
	
	// Algorithm : T(n)=T(n-1)+n; 
	static void triangle_complex()
	{
		for(int j=1; j<=tl;j++)
		{
			tnum[j]=tnum[j-1]+j;			
			System.out.println(j+":"+tnum[j]);
		}
	}	
}
