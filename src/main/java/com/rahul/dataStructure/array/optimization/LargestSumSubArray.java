package com.rahul.dataStructure.array.optimization;

public class LargestSumSubArray {
	public static void main(String[] args) {
		int[] arr={-2, -3, 4, -1, -2, 1, 5, -3};
		int sum= largestSum(arr);
		System.out.println(sum);
		sum=largestSumDynamic(arr);
		System.out.println(sum);
	}

	private static int largestSum(int[] arr){
		int maxSoFar=0;
		int maxEndingHere=0;
		for(int i=0;i<arr.length;i++){
			maxEndingHere=maxEndingHere+arr[i];
			if(maxEndingHere<0){
				maxEndingHere=0;
			}
			if(maxSoFar<maxEndingHere){
				maxSoFar=maxEndingHere;
			}
		}
		return maxSoFar;
	}

	private static int largestSumDynamic(int[] arr){
		int maxSoFar=arr[0];
		int currentMax=arr[0];
		for(int i=0;i<arr.length;i++){
			currentMax=Math.max(arr[i],currentMax+arr[i]);
			maxSoFar=Math.max(maxSoFar,currentMax);
		}
		return maxSoFar;
	}
}
