/*
Created on: 8-09-2014
@Author: Prathyush

This is another matrix example in java
It accepts only odd input

for ex: i/p: 5
the output is:   3	3	3	3	3
	  	 3	2	2	2	3
	         3      2	1	2	3
		 3	2	2	2	3
		 3	3	3	3	3
*/ 


import java.util.Scanner; // To get the input  from the user

public class Matrix {	
	static int ROW=500,COL=500;	
	static int mat[][]= new int[ROW][COL];
	int i,j,k,l,n,m,r,c;
	
	//Function  to print the Matrix
	public void printMat()
	{
		System.out.println("The output matrix is: ");
		for(i=0;i<ROW;i++)
		{
			for(j=0;j<COL;j++)
				System.out.print("\t"+mat[i][j]);
			System.out.println("\n");
		}		
		System.out.println("\n");
	}
	
	//Function  to initialize the Matrix with zeros
	public void init()
	{
		for(i=0;i<ROW;i++)		
			for(j=0;j<COL;j++)
				mat[i][j]=0;
	}
	
	//Function to get the diagonal elements first
	public void diag()
	{
		int n=((int)(ROW/2))+1; 
		for(i=0;i<ROW;i++)		
			for(j=0;j<COL;j++)
			{
				if(i==j)
				{	
					if(n>1 && j<((int)ROW/2)+1)
					{
						mat[i][j]=n;
						n--;
					}
					else
					{						
						mat[i][j]=n;
						n++;						
					}					
				}
			}
	}
	
	//Function to print the numbers in circular manner
	public void cal()
	{		
		r=ROW;
		for(i=0,k=r;i<ROW;i++,k--)
		{
			n=1;				
			for(j=i+1,l=r;j<r;j++,l--)
			{
				mat[i][j]=mat[i][j-1]; // Column right
				mat[j][i]=mat[i][j-1]; // Row Down				
				mat[l-1][k-1]=mat[r-n][r-n]; // Row Up
				mat[k-1][l-1]=mat[r-n][r-n]; // Column left					
			}
			n++;
			r--;				
		}			
	}
	
	//Main Function
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);	
		Matrix mat=new Matrix();
		System.out.print("Please Enter an Odd Number:");
		Matrix.ROW=scan.nextInt();
		Matrix.COL=Matrix.ROW;
		mat.init();
		mat.diag();
		mat.cal();
		mat.printMat();
		scan.close();
	}
}
