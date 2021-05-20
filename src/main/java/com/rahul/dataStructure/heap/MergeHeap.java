package com.rahul.dataStructure.heap;

public class MergeHeap {
	public static void main(String[] args) {
		int[] a = {10, 5, 6, 2};
		int[] b = {12, 7, 9};
		int n = a.length;
		int m = b.length;

		int[] merged = new int[m + n];

		mergeHeaps(merged, a, b, n, m);

		for (int i = 0; i < m + n; i++)
			System.out.print(merged[i] + " ");
		System.out.println();
	}

	private static void mergeHeaps(int[] merged, int[] a, int[] b, int n, int m){
		int len=n+m;
		for(int i=0;i<n;i++){
			merged[i]=a[i];
		}
		for(int j=0;j<m;j++){
			merged[n+j]=b[j];
		}
		for(int k=(n+m-1)/2;k>=0;k--){
			maxHeapify(merged,len,k);
		}
	}
	private static void maxHeapify(int[] merged,int len,int k){
		if(k>len)
			return;
		int largest=k;
		int left=2*k+1;
		int right=2*k+2;
		if(left<len && merged[largest]<merged[left])
			largest=left;
		if(right<len &&merged[largest]<merged[right])
			largest=right;
		if(largest!=k){
			swap(merged,largest,k);
			maxHeapify(merged,len,largest);
		}
	}
	private static void swap(int[] merged,int largest,int k){
		int temp=merged[largest];
		merged[largest]=merged[k];
		merged[k]=temp;
	}
}
