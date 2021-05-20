package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

public class ParentSum {

	static int sum=0;
	public static void main(String args[]) {
		// binary tree formation  
		Node root = new Node(4);         //     4      
		root.left = new Node(2);         //     / \      
		root.right = new Node(5);         //     2 5      
		root.left.left = new Node(7);     //     / \ / \      
		root.left.right = new Node(2); // 7 2 2 3  
		root.right.left = new Node(2);
		root.right.right = new Node(3);

		int x = 2;

		System.out.println("Sum = " +
				sumOfParentOfXUtil(root, x));
	}

	private static int sumOfParentOfXUtil(Node root, int x) {
		if (root == null) {
			return 0;
		}
		if((root.left!=null && root.left.data==x)||(root.right!=null && root.right.data==x)){
			sum=sum+root.data;
		}
		sumOfParentOfXUtil(root.left,x);
		sumOfParentOfXUtil(root.right,x);
		return sum;
	}
}
