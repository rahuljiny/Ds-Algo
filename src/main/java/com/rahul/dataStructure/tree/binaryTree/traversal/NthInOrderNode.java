package com.rahul.dataStructure.tree.binaryTree.traversal;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class NthInOrderNode {
	static int count=0;
	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree(1);
		tree.root.left=new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.right=new Node(6);
		findNthNode(tree.root,4);
	}

	private static void findNthNode(Node root,int n){
		if(root==null)
			return;
		findNthNode(root.left,n);
		count++;
		if(count==n)
			System.out.println("given node is "+root.data);
		findNthNode(root.right,n);
	}
}
