package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

public class MaxSumAlternateLevel {

	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.left.right = new Node(5);
		root.right.left.right.left = new Node(6);
		System.out.println(getSum(root));
	}

	private static int getSum(Node root){
		if(root==null){
			return 0;
		}
		return Math.max(getSumAlternate(root),getSumAlternate(root.left)+getSumAlternate(root.right));
	}

	private static int getSumAlternate(Node root){
		if(root==null)
			return 0;
		int sum=root.data;
		if(root.left!=null){
			sum+=getSum(root.left.left)+getSum(root.left.right);
		}
		if(root.right!=null){
			sum+=getSum(root.right.left)+getSum(root.right.right);
		}
		return sum;
	}
}
