package com.rahul.dataStructure.array.rotation;

public class MaxSumRotation {
	public static void main(String[] args) {
		int[] arr={1, 20, 2, 10};
		int maxSum=findMaxSum(arr);
		System.out.println(maxSum);
	}
	private static int findMaxSum(int[] arr){
		int arrSum=0,maxSum=0,currVal=0;
		for(int i=0;i<arr.length;i++){
			arrSum=arrSum+arr[i];
			currVal=currVal+(i*arr[i]);
		}
		maxSum=currVal;
		for(int j=1;j<arr.length-1;j++){
			currVal=currVal+arrSum-(arr.length*arr[arr.length-j]);
			if(maxSum<currVal)
				maxSum=currVal;
		}
		return maxSum;
	}
}
