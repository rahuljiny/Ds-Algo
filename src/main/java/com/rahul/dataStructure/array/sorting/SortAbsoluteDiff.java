package com.rahul.dataStructure.array.sorting;

import com.rahul.dataStructure.array.util.ArrayUtil;

import java.util.Arrays;

public class SortAbsoluteDiff {
	public static void main(String[] args){
		int[] arr={10, 5, 3, 9, 2};
		int x=7;
		printSortedArray(arr,x);
	}
	private static void printSortedArray(int[]arr,int x){
		int[] absArr=new int[arr.length+1];
		Arrays.sort(arr);
		for (int i=0;i<arr.length;i++){
			absArr[i]=arr[i];
		}
		int index=insertX(absArr,x);
		ArrayUtil.print(absArr);
		int pre=index-1,next=index+1;
		while (pre>=0 && next<absArr.length){
			if(Math.abs(x-absArr[pre])<=Math.abs(x-absArr[next])){
				System.out.println(absArr[pre]);
				pre--;
			}else{
				System.out.println(absArr[next]);
				next++;
			}
		}
		while (pre>=0 ){
			System.out.println(absArr[pre]);
			pre--;
		}
		while (next<absArr.length ){
			System.out.println(absArr[next]);
			next++;
		}
	}
	private static int insertX(int[] absArr,int x){
		int n=absArr.length-2;
		while (absArr[n]>x){
			absArr[n+1]=absArr[n];
			n--;
		}
		absArr[n+1]=x;
		return n+1;
	}
}
