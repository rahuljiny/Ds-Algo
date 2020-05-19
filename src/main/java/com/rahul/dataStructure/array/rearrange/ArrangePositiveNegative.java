package com.rahul.dataStructure.array.rearrange;

import com.rahul.dataStructure.array.util.ArrayUtil;

public class ArrangePositiveNegative {

	public static void main(String[] args) {
		int arr[]={12, 11, -13, -5, 6, -7, 5, -3, -1};
		rearrangePositiveNegative(arr);
		ArrayUtil.print(arr);
	}
	private static void rearrangePositiveNegative(int[] arr){
		int i=0,j=arr.length-1;
		while (i<j){
			if(arr[i]>0 && arr[j]<0){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			if(arr[i]<0)
				i++;
			if(arr[j]>0)
				j--;
		}
	}
}
