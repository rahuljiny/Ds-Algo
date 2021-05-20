package com.rahul.dataStructure.tree.binaryTree;

import com.rahul.dataStructure.tree.Node;

public class BinaryTree {
	public Node root;

	public BinaryTree(int data){
		root= new Node(data);
	}

	public BinaryTree(){

	}

	public void print(Node root){
		if (root==null)
			return;
		System.out.println(root.data);
		print(root.left);
		print(root.right);
	}
	public void inorder(Node root){
		if(root==null) return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}

	public void deleteNode(Node root,int num){
		if(root==null)
			return;
		Node nodeToBeDeleted=searchNode(root,num);
		Node rightMostNode=getRightMostNode(root);
		nodeToBeDeleted.data=rightMostNode.data;
		while (root.right.data!=rightMostNode.data){
			root=root.right;
		}
		root.right=null;
	}

	public Node getRightMostNode(Node root){
		if(root==null){
			return root;
		}
		while (root.right!=null){
			root=root.right;
		}
		return root;
	}
	public Node searchNode(Node root, int num){
		if(root==null){
			return root;
		}
		if(root.data==num){
			return root;
		}
		if(root.left!=null){
			return searchNode(root.left,num);
		}
		else {
			return searchNode(root.right,num);
		}
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
