package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

import java.util.Stack;

public class ArrayPreOrderCheck {
	public static void main(String[] args) {
		int[] arr={40, 30, 35, 80, 100};
		int n=arr.length;
		System.out.println(checkPreOrderBst(arr,0,n));
		System.out.println(checkWithStack(arr,n));
	}

	private static boolean checkWithStack(int[] arr,int n){
		Stack<Integer> stack= new Stack<>();
		int root=Integer.MIN_VALUE;
		stack.push(root);
		boolean result=true;
		for(int i=0;i<n;i++){
			if(arr[i]<root)
				result=false;
			while (!stack.isEmpty() && arr[i]>stack.peek()){
				root=stack.pop();
			}
			stack.push(arr[i]);
		}
		return result;
	}
	private static boolean checkPreOrderBst(int[] arr,int start,int end){
		if(start<end){
			int root=arr[start];
			int i,k;
			boolean found=false;
			for(i=start+1;i<end;i++){
				if(arr[i]>root){
					found=true;
					break;
				}
			}
			if(found){
				for(k=i+1;k<end;k++){
					if(root>arr[k])
						return false;
				}
				return checkPreOrderBst(arr,start+1,k)&&checkPreOrderBst(arr,k+1,end);
			}
		}
		return true;
	}
}
