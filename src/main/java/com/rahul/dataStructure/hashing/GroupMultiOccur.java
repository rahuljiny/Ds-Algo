package com.rahul.dataStructure.hashing;

import java.util.LinkedHashMap;
import java.util.Map;

public class GroupMultiOccur {
	public static void main(String[] args) {
		int[] arr={4, 6, 9, 2, 3, 4, 9, 6, 10, 4};
		Map<Integer, Integer> map= new LinkedHashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1);
			}else map.put(arr[i],1);
		}
		for(Integer int1:map.keySet()){
			Integer k = map.get(int1);
			if(k>0){
				for(int j=0;j<k;j++){
					System.out.print(int1+" ");
				}
			}
		}
	}
}
