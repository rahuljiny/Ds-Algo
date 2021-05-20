package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class RangeCheck {
	public static void main(String[] args) {
		BST tree= new BST();
		tree.root = new Node(8);
		tree.root.left = new Node(5);
		tree.root.right = new Node(19);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(7);
		tree.root.left.left.left = new Node(1);
		tree.root.right.left = new Node(12);
		tree.root.right.right = new Node(21);
		tree.levelOrder();
		System.out.println(" ");
		removeNodes(tree.root,4,20);
		tree.levelOrder();
	}

	private static Node removeNodes(Node root,int min,int max){
		if(root==null)
			return null;

		root.right=removeNodes(root.right,min,max);
		root.left=removeNodes(root.left,min,max);
		if(root.data<min){
			return removeNodes(root.right,min,max);
		}
		if(root.data>max){
			return removeNodes(root.left,min,max);
		}
		if(root.data>min && root.data<max){
			return root;
		}
		return root;
	}
}
