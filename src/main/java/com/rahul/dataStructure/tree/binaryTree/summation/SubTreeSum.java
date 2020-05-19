package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

public class SubTreeSum {
	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(5);
		root.right = new Node(4);
		root.left.left = new Node(9);
		root.left.right = new Node(7);
		root.left.right.left = new Node(1);
		root.left.right.right = new Node(12);
		root.left.right.right.right = new Node(2);
		root.right.right = new Node(11);
		root.right.right.left = new Node(3);
		int sum = 17;

		if (sumSubtree(root, sum))
			System.out.println( "Yes");
		else
			System.out.println( "No");
	}
	private static boolean sumSubtree(Node root, int sum){
		if(root==null)
			return false;
		if(root.data+subTreeSum(root.left)+subTreeSum(root.right)==sum){
			return true;
		}
		return sumSubtree(root.left,sum)||sumSubtree(root.right,sum);
	}
	private  static int subTreeSum(Node root){
		if(root==null)
			return 0;
		return root.data+subTreeSum(root.left)+subTreeSum(root.right);
	}
}
