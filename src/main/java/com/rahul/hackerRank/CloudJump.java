package com.rahul.hackerRank;

public class CloudJump {

	public static void main(String[] args) {
		int arr[]={0, 0, 1, 0, 0, 1, 1, 0};
		int k=2;
		System.out.println(jumpingOnClouds(arr,k));
	}

	private static int jumpingOnClouds(int[] arr,int k){
		int n=arr.length;
		int e=100;
		int thunder=0;
		int jump=0;
		for(int i=0;i<n;i+=k){
			if(arr[i]==1){
				thunder++;
			}
			jump++;
		}
		return e-(2*thunder+jump);
	}
}
