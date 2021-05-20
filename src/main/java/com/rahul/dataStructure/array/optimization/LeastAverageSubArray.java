package com.rahul.dataStructure.array.optimization;

public class LeastAverageSubArray {

	public static void main(String[] args) {
		int arr[]={3, 7, 90, 20, 10, 50, 40};
		int k=4;
		int leastAverage=findLeastAverage(arr,k);
		System.out.println(leastAverage);
	}

	private static int findLeastAverage(int[] arr,int k){
		int sum=0;
		int minSum;
		for(int i=0;i<k;i++){
			 sum=sum+arr[i];
		}
		minSum=sum;
		for(int j=k;j<arr.length;j++){
			sum=sum+arr[j]-arr[j-k];
			minSum=Math.min(sum,minSum);
		}
		return minSum/k;
	}
}
