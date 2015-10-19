
/*
Created on Oct 19, 2015
@author: Prathyush
Description: This program aims to find the count of, randomly distributed numbers.
*/

import java.util.Random;
public class NumberSortAndCount {
	public static void main(String v[]){
		Random random = new Random();	
		int[] numberArray = new int[100];
		int[] numberCount = new int[100];		
		for(int i=0;i<100;i++)
			numberCount[i] = 0;
		
		for(int i=0;i<100;i++)
			numberArray[i] =  random.nextInt((99 - 1) + 1) + 1;
		
		for(int i=0;i<100;i++){
			numberCount[numberArray[i]] = numberCount[numberArray[i]] +1;
		}
		
		for(int i=0;i<100;i++){
			if(numberCount[i] == 0)
				continue;
			System.out.println("Number: "+ i + " Count: " + numberCount[i]);
		}
	}
}
