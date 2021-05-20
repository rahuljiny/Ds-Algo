package com.rahul.dataStructure.array.optimization;

public class MaxSubArrayAverage {
	public static void main(String[] args) {
		int []arr={1, 12, -5, -6, 50, 3};
		int k = 4;
		int maxAverage=findMaxAverage(arr,k);
	}

	private static int findMaxAverage(int[] arr,int k){

		int sum=0;
		for(int i=0;i<k;i++){
			sum+=arr[i];
		}
		int max_ave=sum/k;
		for(int i=1;i<arr.length-k+1;i++){
			sum=sum-arr[i-1]+arr[i+k-1];
			max_ave=Math.max(max_ave,sum/k);
		}
		return max_ave;
	}
}
