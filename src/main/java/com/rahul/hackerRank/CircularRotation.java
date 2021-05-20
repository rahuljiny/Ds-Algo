package com.rahul.hackerRank;

public class CircularRotation {
	public static void main(String[] args) {
		int [] a={3,4,5};
		int k=2;
		int[] queries={0,1};
		int[] result=circularArrayRotation( a,  k,  queries);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

	static int[] circularArrayRotation(int[] a, int k, int[] queries) {
		int len=a.length;
		int[] result=new int[queries.length];
		for(int i=0;i<queries.length;i++){
			int q=queries[i];
			int index=((len+q)-(k%len))%len;
			result [i]=a[index];
		}
		return result;
	}

}
