package com.rahul.hackerRank;

public class MinimumDistance {
	public static void main(String[] args) {
		int[] a={3,2,1,2,3};
		System.out.println(minimumDistances(a));
	}

	static int minimumDistances(int[] a) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					int diff=j-i;
					if(diff<min){
						min=diff;
					}
				}
			}
		}
		if(min==Integer.MAX_VALUE)
			return -1;
		return min;
	}
}
