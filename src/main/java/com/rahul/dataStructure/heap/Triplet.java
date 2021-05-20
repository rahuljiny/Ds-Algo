package com.rahul.dataStructure.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Triplet {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		PriorityQueue priorityQueue= new PriorityQueue(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++){
			priorityQueue.add(arr[i]);
			if(priorityQueue.size()<3){
				System.out.print("-1 ");
			}else {
				int x=(int)priorityQueue.poll();
				int y=(int)priorityQueue.poll();
				int z=(int)priorityQueue.poll();
				System.out.print(x*y*z +" ");
				priorityQueue.add(x);
				priorityQueue.add(y);
				priorityQueue.add(z);
			}
		}
	}
}
