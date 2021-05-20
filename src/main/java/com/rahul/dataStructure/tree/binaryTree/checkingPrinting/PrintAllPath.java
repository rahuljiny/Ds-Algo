package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class PrintAllPath {
	private static int[] path=new int[100];
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		/* Print all root-to-leaf paths of the input tree */
		printPaths(tree.root,0);
	}
	private static void printPaths(Node root,int index){
		if(root==null){
			return;
		}
		if(root.left==null &&root.right==null ){
			path[index]=root.data;
			printArray(path);
			return;
		}
		path[index]=root.data;
		printPaths(root.left,index+1);
		printPaths(root.right,index+1);
	}

	private static void printArray(int [] path){
		int i=0;
		while (path[i]>0){
			System.out.print(path[i]+" ");
			i++;
		}
		System.out.println(" ");
	}
}
