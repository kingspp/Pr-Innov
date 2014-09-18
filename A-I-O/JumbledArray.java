/*Created on 17-09-14
@Author- Prathyush S.P

This is an example of a jumbled array.
Question: You have an array of 100 elements. The elements range from 1-100. The job is to find the missing number.
1st approach: Ouer loop - 100 times. Inner loop - 100 times. Total loops 100*100.
2nd approach: Sort the numbers from the beginning. Then iterate the loop to find the missing number. Total loops (Sorting)*100.
**3rd approach: Get a boolean array. Equte the number with boolean index as true if found. Else false.**

Note: Random is used to genetate 100 random numbers!!! LAZY :P

*/
import java.util.Random;

public class JumbledArray {	
	 int MAX=100;
	 int arr[]=new int[MAX+1];
	 boolean test[]=new boolean[MAX+1];
	
	public void initArray()
	{
		Random rand=new Random();
		for(int i=0;i<MAX+1;i++){
			arr[i]=rand.nextInt(MAX+1);
			test[i]=false;}
	}
	
	public void printArray(){	
		for(int i=0;i<MAX+1;i++)
			System.out.print(i+":"+arr[i]+",");}	
	
	public void missingArray()
	{
		int i,n;
		for( i=0;i<MAX+1;i++){
			 n=arr[i];
			 test[n]=true; }			
		System.out.println("\n");
		System.out.println("The missing numbers are: ");
		for(i=0;i<MAX+1;i++)
			if(test[i]==false)
				System.out.print(i+",");		
	}
	
	public static void main(String args[])
	{		
		JumbledArray arr=new JumbledArray();
		arr.initArray();
		arr.printArray();
		arr.missingArray();		
	}
}
