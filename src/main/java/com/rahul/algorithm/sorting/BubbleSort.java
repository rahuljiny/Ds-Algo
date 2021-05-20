package com.rahul.algorithm.sorting;

import com.rahul.util.CommonUtil;

public class BubbleSort {

	public static void main(String args[]) {
		BubbleSort ob = new BubbleSort();
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		CommonUtil.printArray(arr);
	}

	private void bubbleSort(int[] arr){
		for (int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					CommonUtil.swap(arr,i,j);
				}
			}
		}
	}
}
