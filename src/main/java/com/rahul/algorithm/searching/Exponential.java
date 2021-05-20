package com.rahul.algorithm.searching;

public class Exponential {

	public static void main(String args[])
	{
		int arr[] = {2, 3, 4, 10, 40};
		int x = 10;
		int result = exponentialSearch(arr, arr.length, x);

		System.out.println((result < 0) ?
				"Element is not present in array" :
				"Element is present at index " +
						result);
	}
	private static int exponentialSearch(int[] arr, int n, int x){
		int i=1;
		while (i<n && arr[i]<=x){
			i=i*2;
		}
		int j=i/2;
		return binarySearch(arr,j,i,x);
	}
	private static  int binarySearch(int[] arr, int start, int end, int key){
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
