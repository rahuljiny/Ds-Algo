package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class RemoveAllLeafNode {
	public static void main(String[] args) {
		BST bst= new BST();
		bst.root = new Node(20);
		bst.root.left = new Node(8);
		bst.root.left.left = new Node(4);
		bst.root.left.right = new Node(12);
		bst.root.right = new Node(22);
		bst.root.right.left = new Node(21);
		bst.root.right.right = new Node(24);


		bst.levelOrder();
		removeAllLeaf(bst.root);
		System.out.println("");
		bst.levelOrder();
	}

	private static Node removeAllLeaf(Node root){
		if(root==null || isLeaf(root)){
			return null;
		}
		root.left=removeAllLeaf(root.left);
		root.right=removeAllLeaf(root.right);
		return root;
	}

	private static boolean isLeaf(Node node){
		if(node==null || (node.left==null && node.right==null))
			return true;
		return false;
	}
}
