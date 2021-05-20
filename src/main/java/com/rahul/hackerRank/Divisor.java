package com.rahul.hackerRank;

public class Divisor {
	public static void main(String[] args) {
		System.out.println(findDigits(123456789));
	}

	static int findDigits(int n) {
		int count=0;
		int copy=n;
		while (copy>0){
			int rem=copy%10;
			if(rem!=0 && n%rem==0){
				count++;
			}
			copy=copy/10;
		}
		return count;
	}
}

