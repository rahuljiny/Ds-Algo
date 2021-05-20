package com.rahul.dataStructure.heap;

public class LevelOrderMinHeap {
	public static void main(String[] args) {
		{
			// Level order traversal
			int[] level = new int[]{30, 56, 22, 49, 30, 51, 2, 67};

			if  (isMinHeap(level))
				System.out.println("True");
			else
				System.out.println("False");
		}
	}
	private static boolean isMinHeap(int[] level){
		int n=level.length-1;
		for(int i=n/2-1;i>=0;i--){
			if(level[i]>level[2*i+1])
				return false;
			if(2*i+2<n){
				if(level[i]>level[2*i+2])
					return false;
			}
		}
		return true;
	}
}
