package com.rahul.dataStructure.array.rotation;

import com.rahul.dataStructure.array.OneDimension;

public class SingleRotation {

	public static void main(String[] args) {
		OneDimension oneDimension= new OneDimension(8);
		int n=3;
		for(int i=0;i<n;i++){
			rotateByOne(oneDimension.getArr());
		}
		oneDimension.print();
	}
	private static void rotateByOne(int[] arr){
		int temp=arr[0];
		for(int i=1;i<arr.length;i++){
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
	}
}
