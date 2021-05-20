package com.rahul.hackerRank;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		extraLongFactorials(25);
	}

	static void extraLongFactorials(int n) {
		System.out.println(factorial(n));
	}

	private static BigInteger factorial(int n){
		if(n==1)
			return new BigInteger(String.valueOf(1));
		return new BigInteger(String.valueOf(n)).multiply(factorial(n-1));
	}
}
