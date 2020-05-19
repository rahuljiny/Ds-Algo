package com.rahul.dataStructure.heap;

public class MinimumCostRope {
	public static void main(String[] args) {
		int arr[] = {4,3,2,6};
		int cost=findCost(arr);
		System.out.println("Minimum cost is "+cost);
	}

	private static int findCost(int[] arr){
		int sum=0;
		int n= arr.length;
		for(int i=(n-1)/2;i>=0;i--){
			heapify(arr,n,i);
		}
		for(int j=n-1;j>0;j--){
			int a=arr[0];
			arr[0]=arr[j];
			heapify(arr,n,(j-1)/2);
			int b=arr[0];
			sum=a+b;
			arr[0]=sum;
			heapify(arr,n,(j-1)/2);
		}
		return sum;
	}

	private static void heapify(int[] arr,int n,int i){
		int smallest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[l]<arr[i])
			smallest=l;
		if(r<n && arr[r]<arr[i])
			smallest=r;
		if(smallest!=i){
			swap(arr,smallest,i);
			heapify(arr,n,smallest);
		}

	}
	private static void swap(int[] arr,int smallest,int i){
		int temp=arr[i];
		arr[i]=arr[smallest];
		arr[smallest]=temp;
	}
}
