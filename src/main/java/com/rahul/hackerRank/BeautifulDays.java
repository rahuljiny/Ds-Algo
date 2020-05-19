package com.rahul.hackerRank;

public class BeautifulDays {
	public static void main(String[] args) {
		System.out.println(beautifulDays( 20,  23,  6));
	}

	static int beautifulDays(int i, int j, int k) {
		int count=0;
		for(int a=i;a<=j;a++){
			if(isBeautiful(a,k)){
				count++;
			}
		}
		return count;
	}
	private static boolean isBeautiful(int a,int k){
		int reverse=0;
		int temp=a;
		while (temp>0){
			reverse=reverse*10+(temp%10);
			temp=temp/10;
		}
		return (Math.abs(a-reverse))%k==0;
	}
}
