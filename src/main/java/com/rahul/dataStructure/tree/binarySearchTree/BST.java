package com.rahul.dataStructure.tree.binarySearchTree;

import com.rahul.dataStructure.tree.Node;

public class BST {

	public Node root;

	public BST(){

	}
	public BST(int data){
		root=new Node(data);
	}

	public BST(Node node){
		root=node;
	}

	public void inOrder(Node node){
		if(node==null)
			return;
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}
	public Node insert(Node root,int data){
		if(root==null){
			return new Node(data);
		}
		if(root.data>data){
			root.left=insert(root.left,data);
		}else root.right=insert(root.right,data);
		return root;
	}

	public void levelOrder(){
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
