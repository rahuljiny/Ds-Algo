package com.rahul.hackerRank;

import java.util.*;

public class SubSet {
	public static void main(String[] args) {
		int k = 7;
		//Integer[] arr = {1, 7, 2, 4};
		Integer[] arr = {422346306, 940894801, 696810740, 862741861, 85835055, 313720373};
		System.out.println(nonDivisibleSubset(k, Arrays.asList(arr)));
	}

	public static int nonDivisibleSubset(int k, List<Integer> s) {
		int maxSize = 0;
		Map<Integer,Integer> map= new HashMap();
		for (int i = 0; i < s.size(); i++) {
			int x = s.get(i) % k;
			if(x==0 || (k%2==0 && k/2==x)){
				map.put(x,1);
			}else {
				if(map.containsKey(x))
					map.put(x,map.get(x)+1);
				else map.put(x,1);
			}
		}
		for(int i=0;i<=k/2;i++){
			Integer a=map.get(i);
			Integer b=map.get(k-i);
			if(a!=null && b!=null){
				maxSize+=Math.max(a,b);
			}
			else if(a!=null){
				maxSize+=a;
			}
			else if(b!=null){
				maxSize+=b;
			}
		}
		return maxSize;
	}
}
