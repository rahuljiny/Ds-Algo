package com.rahul.hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickNumber {
	public static void main(String[] args) {
		Integer arr[]={4,2,3,4,4,9,98,98,3,3,3,4,2,98,1,98,98,1,1,4,98,2,98,3,9,9,3,1,4,1,98,9,9,2,9,4,2,2,9,98,4,98,1,3,4,9,1,98,98,4,2,3,98,98,1,99,9,98,98,3,98,98,4,98,2,98,4,2,1,1,9,2,4};
		List<Integer> a = Arrays.asList(arr);
		System.out.println(pickingNumbers(a));
	}

	public static int pickingNumbers(List<Integer> a) {
		Map<Integer,Integer> map= new HashMap<>();
		int max=0,maxKey=0;
		for(Integer val:a){
			if(map.containsKey(val)){
				map.put(val,map.get(val)+1);
			}else {
				map.put(val,1);
			}
		}
		for(Integer val:map.keySet()){
			if(map.get(val)>=max){
				max=map.get(val);
				maxKey=val;
			}
		}
		int x=map.containsKey(maxKey-1)?map.get(maxKey-1):0;
		int y=map.containsKey(maxKey+1)?map.get(maxKey+1):0;
		if(maxKey==98){
			return 1+max+Math.max(x,y);
		}
		return max+Math.max(x,y);
	}
}
