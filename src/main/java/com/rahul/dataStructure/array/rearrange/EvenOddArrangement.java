package com.rahul.dataStructure.array.rearrange;

import com.rahul.dataStructure.array.util.ArrayUtil;

public class EvenOddArrangement {
	public static void main(String[] args) {
		int[] arr={1, 2, 3, 4, 5, 6, 7};
		rearrange(arr);
	}
	 private static void rearrange(int[] arr){
		int[] arr2=new int[arr.length];
		for(int x=0;x<arr.length;x++){
			arr2[x]=arr[x];
		}
		 mergeSort(arr2,0,arr2.length-1);
		 ArrayUtil.print(arr2);
		 int mid=((arr2.length-1)/2);
		 int j=mid;
		 for(int i=0;i<arr.length;){
		 	arr[i]=arr2[j];
		 	i=i+2;
		 	j--;
		 }
		 int k=mid+1;
		 for(int i=1;i<arr.length;){
			 arr[i]=arr2[k];
			 i=i+2;
			 k++;
		 }
		 ArrayUtil.print(arr);
	}

	private static void mergeSort(int[] arr, int low,int high){
		if(low<high){
			int mid=(low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	private static void merge(int[] arr,int low, int mid, int high){
		int n1=mid-low+1;
		int n2=high-mid;
		int[] l1= new int[n1];
		int[] l2= new int[n2];
		for(int i=0;i<n1;i++){
			l1[i]=arr[low+i];
		}
		for(int j=0;j<n2;j++){
			l2[j]=arr[mid+1+j];
		}
		int i=0,j=0,k=low;
		while (i<n1 && j<n2){
			if(l1[i]<l2[j]){
				arr[k]=l1[i];
				i++;
			}else {
				arr[k]=l2[j];
				j++;
			}
			k++;
		}
		while (i<n1){
			arr[k]=l1[i];
			i++;
			k++;
		}
		while (j<n2){
			arr[k]=l2[j];
			j++;
			k++;
		}

	}
}
