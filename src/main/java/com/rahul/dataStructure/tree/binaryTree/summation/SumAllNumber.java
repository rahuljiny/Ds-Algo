package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class SumAllNumber {
	static int sum=0;
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(6);
		tree.root.left = new Node(3);
		tree.root.right = new Node(5);
		tree.root.right.right = new Node(4);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(5);
		tree.root.left.right.right = new Node(4);
		tree.root.left.right.left = new Node(7);

		System.out.print("Sum of all paths is " +
				treePathsSum(tree.root));
	}
	private static int treePathsSum(Node root){
		if(root==null)
			return 0;
		int number=0;
		findSum(root,number);
		return sum;
	}
	private static void findSum(Node root,int number){
		if (root==null)
			return;
		number=number*10+root.data;
		if(root.left==null && root.right==null){
			sum+=number;
		}
		findSum(root.left,number);
		findSum(root.right,number);
	}
}
