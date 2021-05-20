package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

public class MaximumSpiralSum {
	static  int sum=0,maxSum=0;
	public static void main(String[] args) {
		Node root = new Node(-2);
		root.left = new Node(-3);
		root.right = new Node(4);
		root.left.left = new Node(5);
		root.left.right = new Node(1);
		root.right.left = new Node(-2);
		root.right.right = new Node(-1);
		root.left.left.left = new Node(-3);
		root.right.right.right = new Node(2);
		System.out.print("Maximum Spiral Sum = "+maxSpiralSum(root));
	}

	private static int maxSpiralSum(Node root) {
		if (root == null)
			return 0;
		int height = height(root);
		for(int i=1;i<=height;i++){
			findMaxSum(root,i,i%2==0);
		}
		return maxSum;
	}
	private static void findMaxSum(Node root,int i,boolean toggle){
		if(root==null)
			return;
		if(i==1){
			sum+=root.data;
			if(sum<0){
				sum=0;
			}
			if(sum>maxSum){
				maxSum=sum;
			}
		}
		if(toggle){
			findMaxSum(root.left,i-1,toggle);
			findMaxSum(root.right,i-1,toggle);
		}else {
			findMaxSum(root.right,i-1,toggle);
			findMaxSum(root.left,i-1,toggle);
		}
	}
	private static int height(Node root){
		if(root==null)
			return 0;
		int lHeight=height(root.left);
		int rHeight=height(root.right);
		return Math.max(lHeight,rHeight)+1;
	}
}
