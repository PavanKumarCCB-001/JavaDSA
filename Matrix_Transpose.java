package demo;
import java.util.Scanner;

public class Matrix_Transpose {
	
	int[][] transpose(int[][] A) {
		int rows = A.length, cols = A[0].length;
		
		int[][] B = new int[cols][rows];	// Transpose Matrix
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++)
				B[j][i] = A[i][j]; }
		return B; 	}
	
	public static void main(String[] args) {
		
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter Matrix Size");
		int rows = ob.nextInt();
		int cols = ob.nextInt();
		
		int[][] A = new int[rows][cols]; // Actual Matrix
		int[][] res = new int[cols][rows]; // To print the Transposed matrix 
		
		System.out.println("Enter "+(rows*cols)+" Elements");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++)			
				A[i][j] = ob.nextInt(); }
		
		Matrix_Transpose obj = new Matrix_Transpose();
		
		System.out.println("Matrix Transpose:");
		res = obj.transpose(A);
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++)
				System.out.print(res[i][j]+" ");
		System.out.println();}
	ob.close(); } } 