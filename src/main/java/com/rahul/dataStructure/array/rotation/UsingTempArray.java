package com.rahul.dataStructure.array.rotation;

import com.rahul.dataStructure.array.OneDimension;

public class UsingTempArray {

	public static void main(String[] args) {
		OneDimension oneDimension= new OneDimension(7);
		int rotation=2;
		System.out.println("Array before rotation is ");
		oneDimension.print();
		rotateUsingTempArray(oneDimension.getArr(), rotation);
		System.out.println("Array after rotation is ");
		oneDimension.print();
	}

	private static void rotateUsingTempArray(int[] arr,int rotation){
		int[] temp= new int[rotation];
		for (int i=0;i<rotation;i++){
			temp[i]=arr[i];
		}
		for(int j=0;j<arr.length-rotation;j++){
			arr[j]=arr[j+rotation];
		}
		for (int i=arr.length-rotation,j=0;j<rotation && i<arr.length;i++,j++){
			arr[i]=temp[j];
		}
	}
}
