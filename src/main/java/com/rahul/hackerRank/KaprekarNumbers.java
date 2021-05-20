package com.rahul.hackerRank;

import org.apache.commons.lang3.StringUtils;

public class KaprekarNumbers {
	public static void main(String[] args) {
		int p=1;
		int q=99999;
		kaprekarNumbers(p,q);
	}

	static void kaprekarNumbers(int p, int q) {
		int count=0;
		for(int i=p;i<=q;i++){
			if(iskaprekar(i)){
				System.out.print(i+" ");
				count++;
			}
		}
		if(count==0){
			System.out.print("INVALID RANGE");
		}
	}

	private static boolean iskaprekar(int i){
		boolean result=true;
		long sqr=(long)i*(long)i;
		String str=String.valueOf(sqr);
		int n=str.length();
		int a=0,b=0;
		String left = str.substring(0, n / 2);
		if(!"".equalsIgnoreCase(left)){
			a=Integer.parseInt(left);
		}
		String right = str.substring(n / 2, n);
		if(!"".equalsIgnoreCase(right)){
			b=Integer.parseInt(right);
		}
		return (a+b)==i;
	}
}
