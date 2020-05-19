package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class DeadEnd {
	static boolean deadEnd=false;
	public static void main(String[] args) {
		BST tree= new BST();
		tree.root = new Node(8);
		tree.root.left = new Node(5);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(7);
		tree.root.left.left.left = new Node(1);
		tree.levelOrder();
		checkDeadEnd(tree.root,0,Integer.MAX_VALUE);
		System.out.println("Dead end exist "+ deadEnd);
	}
	private static void checkDeadEnd(Node root,int min,int max){
		if(root== null)
			return;
		if(deadEnd)
			return;
		if(root.data-min<=1 && max-root.data<=1){
			deadEnd=true;
		}
		checkDeadEnd(root.left,min,root.data);
		checkDeadEnd(root.right,root.data,max);
	}
}
