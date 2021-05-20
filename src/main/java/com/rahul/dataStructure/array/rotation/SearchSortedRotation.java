package com.rahul.dataStructure.array.rotation;

import com.rahul.dataStructure.array.OneDimension;

import java.util.Random;

public class SearchSortedRotation {

	public static void main(String[] args) {
		SearchSortedRotation searchSortedRotation= new SearchSortedRotation();
		int n=8;
		Random random= new Random();
		OneDimension oneDimension= new OneDimension(n,true);
		oneDimension.rotateArray();
		int key=1+random.nextInt(n-1);
		oneDimension.print();
		System.out.println("key to search is "+key);
		int index = searchSortedRotation.pivotedBinarySearch(oneDimension.getArr(), key);
		System.out.println("key is at position  "+(index+1));

	}

	private int pivotedBinarySearch(int[] arr,int key){
		int length=arr.length-1;
		int pivot=findPivot(arr,0,length);
		if(pivot==-1)
			return binarySearch(arr,0,length,key);
		if(arr[pivot]==key)
			return pivot;
		if(key>=arr[0])
			return binarySearch(arr,0,pivot-1,key);
		return binarySearch(arr,pivot+1,length,key);
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
	private  void rotateArray(int[] arr, int rotation){
		for( int i=0;i<rotation;i++){
			int temp=arr[0];
			for(int j=1;j<arr.length;j++){
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
		}
	}
	private int binarySearch(int[] arr, int low, int high,int key){
		if(high<low){
			return -1;
		}
		int mid=(high+low)/2;
		if(arr[mid]==key)
			return mid;
		if(arr[mid]>key)
			return binarySearch(arr,low,mid-1,key);
		return binarySearch(arr,mid+1,high,key);
	}


}
