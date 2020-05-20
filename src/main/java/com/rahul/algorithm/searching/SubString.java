package com.rahul.algorithm.searching;

public class SubString {

	public static void main(String[] args) {
		String text =  "geeksforgeeks";
		String pat="geeks";
		System.out.println(contains(text, pat,0,0));
	}

	private static boolean contains(String text, String pat,int i,int j){
		if(i>=text.length() || j>=pat.length()){
			return false;
		}
		if(text.charAt(i)==pat.charAt(j)){
			if(j==pat.length()-1){
				return true;
			}
			return contains(text,pat,i+1,j+1);
		}
		if(j>0){
			return contains(text,pat,i,0);
		}else {
			return contains(text,pat,i+1,0);
		}

	}
}
