package com.rahul.hackerRank;

public class ValleyCount {
	public static void main(String[] args) {
		String s="UDDDUDUU";
		int n=s.length();
		System.out.println(countingValleys(n, s));
	}

	static int countingValleys(int n, String s) {
		int curr=0;
		int valley=0;
		for(int i=0;i<n;i++){
			if(s.charAt(i)=='U'){
				curr++;
			} else if(s.charAt(i)=='D'){
				if(curr==0){
					valley++;
				}
				curr--;
			}
		}
		return valley;
	}
}
