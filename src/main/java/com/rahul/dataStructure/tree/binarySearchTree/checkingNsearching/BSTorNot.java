package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class BSTorNot {
	public static void main(String[] args) {
		BST tree= new BST();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(22);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(12);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(14);
		System.out.println(checkBST(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
	}

	private static boolean checkBST(Node root,int min,int max){
		if(root==null)
			return true;
		if(root.data<min || root.data>max){
			return false;
		}
		return checkBST(root.left,min,root.data) && checkBST(root.right,root.data,max);
	}
}
