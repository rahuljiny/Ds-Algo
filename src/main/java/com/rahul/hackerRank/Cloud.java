package com.rahul.hackerRank;

public class Cloud {
	public static void main(String[] args) {
		int arr[]={0, 0, 1, 0, 0, 1, 0};
		System.out.println(jumpingOnClouds(arr));
	}
	static int jumpingOnClouds(int[] c) {
		int count=0;
		int i=0;
		while (i<c.length){
			if(i==c.length-1)
				return count;
			if((i+2)<c.length && c[i+2]==0){
				i=i+2;
			}else{
				i=i+1;
			}
			count++;
		}
		return count;
	}
}
