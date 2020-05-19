package com.rahul.dataStructure.queue;

import java.util.PriorityQueue;

public class RopeCost {
	public static void main(String[] args) {
		int arr[]={4,3,2,6};
		int cost=findCost(arr);
		System.out.println("Cost of Joining rope "+cost);
	}
	private static int findCost(int[] arr){
		PriorityQueue priorityQueue= new PriorityQueue();
		int res=0;
		for(int i=0;i<arr.length;i++){
			priorityQueue.add(arr[i]);
		}
		while (priorityQueue.size()>1){
			int min=(int)priorityQueue.poll();
			int sec_min=(int)priorityQueue.poll();
			int sum=min+sec_min;
			res+=sum;
			priorityQueue.add(sum);
		}
		return res;
	}
}
