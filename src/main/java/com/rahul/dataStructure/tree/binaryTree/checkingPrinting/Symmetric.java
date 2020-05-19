package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;

public class Symmetric {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(4);
		root.right.right = new Node(3);
		if (root==null){
			System.out.println("The given tree is Symmetric");
		}
		if (isSymmetric(root.left,root.right))
			System.out.println("The given tree is Symmetric");
		else
			System.out.println("The given tree is not Symmetric");
	}
	private static boolean isSymmetric(Node left,Node right){
		if(left==null && right==null){
			return true;
		}
		if(left==null || right==null)
			return false;
		return left.data==right.data && isSymmetric(left.left,right.right ) && isSymmetric(left.right,right.left);
	}
}
