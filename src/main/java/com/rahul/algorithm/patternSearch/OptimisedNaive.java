package com.rahul.algorithm.patternSearch;

public class OptimisedNaive {

	public static void main (String[] args)
	{
		String txt = "ABCEABCDABCEABCD";
		String pat = "ABCD";
		search(pat, txt);
	}

	private static void search(String pat, String txt){
		int m=pat.length();
		int n=txt.length();
		int i=0,j=0;
		while (i<n){
			while (i<n && j<m && pat.charAt(j)==txt.charAt(i+j)){
				j++;
			}
			if(j==m){
				System.out.println("Found match at index "+i);

			}
			i=i+j+1;
			j=0;
		}
	}
}
