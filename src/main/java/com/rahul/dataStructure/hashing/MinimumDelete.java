package com.rahul.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class MinimumDelete {

	public static void main(String[] args) {
		int[] arr={1, 2, 3, 4, 5};
		Map<Integer,Integer> map=new HashMap<>();
		for (int i=0;i<arr.length;i++){
			if(map.get(arr[i])==null){
				map.put(arr[i],1);
			}else
			map.put(arr[i],map.get(arr[i])+1);
		}
		int max=Integer.MIN_VALUE;
		for(Integer num:map.keySet()){
			if(map.get(num)>max){
				max=map.get(num).intValue();
			}
		}
		System.out.println(arr.length-max);
	}
}
