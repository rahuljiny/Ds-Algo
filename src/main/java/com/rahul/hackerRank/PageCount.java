package com.rahul.hackerRank;

public class PageCount {
	public static void main(String[] args) {
		int n=5;
		int p=4;
		System.out.println(pageCount( n,  p));
	}
	static int pageCount(int n, int p) {
		int totalPage=(n%2==0)?n/2:(n-1)/2;
		int requiredPage=(p%2==0)?p/2:(p-1)/2;
		return requiredPage<(totalPage-requiredPage)?requiredPage:(totalPage-requiredPage);
	}
}
