package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

public class LargestSubtreeSum {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(-2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(-6);
		root.right.right = new Node(2);

		System.out.println(findLargestSubtreeSum(root));
	}

	private static  int findLargestSubtreeSum(Node root){
		if(root==null)
			return 0;
		return Math.max(findSum(root.left),findSum(root.right));
	}
	private static int findSum(Node root){
		if(root==null)
			return 0;
		return root.data+findSum(root.left)+findSum(root.right);
	}
}
