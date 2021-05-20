package com.rahul.algorithm.sorting;

import com.rahul.util.CommonUtil;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {64,25,12,22,11};
		CommonUtil.printArray(arr);
		sort(arr);
		CommonUtil.printArray(arr);
	}
	private static void sort(int []arr){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			int minIndex=i;
			for(int j=i+1;j<n;j++){
				if(arr[minIndex]>arr[j]){
					minIndex=j;
				}
			}
			CommonUtil.swap(arr,i,minIndex);
		}
	}

}
