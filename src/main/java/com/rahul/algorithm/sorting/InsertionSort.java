package com.rahul.algorithm.sorting;

import com.rahul.util.CommonUtil;

public class InsertionSort {

	public static void main(String args[]){
		int arr[] = { 12, 11, 13, 5, 6 };
		InsertionSort ob = new InsertionSort();
		ob.sort(arr);

		CommonUtil.printArray(arr);
	}

	private static void sort(int []arr){
		for(int i=1;i<arr.length;i++){
			int j=i-1;
			while (j>=0 && arr[j]>arr[i]){
				CommonUtil.swap(arr,i,j);
				j--;i--;
			}
		}
	}
}
