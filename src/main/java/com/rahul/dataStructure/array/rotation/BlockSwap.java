package com.rahul.dataStructure.array.rotation;

import com.rahul.dataStructure.array.OneDimension;

import java.util.Random;

public class BlockSwap {
	static int count=0;
	public static void main(String[] args) {
		Random random= new Random();
		for(int k=0;k<(10+random.nextInt(10));k++){
			int d=1+random.nextInt(10)+random.nextInt(10);
			System.out.println("value of d is "+d);
			OneDimension oneDimension= new OneDimension(d+random.nextInt(10),true);
			blockSwapRotate(oneDimension.getArr(),0,  d,  oneDimension.getArr().length);
			oneDimension.print();
			System.out.println();
		}
	}

	private static void blockSwapRotate(int arr[],int i, int d, int n){
		if(d==0|| d==n)
			return;
		else if(d==n-d){
			swap(arr,i,(n+i-d),d);
		}
		else if(d<n-d){
			swap(arr,i,n-d+i,d);
			blockSwapRotate(arr,i,d,n-d);
		}else {
			swap(arr,i,d+i,n-d);
			blockSwapRotate(arr, n - d + i, 2*d-n, d);
		}

	}
	private static void swap(int arr[], int fi, int si,int d){
		for( int i=0;i<d;i++){
			int temp=arr[fi+i];
			arr[fi+i]=arr[si+i];
			arr[si+i]=temp;
		}
	}
}
