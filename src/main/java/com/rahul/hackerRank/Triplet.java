package com.rahul.hackerRank;

import java.util.HashSet;
import java.util.Set;

public class Triplet {
	public static void main(String[] args) {
		int[] arr={1, 2, 4, 5, 7, 8, 10};
		int d=3;
		System.out.println(beautifulTriplets( d,  arr));
	}

	static int beautifulTriplets(int d, int[] arr) {
		Set<Integer>  set= new HashSet<>();
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		int count=0;
		for(int i=0;i<arr.length-2;i++){
			int a=arr[i];
			int b=a+d;
			int c=b+d;
			if(set.contains(b) && set.contains(c)){
				count++;
			}
		}
		return count;
	}
}
