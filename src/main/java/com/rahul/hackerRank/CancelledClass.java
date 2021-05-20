package com.rahul.hackerRank;

public class CancelledClass {
	public static void main(String[] args) {
		int k=4;
		int a[]={-1,-1,0,0,1,1};
		System.out.println(angryProfessor(k, a));
	}

	static String angryProfessor(int k, int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]<=0){
				count++;
			}
		}
		if(count>=k){
			return "NO";
		}
		return "YES";
	}
}
