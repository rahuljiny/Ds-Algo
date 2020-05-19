package com.rahul.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class SmallestSubArray {

	public static void main(String[] args) {
		int[] arr={4, 1, 1, 2, 2, 1, 3, 3};
		Map<Integer,Inner> map= new HashMap<>();
		int max=Integer.MIN_VALUE,maxNum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			Inner inner;
			if(map.containsKey(arr[i])){
				inner=map.get(arr[i]);
				inner.freq+=1;
				inner.endAt=i;
				map.put(arr[i],inner);
			}else{
				inner= new Inner();
				inner.startAt=i;
				inner.endAt=i;
				inner.freq=1;
				map.put(arr[i],inner);
			}
			if(max<inner.freq){
				max=inner.freq;
				maxNum=arr[i];
			}
		}
		Inner inner=map.get(maxNum);
		for(int j=inner.startAt;j<=inner.endAt;j++){
			System.out.print(arr[j]+" ");
		}
	}
	private static class Inner{
		int startAt;
		int endAt;
		int freq;
	}
}
