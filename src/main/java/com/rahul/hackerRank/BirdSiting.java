package com.rahul.hackerRank;

import java.util.*;

public class BirdSiting {
	public static void main(String[] args) {
		Integer ar[]= {1,1,2,2,3};
		List<Integer> arr= Arrays.asList(ar);
		System.out.println(migratoryBirds(arr));
	}
	static int migratoryBirds(List<Integer> arr) {
		Map<Integer,Integer> map=new TreeMap<>();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.size();i++){
			if(map.containsKey(arr.get(i))){
				map.put(arr.get(i),map.get(arr.get(i))+1);
				if(max<=map.get(arr.get(i))){
					max=map.get(arr.get(i));
				}
			}else {
				map.put(arr.get(i),1);
				if(max<=1){
					max=1;
				}
			}
		}
		int bird=Integer.MAX_VALUE;
		for(Integer key:map.keySet()){
			if(map.get(key)==max){
				if(bird>key)
					bird=key;
			}
		}
		return bird;
	}
}
