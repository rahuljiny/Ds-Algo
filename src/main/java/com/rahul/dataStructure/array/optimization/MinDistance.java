package com.rahul.dataStructure.array.optimization;

public class MinDistance {
	public static void main(String[] args) {
		int[] arr={3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3,2};
		int x=6,y=3;
		int dis=findMinDist(arr,x,y);
		System.out.println(dis);
	}

	private static int findMinDist(int[] arr,int x,int y){
		int p=-1;
		int min_dis=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x ||arr[i]==y){
				if(p!=-1 && arr[i]!=arr[p]){
					min_dis=Math.min(min_dis,Math.abs(i-p));
				}
				p=i;
			}
		}
		if(min_dis!=Integer.MAX_VALUE)
			return min_dis;
		return -1;
	}
}
