package com.rahul.hackerRank;

public class Halloween {

	public static void main(String[] args) {
		System.out.println(howManyGames(20,  3,6, 80));
	}

	static int howManyGames(int p, int d, int m, int s) {
		int count=0;
		while (s>0){
			if(p>m){
				s=s-p;
				p=p-d;
			}else {
				s=s-m;
			}
			count++;
		}return s<0?count-1:count;
	}
}
