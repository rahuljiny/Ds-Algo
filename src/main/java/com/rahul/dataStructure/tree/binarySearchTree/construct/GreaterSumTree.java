package com.rahul.dataStructure.tree.binarySearchTree.construct;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class GreaterSumTree {
	static int sum=0;
	public static void main(String[] args) {
		BST bst= new BST(11);
		bst.root.left= new Node(2);
		bst.root.right= new Node(29);
		bst.root.left.left= new Node(1);
		bst.root.left.right= new Node(7);
		bst.root.right.left= new Node(15);
		bst.root.right.right= new Node(40);
		bst.root.right.right.left= new Node(35);
		bst.levelOrder();
		convertGreaterSum(bst.root);
		System.out.println("");
		bst.levelOrder();
	}

	private static void  convertGreaterSum(Node root){
		if(root==null)
			return;
		convertGreaterSum(root.right);
		sum+=root.data;
		root.data=sum-root.data;
		convertGreaterSum(root.left);
	}
}
