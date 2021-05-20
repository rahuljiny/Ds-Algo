package com.rahul.dataStructure.stack;

import com.rahul.dataStructure.array.OneDimension;

public class NextGreaterElement {

	public static void main(String[] args) {
		OneDimension oneDimension= new OneDimension(8);
		printNextGretEle(oneDimension.getArr());
	}
	private static void printNextGretEle(int[] arr){
		int next;
		for(int i=0;i<arr.length;i++){
			next=-1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					next=arr[j];
					break;
				}
			}
			System.out.println(arr[i]+" "+next);
		}
	}
}
