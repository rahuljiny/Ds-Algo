package com.rahul.hackerRank;

public class Advertisement {
	public static void main(String[] args) {
		System.out.println( viralAdvertising(5));
	}

	static int viralAdvertising(int n) {
		int shared=5;
		int cumulative=0;
		int day=1;
		while (day<=n){
			int liked=shared/2;
			cumulative=cumulative+liked;
			shared=liked*3;
			day++;
		}
		return cumulative;
	}

}
