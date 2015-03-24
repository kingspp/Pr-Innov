/*
 * Dynamic Matrix multiplication program;
 * @Author: Kingspp
 * The program is used to multiply two matrices.
 * p is the first matrix with pr =row and pc=column
 * q is the first matrix with qr =row and qc=column
 */


public class DynamicMatrixMul {	
	private static int p[][];
	private static int q[][];
	private static int pr=2;
	private static int pc=2;
	private static int qr=2;
	private static int qc=1;
	static int[][] res=new int[pr][qc];
	

	public static void main(String v[])
	{
		System.out.println("Matrix Multiplication");		
		p=new int[pr][pc];
		q=new int[qr][qc];	
		fillMat(p,pr,pc);
		fillMat(q,qr,qc);
		printMat(p,pr,pc);
		printMat(q,qr,qc);
		
		if(pc!=qr)		
			System.out.println("Matrix multiplication not possible");
		else
			for(int i=0;i<pr;i++)
			{
				for(int j=0;j<qc;j++)
				{
					int sum=0;
					for(int k=0;k<qr;k++)
						sum+=p[i][k]*q[k][j];					
					res[i][j]=sum;					
				}				
			}		
		printMat(res, pr,qc);		
	}
	
	//Function to fill the matrix with random numbers
	static void fillMat(int m[][],int r,int c)
	{
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)			
				m[i][j]=0+ (int)(Math.random()*10);			
		
	}
	
	//Function to print the matrix
	static void printMat(int m[][],int r,int c){
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(m[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
		System.out.print("\n");		
	}
}
