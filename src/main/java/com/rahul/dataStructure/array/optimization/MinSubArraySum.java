package com.rahul.dataStructure.array.optimization;

public class MinSubArraySum {
	public static void main(String[] args) {
		int arr[]={1, 4, 45, 6, 0, 19};
		int n=arr.length;
		int k=5;
		int minSubArray= findMinSubArray(arr,n,k);
		System.out.println(minSubArray);
	}

	private static int findMinSubArray(int[] arr,int n,int k){

		int start=0,end=0;
		int current_sum=0;
		int min_len=Integer.MAX_VALUE;
		while (end<n){
			while (current_sum<=k && end<n){
				current_sum+=arr[end++];
			}
			while (current_sum>=k && start<n){
				if(end-start<min_len)
					min_len=end-start;
				current_sum-=arr[start++];
			}
		}
		return min_len;
	}
}
