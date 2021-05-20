package com.rahul.dataStructure.hashing;

import java.util.HashMap;
import java.util.Map;

public class SymmetricPair {
	public static void main(String[] args) {
		int[][] arr={{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<5;i++){
			int a=arr[i][0];
			int b=arr[i][1];
			if(map.containsKey(b) && a==map.get(b)){
				System.out.println(b+" "+a);
			}else {
				map.put(a,b);
			}
		}
	}
}
