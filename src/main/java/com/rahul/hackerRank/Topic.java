package com.rahul.hackerRank;

import java.util.HashMap;
import java.util.Map;

public class Topic {
	public static void main(String[] args) {
		String[] topic={"10101","11100","11010","00101"};
		int[] ints = acmTeam(topic);
		for(int i=0;i<2;i++){
			System.out.println(ints[i]);
		}
	}

	static int[] acmTeam(String[] topic) {
		int n=topic.length;
		int[] response=new int[2];
		Map<Integer, Integer> map=new HashMap<>();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				int count=findCount(topic[i],topic[j]);
				if(map.containsKey(count)){
					map.put(count,map.get(count)+1);
					if(max<count)
						max=count;
				}else {
					map.put(count,1);
					if(max<count)
						max=count;
				}
			}
		}
		response[0]=max;
		response[1]=map.get(max);
		return response;
	}
	private static int findCount(String str1,String str2){
		int count=0;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)=='1' ||str2.charAt(i)=='1') count++;
		}
		return count;
	}
}
