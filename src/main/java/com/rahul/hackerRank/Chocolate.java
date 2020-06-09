package com.rahul.hackerRank;

public class Chocolate {

	public static void main(String[] args) {
		System.out.println(chocolateFeast(10,  2,  5) );
	}

	static int chocolateFeast(int n, int c, int m) {
		int chocolate=n/c;
		int wrapper=chocolate;
		while (wrapper>=m){
			int exchange=wrapper/m;
			wrapper=wrapper%m;
			chocolate+=exchange;
			wrapper+=exchange;
		}
		return chocolate;
	}
}
