package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class LeftRightLeavesSum {
	static int sum=0;
	public static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(20);
		tree.root.left = new Node(9);
		tree.root.right = new Node(49);
		tree.root.left.right = new Node(12);
		tree.root.left.left = new Node(5);
		tree.root.right.left = new Node(23);
		tree.root.right.right = new Node(52);
		tree.root.left.right.right = new Node(12);
		tree.root.right.right.left = new Node(50);

		System.out.println("The sum of left leaves is " +
				leftLeavesSum(tree.root));
		System.out.println("The sum of right leaves is " +
				rightLeavesSum(tree.root));
	}
	private static int leftLeavesSum(Node root){
		leftSum(root);
		return sum;
	}
	private static  void leftSum(Node root){
		if(root==null)
			return;
		if(root.left!=null && root.left.left==null && root.left.right==null)
			sum=sum+root.left.data;
		leftLeavesSum(root.left);
		leftLeavesSum(root.right);
	}

	private static int rightLeavesSum(Node root){
		rightSum(root);
		return sum;
	}
	private static  void rightSum(Node root){
		if(root==null)
			return;
		if(root.right!=null && root.right.left==null && root.right.right==null)
			sum=sum+root.right.data;
		leftLeavesSum(root.left);
		leftLeavesSum(root.right);
	}

}
