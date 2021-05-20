package com.rahul.dataStructure.array.rotation;

public class SumPairSortedRotated {

	public static void main(String[] args) {
		SumPairSortedRotated sortedRotated= new SumPairSortedRotated();
		int arr[] = {11, 15, 6, 7, 9, 10};
		int sum=21;
		int pivot=sortedRotated.findPivot(arr,0,arr.length-1);
		sortedRotated.printPair(arr,pivot,sum);
	}

	private void printPair(int[] arr, int pivot,int sum){
		int n=arr.length;
		int i=pivot;
		int j=i+1;
		while (i!=j){
			int add=arr[i]+arr[j];
			if(sum==add){
				System.out.println("pairs are "+arr[i] +" and "+arr[j]);
			}
			if(add>sum)
				i=(i+n-1)%n;
			else j=(j+n+1)%n;
		}
	}

	private  int findPivot(int[] arr,int low, int high){
		if(low>high)
			return -1;
		if(low==high)
			return low;
		int mid= (low+high)/2;
		if(mid<high && arr[mid]>arr[mid+1])
			return mid;
		if(mid>low && arr[mid]<arr[mid-1])
			return mid-1;
		if(arr[low]>arr[mid])
			return findPivot(arr,low,mid-1);
		return findPivot(arr,mid+1,high);
	}
}
