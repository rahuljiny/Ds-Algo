package com.rahul.algorithm.sorting;

import com.rahul.util.CommonUtil;

public class QuickSort {

	public static void main(String args[]) {
		int arr[] = {10, 7, 8, 9, 1, 5};
		int n = arr.length;

		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, n-1);

		System.out.println("sorted array");
		CommonUtil.printArray(arr);
	}

	private  void sort(int[]arr, int low, int high){
		if(low<high){
			int po=partition(arr,low,high);
			CommonUtil.printArray(arr);
			sort(arr,low,po-1);
			sort(arr,po+1,high);
		}
	}

	private static int partition(int[] arr,int low,int high){
		int pivot=high;
		int i=low;
		int j=high-1;
		while (i<j){
			while (i<j&& arr[i]<pivot){
				i++;
			}
			while (i<j&& arr[j]>pivot){
				j--;
			}
			CommonUtil.swap(arr,i,j);
		}
		CommonUtil.swap(arr,j,pivot);
		return j;
	}
}
