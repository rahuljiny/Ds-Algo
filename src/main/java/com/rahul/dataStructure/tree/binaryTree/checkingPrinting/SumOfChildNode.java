package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class SumOfChildNode {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.right = new Node(2);
		if (isSumProperty(tree.root))
			System.out.println("The given tree satisfies children"
					+ " sum property");
		else
			System.out.println("The given tree does not satisfy children"
					+ " sum property");
	}
	private static boolean isSumProperty(Node root){
		if(root==null){
			return true;
		}
		int childSum=0;
		if(root.left!=null){
			childSum+=root.left.data;
		}
		if(root.right!=null){
			childSum+=root.right.data;
		}
		if(root.data!=childSum)
			return false;
		return isSumProperty(root.left)&& isSumProperty(root.right);

	}
}
