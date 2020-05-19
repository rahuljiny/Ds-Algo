package com.rahul.hackerRank;

import java.util.Arrays;
import java.util.List;

public class BirthDayChocolate {
	public static void main(String[] args) {
		Integer arr[]={4};
		List<Integer> s= Arrays.asList(arr);
		int d=4;
		int m=1;
		System.out.println(birthday(s, d, m));
	}

	static int birthday(List<Integer> s, int d, int m) {
		int count =0;
		int sum=0;
		for(int i=0;i<m;i++){
			sum+=s.get(i);
		}
		if(sum==d){
			count++;
		}
		for(int i=m;i<s.size();i++){
			sum=sum+s.get(i)-s.get(i-m);
			if(sum==d){
				count++;
			}
		}
		return count;
	}
}
