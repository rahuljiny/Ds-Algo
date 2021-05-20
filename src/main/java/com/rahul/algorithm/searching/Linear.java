package com.rahul.algorithm.searching;

public class Linear {
	public static void main(String[] args) {
		int arr[] = {10, 20, 80, 30, 60, 50,110, 100, 130, 170};
		int searchKey=61;
		System.out.println(searchKey(arr,searchKey));
	}
	private static String searchKey(int[] arr,int searchKey){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==searchKey)
				return "Found";
		}
		return "Not Found";
	}
}
