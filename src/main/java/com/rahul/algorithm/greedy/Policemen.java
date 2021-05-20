package com.rahul.algorithm.greedy;

public class Policemen {

	public static void main(String args[])
	{
		int k, n;
		char arr1[] =new char[] { 'P', 'T', 'T', 'P', 'T' };
		k = 2;
		n = arr1.length;
		System.out.println("Maximum thieves caught: " +policeThief(arr1, n, k));
	}

	private static int policeThief(char[]arr, int n, int k){
		int count=0,p=0,t=0;
		while (p<n && t<n){
			while (p<n &&arr[p]!='P'){
				p++;
			}
			while (t<n && arr[t]!='T'){
				t++;
			}
			if(p<n && t<n && arr[p]=='P' && arr[t]=='T' && Math.abs(p-t)<=k){
				count++;
				p++;
				t++;
			}
			else {
				if(p>t){
					t++;
				}else {
					p++;
				}
			}
		}
		return count;
	}
}
