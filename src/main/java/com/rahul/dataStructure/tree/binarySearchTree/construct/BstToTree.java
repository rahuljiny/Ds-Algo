package com.rahul.dataStructure.tree.binarySearchTree.construct;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class BstToTree {
	static int sum=0;
	public static void main(String[] args) {
		BST tree = new BST();
		tree.root = new Node(9);
		tree.root.left = new Node(6);
		tree.root.right = new Node(15);

		System.out.println("Original BST");
		tree.inOrder(tree.root);
		Node Node = addSmaller(tree.root);
		System.out.println("");
		System.out.println("BST To Binary Tree");
		tree.inOrder(Node);
	}
	private static Node addSmaller(Node root){
		if(root==null)
			return null;
		addSmaller(root.left);
		sum+=root.data;
		root.data=sum;
		addSmaller(root.right);
		return root;
	}
}
