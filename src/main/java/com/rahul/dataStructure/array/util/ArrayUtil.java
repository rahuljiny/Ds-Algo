package com.rahul.dataStructure.array.util;

import com.rahul.dataStructure.array.OneDimension;

public class ArrayUtil {

	public static void print(int[] arr){
		if(arr!=null){
			for (int i=0;i<arr.length;i++){
				System.out.print(arr[i] +" ");
			}
			System.out.println(" ");
		}
	}

	public static void print(OneDimension[] arr){
		if(arr!=null){
			for (int i=0;i<arr.length;i++){
				print(arr[i].getArr());
			}
			System.out.println(" ");
		}
	}
}
