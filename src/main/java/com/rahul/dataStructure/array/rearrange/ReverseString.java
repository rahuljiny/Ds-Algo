package com.rahul.dataStructure.array.rearrange;

public class ReverseString {

	public static void main(String[] args) {
		String str="abcdefg";
		String revere=reverse(str);
		System.out.println(revere);
	}
	private static String reverse(String str){
		char[] strchar=str.toCharArray();
		int n=strchar.length-1;
		int i=0;
		while (i<n){
			char temp=strchar[i];
			strchar[i]=strchar[n];
			strchar[n]=temp;
			i++;
			n--;
		}
		return String.valueOf(strchar);
	}
}
