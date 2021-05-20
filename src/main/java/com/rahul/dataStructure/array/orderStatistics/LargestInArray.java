package com.rahul.dataStructure.array.orderStatistics;

public class LargestInArray {
	public static void main(String[] args) {
		int []arr={20, 10, 20, 4, 100};
		int largest=findLargest(arr);
		System.out.println(largest);
	}

	private static int findLargest(int[] arr){
		int largest= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				largest=arr[i];
			}
		}
		return largest;
	}
}
