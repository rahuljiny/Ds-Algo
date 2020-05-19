package com.rahul.dataStructure.array.optimization;

public class MaxProfit {

	public static void main(String[] args) {
		int[] arr={10, 22, 5, 75, 65, 80};
		int profit=getMaxProfit(arr);
		System.out.println(profit);
	}
	private static int getMaxProfit(int[] arr){
		int maxProfit=0;
		for (int i=0;i<arr.length;i++){
			int profit= getMaxProfitSubArray(arr,0,i)+getMaxProfitSubArray(arr,i+1,arr.length-1);
			maxProfit=Math.max(profit,maxProfit);
		}
		return maxProfit;
	}
	private static int getMaxProfitSubArray(int[] arr,int start,int end){
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		while (start<end){
			if(arr[start]<min)
				min=arr[start];
			if(arr[end]>max)
				max=arr[end];
			start++;
			end--;
		}
		if(start!=end){
			return max-min;
		}
		return 0;
	}
}
