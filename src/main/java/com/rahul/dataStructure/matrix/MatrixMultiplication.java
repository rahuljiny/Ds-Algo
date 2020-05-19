package com.rahul.dataStructure.matrix;

public class MatrixMultiplication {
	static int MAX = 100;
	static int i = 0, j = 0, k = 0;

	public static void main(String[] args) {
		int row1 = 3, col1 = 3, row2 = 3, col2 = 3;
		int A[][] = {{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};

		int B[][] = {{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}};

		multiplyMatrix(row1, col1, A, row2, col2, B);
		for(int i=0;i<row2;i++){
			for(int j=0;j<col1;j++){

			}
		}
	}

	private static void multiplyMatrix(int row1, int col1, int[][] A, int row2, int col2, int[][] B) {
		if (row1 != col2) {
			System.out.println("Not Possible");
			return;
		}
		int[][] C = new int[MAX][MAX];
		multiplyMatrixRecursive(row1, col1, A, row2, col2, B, C);
		for(int i=0;i<row2;i++){
			for(int j=0;j<col1;j++){
				System.out.print(C[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

	private static void multiplyMatrixRecursive(int row1, int col1, int[][] A, int row2, int col2, int[][] B, int[][] C) {
		if (i >= row1) {
			return;
		}
		if (j < col2) {
			if (k < col1) {
				C[i][j] += A[i][k] * B[k][j];
				k++;
				multiplyMatrixRecursive(row1, col1, A, row2, col2, B, C);
			}
			k = 0;
			j++;
			multiplyMatrixRecursive(row1, col1, A, row2, col2, B, C);
		}
		j = 0;
		i++;
		multiplyMatrixRecursive(row1, col1, A, row2, col2, B, C);
	}

}
