package com.rahul.dataStructure.heap;

import java.util.PriorityQueue;

public class DigitSum {
	public static void main (String[] args){
		int arr[] = {6, 8, 4, 5, 2, 3};
		System.out.println("The required sum is "+ solve(arr));
	}

	private static int solve(int[] arr){
		PriorityQueue pq= new PriorityQueue();
		for(int i=0;i<arr.length;i++){
			pq.add(arr[i]);
		}
		int dig1=0,dig2=0;
		for(int j=0;j<pq.size();j++){
			int num=(int)pq.poll();
			if(j%2==0){
				dig1=dig1*10+num;
			}else {
				dig2=dig2*10+num;
			}
		}
		return dig1+dig2;
	}
}
