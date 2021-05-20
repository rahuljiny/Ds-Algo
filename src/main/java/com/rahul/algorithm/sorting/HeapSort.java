package com.rahul.algorithm.sorting;

import com.rahul.util.CommonUtil;

public class HeapSort {

	public static void main(String args[]){
		int arr[] = {12, 11, 13, 5, 6, 7};
		int n = arr.length;
		HeapSort ob = new HeapSort();
		ob.sort(arr);
		System.out.println("Sorted array is");
		CommonUtil.printArray(arr);
	}

	private static void sort(int[] arr){
		int n=arr.length;
		for(int i=(n/2)-1;i>=0;i--){
			heapify(arr,n,i);
		}
		for(int i=n-1;i>0;i--){
			CommonUtil.swap(arr,0,i);
			heapify(arr,i,0);
		}
	}
	private static void heapify(int[] arr,int n,int i){
		if(i<n){
			int largest=i;
			int l=2*i+1;
			int r=2*i+2;
			if(l<n &&arr[largest]<arr[l])
				largest=l;
			if(r<n && arr[largest]<arr[r])
				largest=r;
			if(largest!=i){
				CommonUtil.swap(arr,i,largest);
				heapify(arr,n,largest);
			}
		}
	}
}
