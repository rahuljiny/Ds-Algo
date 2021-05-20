package com.rahul.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class MaximumDistance {
	public static void main(String[] args) {
		int[] arr={3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
		int max=Integer.MIN_VALUE;
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.get(arr[i])==null){
				map.put(arr[i],i);
			}else{
				int diff = i-map.get(arr[i]).intValue();
				if(diff>max)
					max=diff;
			}
		}
		System.out.println(max);
	}
}
