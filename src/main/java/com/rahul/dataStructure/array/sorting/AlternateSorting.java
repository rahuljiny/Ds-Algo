package com.rahul.dataStructure.array.sorting;

import java.util.Arrays;

public class AlternateSorting {

	public static void main(String[] args) {
		int[] arr={7, 1, 2, 3, 4, 5, 6};
		printAlternateSorting(arr);
	}
	private static void printAlternateSorting(int[] arr){
		Arrays.sort(arr);
		int start=0;
		int end=arr.length-1;
		while (start<end){
			System.out.print(arr[end]);
			System.out.print(" ");
			System.out.print(arr[start]);
			System.out.print(" ");
			end--;
			start++;
		}
		if(start==end){
			System.out.println(arr[start]);
		}
	}
}
