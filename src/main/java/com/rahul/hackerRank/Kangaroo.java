package com.rahul.hackerRank;

public class Kangaroo {
	public static void main(String[] args) {
		System.out.println(kangaroo(0 ,2 ,5 ,3));
	}
	static String kangaroo(int x1, int v1, int x2, int v2) {
		if(x1>x2 && v2>v1){
			if((x1-x2)%(v2-v1)==0){
				return "YES";
			}
		}
		if(x1<x2 && v2<v1){
			if((x2-x1)%(v1-v2)==0){
				return "YES";
			}
		}
		return "NO";
	}
}
