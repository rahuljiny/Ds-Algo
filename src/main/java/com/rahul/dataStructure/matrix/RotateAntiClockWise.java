package com.rahul.dataStructure.matrix;

public class RotateAntiClockWise {
	public static void main(String[] args){
		int N = 4;
		int mat[][] = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }
		};
		displayMatrix(mat,N);
		rotateMatrix(N, mat);
		displayMatrix(mat,N);
	}

	private static void rotateMatrix(int N, int[][] mat){
		for(int x=0;x<N/2;x++){
			for(int y=x;y<N-x-1;y++){
				int temp=mat[x][y];
				mat[x][y]=mat[y][N-x-1];
				mat[y][N-x-1]=mat[N-x-1][N-y-1];
				mat[N-x-1][N-y-1]=mat[N-y-1][x];
				mat[N-y-1][x]=temp;
			}
		}
	}
	private static void displayMatrix(int[][] mat,int N){
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println();
	}
}
