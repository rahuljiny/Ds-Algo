package com.rahul.dataStructure.array.rearrange;

import com.rahul.dataStructure.array.util.ArrayUtil;

public class SegregateEvenOdd {
	public static void main(String[] args) {
		int arr[]={1,9,5,3,2,6,7,11};
		rearrangeEvenOdd(arr);
		ArrayUtil.print(arr);
	}
	private static void rearrangeEvenOdd(int[] arr){
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0 && i!=j){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
	}
}
