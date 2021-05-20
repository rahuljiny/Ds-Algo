package com.rahul.dataStructure.heap;

public class Derangement {
	public static void main(String[] args){
		int length=5;
		int arr[]= new int[length+1];
		for(int i=1;i<=length;i++){
			arr[i]=i;
		}
		printArray(arr);
		derangement(arr,length);
		printArray(arr);

	}

	private static void derangement(int []arr,int length){
		for(int i=1;i<=length;i=i+2){
			if(i==length){
				swap(arr,i,i-1);
			}
			else {
				swap(arr,i,i+1);
			}
		}
	}

	private static void printArray(int[] arr){
		for(int i=1;i<arr.length;i++){
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	private static void swap(int[] arr,int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
