package com.rahul.dataStructure.tree.binaryTree.traversal;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class LevelOrderTravel {

	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree(1);
		tree.root.left=new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.right=new Node(6);
		printLevelOrderTravel(tree.root);
	}

	private static void printLevelOrderTravel(Node root){
		if(root==null)
			return;
		int height=findHeight(root);
		for(int i=1;i<=height;i++){
			printLevel(root,i);
			System.out.println(" ");
		}
	}

	private static void printLevel(Node root,int level){
		if(root==null){
			return;
		}
		if(level==1){
			System.out.print(root.data+" ");
			return;
		}
		printLevel(root.left,level-1);
		printLevel(root.right,level-1);
	}
	private static int findHeight(Node root){
		if(root==null)
			return 0;
		int leftHeight=findHeight(root.left);
		int rightHeight=findHeight(root.right);
		return Math.max(leftHeight,rightHeight)+1;
	}
}
