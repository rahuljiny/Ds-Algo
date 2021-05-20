package com.rahul.dataStructure.array.rotation;

import com.rahul.dataStructure.array.OneDimension;

public class CyclicRotation {
	public static void main(String[] args) {
		OneDimension oneDimension= new OneDimension(6,true);
		cyclicRotate(oneDimension.getArr());
		oneDimension.print();
	}
	private static void cyclicRotate(int arr[]){
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--){
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
	}
}
