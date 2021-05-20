package com.rahul.dataStructure.array.rearrange;

import com.rahul.dataStructure.array.util.ArrayUtil;

public class AllZeroAtEnd {
	public static void main(String[] args) {
		int arr[]={1, 2, 0, 0, 0, 3, 6};
		moveZeroAtEnd(arr);
		ArrayUtil.print(arr);
	}

	private static void moveZeroAtEnd(int []arr){
		int i=0,j=arr.length-1;
		while (i<j){
			while (i<j && arr[j]==0){
				j--;
			}
			while (i<j&& arr[i]==0){
				int temp=arr[j];
				arr[j]=0;
				arr[i]=temp;
				i++;
				j--;
			}
			i++;
		}
	}
}
