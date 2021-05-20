package com.rahul.algorithm.greedy;

public class FittingShelves {

	public static void main(String[] args) {
		int wall = 24, m = 3, n = 5;
		minSpacePreferLarge(wall, m, n);
	}

	private static void minSpacePreferLarge(int wall,int  m,int  n){
		int minM=0,minN=0,minWall=0;
		int factor=wall/n;
		minWall=wall%n;
		minN=factor;
		for(int i=factor;i>=1;i--){
			int rem=(wall-(n*i))%m;
			if(rem<minWall){
				minWall=rem;
				minN=i;
				minM=(wall-(n*i))/m;
			}
		}
		System.out.println(minM+" "+ minN+" "+minWall);
	}
}
