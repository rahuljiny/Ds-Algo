package com.rahul.dataStructure.matrix;

public class RotateClockWise {
	public static void main(String[] args) {
		int M=3,N=4;
		int arr[][]={{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}};
		printMatrix(arr,M,N);
		int[][] dest=rotateMatrix(arr,M,N);
		printMatrix(dest,N,M);

	}

	private static int[][] rotateMatrix(int[][] arr,int M,int N){
		int [][] dest=new int[N][M];
		for(int r=0;r<M;r++){
			for(int c=0;c<N;c++){
				dest[c][M-r-1]=arr[r][c];
			}
		}
		return dest;
	}
	private static void printMatrix(int[][] arr,int M,int N){
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}
}
