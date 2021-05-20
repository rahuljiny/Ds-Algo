package com.rahul.dataStructure.array.rearrange;

import com.rahul.dataStructure.array.util.ArrayUtil;

public class AllZeroAtEnd2 {
	public static void main(String[] args) {
		int[] arr={0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		rearrange(arr);
		ArrayUtil.print(arr);
	}

	private static void rearrange(int[] arr){
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
	}
}
