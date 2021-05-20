package com.rahul.hackerRank;

import java.util.HashMap;
import java.util.Map;

public class ContainerArrangement {
	public static void main(String[] args) {
		int[][] container={{1,1},{1,1}};
		System.out.println(organizingContainers(container));
	}

	static String organizingContainers(int[][] container) {
		Map<Long,Integer> containerMap=new HashMap<>();
		Map<Long,Integer> ballMap=new HashMap<>();
		long n=container[0].length;
		for(int i=0;i<n;i++){
			long containerSum=0,ballSum=0;
			for(int j=0;j<n;j++){
				long containerValue=container[i][j];
				long ballValue=container[j][i];
				containerSum+=containerValue;
				ballSum+=ballValue;
			}
			if(containerMap.containsKey(containerSum)){
				containerMap.put(containerSum,containerMap.get(containerSum)+1);
			}else {
				containerMap.put(containerSum,1);
			}
			if(ballMap.containsKey(ballSum)){
				ballMap.put(ballSum,ballMap.get(ballSum)+1);
			}else {
				ballMap.put(ballSum,1);
			}
		}
		for(Long key:containerMap.keySet()){
			if(!ballMap.containsKey(key) || containerMap.get(key)!=ballMap.get(key)){
				return "Impossible";
			}
		}
		for(Long key:ballMap.keySet()){
			if(!containerMap.containsKey(key) || ballMap.get(key)!=containerMap.get(key)){
				return "Impossible";
			}
		}
		return "Possible";
	}
}
