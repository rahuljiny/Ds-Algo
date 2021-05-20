package com.rahul.hackerRank;

public class Sequence {

	public static void main(String[] args) {
		int[] p={4,3,5,1,2};
		int[] result=permutationEquation(p);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}
	static int[] permutationEquation(int[] p) {
		int[] result= new int[p.length];
		for(int i=0;i<p.length;i++){
			findIndexOd(p,i);
			result[i]=findIndexOd(p,findIndexOd(p,i+1));;
		}
		return result;
	}

	private  static int findIndexOd(int[] p, int n){
		int result=0;
		for(int i=0;i<p.length;i++){
			if(p[i]==n)
				result= i+1;
		}
		return result;
	}
}
