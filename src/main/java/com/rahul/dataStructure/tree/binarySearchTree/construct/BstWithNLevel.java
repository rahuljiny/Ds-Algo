package com.rahul.dataStructure.tree.binarySearchTree.construct;

public class BstWithNLevel {

	public static void main(String[] args) {
		int arr[] = {500, 200, 90, 250, 100};
		int n = arr.length;

		if (canRepresentNLevelBST(arr, n)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	private static boolean canRepresentNLevelBST(int[] arr, int n){
		int min=Integer.MIN_VALUE,max=Integer.MAX_VALUE;
		boolean result=true;
		for(int i=0;i<n;i++){
			boolean temp=check(arr[i],min,max);
			int k=i+1;
			if(k<n){
				if(arr[k]<arr[i]){
					max=arr[i];
				}else min=arr[i];
			}
			result= result&& temp;
		}
		return result;
	}
	private static boolean check(int value,int min,int max){

		return value>min && value<max;
	}
}
