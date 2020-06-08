package com.rahul.hackerRank;

public class StringConversion {
	public static void main(String[] args) {

		String s="hackerhappy";
		String t="hackerrank";
		int k=9;
		System.out.println(appendAndDelete( s,  t,  k));
	}

	static String appendAndDelete(String s, String t, int k) {
		int i=0;
		int sn=s.length();
		int tn=t.length();
		while (i<sn && i<tn){
			if(s.charAt(i)==t.charAt(i)){
				i++;
			}else break;
		}
		int sLeft=sn-i;
		int tLeft=tn-i;
		int total=sLeft+tLeft;
		if(k>=total && (k-total)%2==0){
			return "Yes";
		}
		if(k>(sn+tn) && (k-(sn+tn))%2==1){
			return "Yes";
		}
		return "No";

	}
}
