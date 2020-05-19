package com.rahul.hackerRank;

public class Utopia {
	public static void main(String[] args) {
		int n=5;
		System.out.println(utopianTree(n));
	}

	static int utopianTree(int n) {
		int k=1;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				k+=1;
			}else {
				k*=2;
			}
		}
		return k;
	}
}
