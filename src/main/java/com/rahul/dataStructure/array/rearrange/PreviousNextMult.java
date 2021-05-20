package com.rahul.dataStructure.array.rearrange;

import com.rahul.dataStructure.array.util.ArrayUtil;

public class PreviousNextMult {
	public static void main(String[] args) {
		int arr[] = {2, 3, 4, 5, 6};
		calculateMultiplication(arr);
		ArrayUtil.print(arr);
	}
	private static void calculateMultiplication(int []arr){
		int pre=1;
		for(int i=0;i<arr.length;i++){
			int mult=0;
			if(i==arr.length-1){
				mult=pre*1;
			}else
			mult=pre*arr[i+1];
			pre=arr[i];
			arr[i]=mult;
		}
	}
}
