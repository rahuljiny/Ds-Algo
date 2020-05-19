package com.rahul.dataStructure.matrix;

public class SpiralMatrix {

	public static void main(String[] args) {
		int R = 3;
		int C = 6;
		int a[][] = { { 1, 2, 3, 4, 5, 6 },
				{ 7, 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 } };
		spiralPrint(R, C, a);
	}

	private static void spiralPrint(int R, int C, int[][]a){
		int i,row=0,col=0;
		while (row<R && col<C){
			for(i=col;i<C;i++){
				System.out.print(a[row][i]+" ");
			}
			row++;
			for(i=row;i<R;i++){
				System.out.print(a[i][C-1]+" ");
			}
			C--;
			if(row<R){
				for(i=C-1;i>=col;i--){
					System.out.print(a[R-1][i]+" ");
				}
				R--;
			}
			if(col<C){
				for(i=R-1;i>=row;i--){
					System.out.print(a[i][col]+" ");
				}
				col++;
			}

		}
	}
}
