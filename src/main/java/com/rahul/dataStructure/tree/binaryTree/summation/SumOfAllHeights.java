package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

public class SumOfAllHeights {

	public static void main(String[] args) {
		Node root = new Node(1);

		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		System.out.println("Sum of heights of all Nodes = " + getTotalHeight(root));
	}
	private static int  getTotalHeight(Node root){
		if (root==null)
			return 0;
		return sumOfAllHEights(root);
	}
	private static int sumOfAllHEights(Node root){
		if(root==null)
			return 0;
		return sumOfAllHEights(root.left)+height(root)+sumOfAllHEights(root.right);
	}

	private static int height(Node root){
		if(root==null)
			return 0;
		int lheight=height(root.left);
		int rheight=height(root.right);
		return Math.max(lheight,rheight)+1;
	}
}
