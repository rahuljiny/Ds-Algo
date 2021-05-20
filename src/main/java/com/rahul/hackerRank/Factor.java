package com.rahul.hackerRank;

import java.util.Arrays;
import java.util.List;

public class Factor {
	public static void main(String[] args) {
		Integer[] arr1={100, 99, 98, 97, 96, 95, 94, 93, 92, 91};
		List<Integer> a = Arrays.asList(arr1);
		Integer[] arr2={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> b = Arrays.asList(arr1);
		System.out.println(getTotalX( a,  b));
	}

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		long lcm=getLcm(a);
		long hcf=getHcf(b);
		int count=0;
		for(long i=lcm;i<=hcf;i++){
			if(i%lcm==0 && hcf%i==0){
				count++;
			}
		}
		return count;
	}

	static long hcf(long a, long b)
	{
		if (a == 0)
			return b;
		return hcf(b % a, a);
	}

	static long lcm(long a, long b)
	{
		return (a*b)/hcf(a, b);
	}

	private static long getHcf(List<Integer> b){
		long hcf=b.get(0);
		for(int i=1;i<b.size();i++){
			long num1=b.get(i);
			hcf=hcf(hcf,num1);
		}
		return hcf;
	}
	private static long getLcm(List<Integer> a){
		long lcm=a.get(0);
		for(int i=1;i<a.size();i++){
			int num1=a.get(i);
			lcm=lcm(lcm,num1);
		}
		return lcm;
	}
}
