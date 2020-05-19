package com.rahul.dataStructure.tree.binaryTree.traversal;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class LevelOrderChangeDirection {
	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree(1);
		tree.root.left=new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(6);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		tree.root.left.left.left=new Node(8);
		tree.root.left.left.right=new Node(9);
		tree.root.left.right.left=new Node(10);
		tree.root.left.right.right=new Node(11);
		tree.root.right.left.left=new Node(12);
		tree.root.right.left.right=new Node(13);
		tree.root.right.right.left=new Node(14);
		tree.root.right.right.right=new Node(15);
		printLevelOrderChangeDirection(tree.root);
	}

	private static void  printLevelOrderChangeDirection(Node root){
		if(root==null)
			return;
		int height=findHeight(root);
		for(int i=1;i<=height;i++){
			printLevel(root,i,(i%2!=0));
			System.out.println(" ");
		}
	}

	private static void printLevel(Node root,int level,boolean flag){
		if(root==null){
			return;
		}
		if(level==1){
			System.out.print(root.data+" ");
			return;
		}
		if(flag){
			printLevel(root.left,level-1,flag);
			printLevel(root.right,level-1,flag);
		}else {
			printLevel(root.right,level-1,flag);
			printLevel(root.left,level-1,flag);
		}

	}
	private static int findHeight(Node root){
		if(root==null)
			return 0;
		int leftHeight=findHeight(root.left);
		int rightHeight=findHeight(root.right);
		return Math.max(leftHeight,rightHeight)+1;
	}
}
