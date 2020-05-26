package com.rahul.algorithm.patternSearch;

public class SubString {

	public static void main(String[] args) {
		String txt = "AABAACAADAABAAABAA";
		String pat = "AABA";
		search(txt, pat);
	}

	private static void search(String txt, String pat){
		int N=txt.length();
		int M=pat.length();
		for(int i=0;i<=N-M;i++){
			int j;
			for(j=0;j<M;j++){
				if(txt.charAt(i+j)!=pat.charAt(j)){
					break;
				}
			}
			if(j==M){
				System.out.println("Substring preset at index"+i);
			}
		}

	}
}
