package com.rahul.hackerRank;

public class InfiniteString {

	public static void main(String[] args) {
		String s="abcac";
		long n=10;
		System.out.println(repeatedString( s,  n));
	}

	static long repeatedString(String s, long n) {
		long len=s.length();
		long times=n/len;
		long remaining=n%len;
		long singleCount=0;
		long RemainingCount=0;
		for(int i=0;i<len;i++){
			if(s.charAt(i)=='a'){
				singleCount++;
			}
			if((i+1)==remaining){
				RemainingCount=singleCount;
			}
		}
		return (times*singleCount)+RemainingCount;
	}
}
