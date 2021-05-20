package com.rahul.dataStructure.array.orderStatistics;

import com.rahul.dataStructure.array.util.ArrayUtil;

public class FindKthSmallest {
	public static void main(String[] args) {
		int arr[]={7, 10, 4, 3, 20, 15};
		int k=3;
		mergeSort(arr,0,arr.length-1);
		ArrayUtil.print(arr);
		System.out.println(arr[k-1]);
	}
	private static void mergeSort(int[] arr,int low, int high){
		if(low<high){
			int mid=(high+low)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}

	private static void merge(int[] arr,int low, int mid, int high){
		int n1=mid+1-low;
		int n2=high-mid;
		int m=low,n=mid+1;
		int[] l1=new int[n1];
		int[] l2= new int[n2];
		for(int i= 0;i<n1;i++){
			l1[i]=arr[m];
			m++;
		}
		for(int j= 0;j<n2;j++){
			l2[j]=arr[n];
			n++;
		}
		int i=0,j=0,k=low;
		while (i<n1 && j<n2){
			if(l1[i]<=l2[j]){
				arr[k++]=l1[i];
				i++;
			}else if(l1[i]>l2[j]){
				arr[k++]=l2[j];
				j++;
			}
		}
		while (i<n1){
			arr[k++]=l1[i];
			i++;
		}
		while(j<n2){
			arr[k++]=l2[j];
			j++;
		}
	}
}
