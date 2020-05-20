package com.rahul.algorithm.searching;

public class JumpSearch {

	public static void main(String [ ] args)
	{
		int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
		int x = 55;

		// Find the index of 'x' using Jump Search
		int index = jumpSearch(arr, x);

		// Print the index where 'x' is located
		System.out.println("Number " + x + " is at index " + index);
	}

	private  static int jumpSearch(int[] arr, int x){
		int n=arr.length;
		int m=new Double(Math.sqrt(n)).intValue();
		int i=0,j=m;
		while (j<n-1 && arr[j]<x){
			i=j;
			j=i+m;
		}
		if(j>=n){
			return -1;
		}
		while (i<=j){
			if(arr[i]==x)
				return i;
			i++;
		}
		return -1;
	}
}
