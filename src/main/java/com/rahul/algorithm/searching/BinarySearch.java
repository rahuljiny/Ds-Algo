package com.rahul.algorithm.searching;

public class BinarySearch {

	public static void main(String args[]){
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

	private int binarySearch(int[] arr, int start, int end, int key){
		if(start<end){
			int mid=(start+end)/2;
			if(arr[mid]==key)
				return mid;
			if(arr[mid]>key)
				return binarySearch( arr,  start,mid-1,key);
			else return binarySearch( arr,  mid+1,end,key);
		}
		return -1;
	}
}
