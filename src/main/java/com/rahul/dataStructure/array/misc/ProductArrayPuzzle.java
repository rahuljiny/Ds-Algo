package com.rahul.dataStructure.array.misc;

import com.rahul.dataStructure.array.util.ArrayUtil;

public class ProductArrayPuzzle {
	public static void main(String[] args) {
		int arr[]={10, 3, 5, 6, 2};
		printProdArr(arr);
	}
	private static void printProdArr(int[] arr){
		int n= arr.length;
		int []prod= new int[n];
		int[] leftProd= new int[n];
		int[] rightProd= new int[n];
		for (int i=0;i<n;i++){
			if(i==0)
				leftProd[i]=arr[i];
			else leftProd[i]=leftProd[i-1]*arr[i];
		}
		for (int j=n-1;j>=0;j--){
			if(j==n-1)
				rightProd[j]=arr[j];
			else rightProd[j]=rightProd[j+1]*arr[j];
		}
		for(int k=0;k<n;k++){
			if(k==0){
				prod[k]=rightProd[k+1];
			}
			else if(k==n-1){
				prod[k]=leftProd[k-1];
			}
			else {
				prod[k]=leftProd[k-1]*rightProd[k+1];
			}
		}
		ArrayUtil.print(prod);
	}
}
