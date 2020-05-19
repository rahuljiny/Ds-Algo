package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class RemoveEdge {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(5);
		tree.root.left = new Node(1);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(7);
		if(check(tree.root)==true)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	private static boolean check(Node root){
		if (root==null)
			return true;
		int sizeOfTree=sizeOfTree(root);
		if(sizeOfTree%2!=0)
			return false;
		return checkDivide(root,sizeOfTree);
	}

	private static boolean checkDivide(Node root,int sizeOfTree){
		if(root==null)
			return true;
		int leftTreeSize=sizeOfTree(root.left);
		int rightTreeSize=sizeOfTree(root.left);
		return (leftTreeSize==sizeOfTree/2 ||rightTreeSize==sizeOfTree/2) ||
				checkDivide(root.left,sizeOfTree) ||checkDivide(root.right,sizeOfTree);

	}
	private static int sizeOfTree(Node root){
		if(root==null){
			return 0;
		}
		return sizeOfTree(root.left)+1+sizeOfTree(root.right);
	}
}
