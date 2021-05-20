package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

public class SumAllLeafNodes {
	static int sum;
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right = new Node(3);
		root.right.right = new Node(7);
		root.right.left = new Node(6);
		root.right.left.right = new Node(8);

		// variable to store sum of leaf nodes
		sum = 0;
		leafSum(root);
		System.out.println(sum);
	}
	private static void leafSum(Node root){
		if(root==null)
			return;
		if(root.left==null && root.right==null){
			sum+=root.data;
		}
		leafSum(root.left);
		leafSum(root.right);
	}
}
