package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

public class SumAllNodes {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);

		int sum = addBT(root);
		System.out.println("Sum of all the elements is: " + sum);
	}
	private static int addBT(Node root){
		if(root==null)
			return 0;
		return root.data+addBT(root.left)+addBT(root.right);
	}
}
