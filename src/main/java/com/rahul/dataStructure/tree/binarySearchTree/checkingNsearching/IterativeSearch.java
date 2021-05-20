package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class IterativeSearch {
	public static void main(String[] args) {
		BST tree= new BST();
		tree.root = new Node(8);
		tree.root.left = new Node(5);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(7);
		tree.root.left.left.left = new Node(1);
		System.out.println(search(tree.root,4));
	}
	private static boolean search(Node root,int n){
		if(root==null)
			return false;
		while (root!=null){
			if(n==root.data)
				return true;
			if(n<root.data)
				root=root.left;
			else root=root.right;
		}
		return false;
	}
}
