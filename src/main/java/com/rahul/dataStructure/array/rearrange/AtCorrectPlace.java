package com.rahul.dataStructure.array.rearrange;

import com.rahul.dataStructure.array.util.ArrayUtil;

public class AtCorrectPlace {
	public static void main(String[] args) {
		int[] arr={-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
		rearrangeArray(arr);
		ArrayUtil.print(arr);
	}

	private static void rearrangeArray(int[] arr){
		for (int i=0;i<arr.length; i++){
			if(arr[i]!=-1 && arr[i]!=i){
				arr[i]=i;
			}
		}
	}
}

