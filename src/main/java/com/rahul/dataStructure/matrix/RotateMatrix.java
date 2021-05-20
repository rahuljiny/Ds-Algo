package com.rahul.dataStructure.matrix;

public class RotateMatrix {
	static int R=4;
	static int C=4;
	public static void main(String[] args)
	{
		// Test Case 1
		int a[][] = { {1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16} };

		// Tese Case 2
    /* int a[][] = new int {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                        };*/
		printMatrix(R, C, a);
		rotateMatrix(R, C, a);
		System.out.println("");
		System.out.println("");
		printMatrix(R, C, a);
	}

	private static void printMatrix(int m, int n, int[][]a){
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	private static void rotateMatrix(int m, int n, int[][]a){
		int row=0,col=0;
		while (row<m && col<n){
			int prev=a[row+1][col];
			if(row+1==m || col+1==n)
				break;
			for(int i=col;i<n;i++){
				int curr=a[row][i];
				a[row][i]=prev;
				prev=curr;
			}
			row++;
			for(int j=row;j<m;j++){
				int curr=a[j][n-1];
				a[j][n-1]=prev;
				prev=curr;
			}
			n--;
			if(row<m){
				for(int i=n-1;i>=col;i--){
					int curr=a[m-1][i];
					a[m-1][i]=prev;
					prev=curr;
				}
				m--;
			}
			if(col<n){
				for(int j=m-1;j>=row;j--){
					int curr=a[j][col];
					a[j][col]=prev;
					prev=curr;
				}
				col++;
			}
		}
	}
}
