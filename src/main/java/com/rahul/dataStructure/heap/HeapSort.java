package com.rahul.dataStructure.heap;

public class HeapSort {

	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7};
		int n = arr.length;

		HeapSort ob = new HeapSort();
		ob.sort(arr,n);

		System.out.println("Sorted array is");
		printArray(arr);
	}

	private void sort(int[] arr, int n){
		for(int i=n/2-1;i>=0;i--){
			printArray(arr);
			heapify(arr,n,i);
		}
		printArray(arr);
		for(int j=n-1;j>=0;j--){
			int temp=arr[0];
			arr[0]=arr[j];
			arr[j]=temp;
			printArray(arr);
			heapify(arr,j,0);
		}
	}

	private void heapify(int[] arr,int n, int i){
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;

		if(l<n && arr[l]>arr[largest]){
			largest=l;
		}
		if(r<n && arr[r]>arr[largest]){
			largest=r;
		}
		if(largest!=i){
			int swap=arr[i];
			arr[i]=arr[largest];
			arr[largest]=swap;
			heapify(arr,n,largest);
		}

	}
	private static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
}
