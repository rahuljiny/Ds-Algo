package com.rahul.algorithm.sorting;

import com.rahul.util.CommonUtil;

public class RecursiveBubbleSort {

	public static void main(String args[]) {
		RecursiveBubbleSort ob = new RecursiveBubbleSort();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		ob.bubbleSort(arr,arr.length);
		System.out.println("Sorted array");
		CommonUtil.printArray(arr);
	}

	private static void bubbleSort(int[] arr,int n){
		if(n>0){
			for(int i=0;i<n-1;i++){
				if(arr[i]>arr[i+1]){
					CommonUtil.swap(arr,i,i+1);
				}
			}
		}else {
			return;
		}
		bubbleSort(arr,n-1);
	}
}
