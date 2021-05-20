package com.rahul.dataStructure.heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaxKNumber {
	public static void main(String[] args) {
		int [] arr={3, 1, 4, 4, 5, 2, 6, 1};
		int k=2;
		displayMaxKNumber(arr,k);
	}
	private static void displayMaxKNumber(int[] arr,int k){
		Map<Integer,Integer> map= new HashMap<>();
		PriorityQueue<Map.Entry> queue= new PriorityQueue(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Map.Entry e1= (Map.Entry)o1;
				Map.Entry e2= (Map.Entry)o2;
				int first=(int)e1.getValue();
				int second=(int)e2.getValue();
				if(first>second)
					return -1;
				if(first<second)
					return 1;
				else{
					if((int)e1.getKey()-(int)e2.getKey()>0)
						return -1;
					else return 1;
				}
			}
		});
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],(map.get(arr[i])+1));
			}else {
				map.put(arr[i],1);
			}
		}
		for(Map.Entry entry:map.entrySet()){
			queue.add(entry);
		}
		for(int j=0;j<k;j++){
			Map.Entry e=queue.poll();
			int value=(int)e.getKey();
			System.out.println(value+" ");
		}
	}
}
