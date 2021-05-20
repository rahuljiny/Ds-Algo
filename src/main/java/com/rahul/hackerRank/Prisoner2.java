package com.rahul.hackerRank;

public class Prisoner2 {
	public static void main(String[] args) {
		System.out.println(saveThePrisoner(3, 7, 3));
	}
	static int saveThePrisoner(int n, int m, int s) {
		int mod=0;
		if(m>n){
			int left=m%n;
			 mod= (left+s-1)%n;
		}else if(m<n){
			 mod= (m+s-1)%n;
		}else {
			mod= (n+s-1)%n;
		}
		if(mod==0){
			return n;
		}
		return mod;
	}
}
