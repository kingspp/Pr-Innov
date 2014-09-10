/*
Created on Aug 21, 2014

@author: Prathyush
*/


/*To get a matrix as such:
 * 
 *  a       a+1    a+2    a+3    . . . 
 *  a^2 -1  a^2    a^2+1  a^2+2  . . .
 *  a^4 -2  a^4-1  a^4    a^4+1  . . .
 *  a^4 -3  a^4-2  a^1    a^8    . . .
 *  
 *  [3*3] Example with start number as 3
 *  3   4   5
 *  8   9   10
 *  79  80  81
 *  
 *    Change the ROW,COL to suit the matrix [Make sure ROW==COL] !!square matrix only!!
 *    Change the Start to change the start of the diagonal element 
 */

public class Pr1 {
	public static void main(String v[]) {
		double start = System.nanoTime();
		int a = 1;
		Matrix mat = new Matrix();
		int row = mat.row;
		int col = mat.col;

		if (Matrix.ROW != Matrix.COL) {
			System.out.println("Make sure ROW and COL are equal");
			System.exit(0);
		}
		
		System.out.println("Step1: Initialize the matrix with 0");
		mat.initMatrix();
		mat.printMatrix();
		System.out.println("\n\n");
		System.out.println("Step2: Now Change the diagonal elements to the square of the previous diagonal number");
		// print the diagonal
		for (row = 0; row < Matrix.ROW; row++) {
			a = 0;
			for (col = 0; col < Matrix.COL; col++) {
				if (row == col) {
					if (row == col && col == 0)
						Matrix.mat[row][col] = (int) Math.pow(Matrix.START, 1);
					else {
						Matrix.mat[row][col] = (int) Math.pow(Matrix.START, 2);
						Matrix.START = Matrix.mat[row][col];
					}
				}
			}
		}
		mat.printMatrix();
		System.out.println("\n\n");
		
		System.out.println("Step3: Add +1 if row<col and -1 if row>col");
		for (row = 0; row < Matrix.ROW; row++) {
			a = 1;
			for (col = 0; col < Matrix.COL; col++) {
				if (row == col)
					continue;

				else if (row > col)
					Matrix.mat[row][col] = Matrix.mat[row][row] - (row - col);

				else if (row < col) {
					Matrix.mat[row][col] = Matrix.mat[row][row] + a;
					a++;
				}
			}
		}
		mat.printMatrix();
		double end = System.nanoTime();
		System.out.println("Time Elapsed is: " + String.valueOf((end - start))
				+ "ns");
	}
}

class Matrix {
	int row, col;
	static int ROW = 3, COL = 3, START = 3;
	static int[][] mat = new int[100][100];

	int initMatrix() {
		for (row = 0; row < ROW; row++) {
			for (col = 0; col < COL; col++)
				mat[row][col] = 0;
		}
		return 0;
	}

	int printMatrix() {
		for (row = 0; row < ROW; row++) {
			for (col = 0; col < COL; col++)
				System.out.print(mat[row][col] + "\t");
			System.out.println("\n");
		}
		return 0;
	}
}
