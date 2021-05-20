package com.rahul.dataStructure.array.rotation;

import com.rahul.dataStructure.array.OneDimension;

public class ReversalMethod {
	public static void main(String[] args) {
		int d=4;
		OneDimension oneDimension= new OneDimension(10);
		oneDimension.print();
		reverse(oneDimension.getArr(),0,d-1);
		reverse(oneDimension.getArr(),d,oneDimension.getArr().length-1);
		reverse(oneDimension.getArr(),0,oneDimension.getArr().length-1);
		oneDimension.print();
	}

	private static void reverse(int[] arr,int start, int end){
		while (start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}
