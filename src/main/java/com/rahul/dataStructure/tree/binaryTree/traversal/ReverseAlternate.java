package com.rahul.dataStructure.tree.binaryTree.traversal;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class ReverseAlternate {
	
	public static void main(String[] args) 
		{
			BinaryTree tree= new BinaryTree(1);
			Node root = tree.root;
			root.left = new Node(2);
			root.right = new Node(3);
			root.left.left = new Node(4);
			root.left.right = new Node(5);
			root.right.left = new Node(6);
			root.right.right = new Node(7);
			root.left.left.left = new Node(8);
			root.left.left.right = new Node(9);
			root.left.right.left = new Node(10);
			root.left.right.right = new Node(11);
			root.right.left.left = new Node(12);
			root.right.left.right = new Node(13);
			root.right.right.left = new Node(14);
			root.right.right.right = new Node(15);

			System.out.print("Inorder Traversal of given tree\n");
			tree.levelOrder();
			reverseAlternate(root);
			System.out.print("\n\nInorder Traversal of modified tree\n");
			tree.levelOrder();

		}
	private static void  reverseAlternate(Node root){
		if(root==null)
			return;
		preOrder(root.left,root.right,0);
	}
	private static void preOrder(Node left,Node right,int level){
		if(left==null || right== null)
			return;
		if(level%2==0){
			int temp=left.data;
			left.data=right.data;
			right.data=temp;
		}
		preOrder(left.left,right.right,level+1);
		preOrder(left.right,right.left,level+1);
	}
}
