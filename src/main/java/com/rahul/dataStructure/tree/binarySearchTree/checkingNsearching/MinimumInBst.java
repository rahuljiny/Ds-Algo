package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class MinimumInBst {
	public static void main(String[] args) {
		BST bst= new BST(11);
		bst.root.left= new Node(2);
		bst.root.right= new Node(29);
		bst.root.left.left= new Node(1);
		bst.root.left.right= new Node(7);
		bst.root.right.left= new Node(15);
		bst.root.right.right= new Node(40);
		bst.root.right.right.left= new Node(35);
		System.out.println("minimum is "+findMinimum(bst.root));
	}

	private static int findMinimum(Node root){
		if(root==null)
			return -1;
		while (root.left!=null){
			root=root.left;
		}
		return root.data;
	}
}
