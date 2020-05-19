package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;

public class CompleteBinaryTree {
	public static void main(String[] args) {
		Node root = null;
		root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);

		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);

		if (isPerfect(root) == true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static boolean isPerfect(Node root){
		int height=height(root);
		return isPerfectTree(root,1,height);
	}

	private static boolean isPerfectTree(Node root, int level,int height){
		 if(root==null)
		 	return true;
		 if(root.left==null && root.right==null){
		 	return level==height;
		 }
		 if(root.left==null || root.right==null)
		 	return false;
		return  isPerfectTree(root.left,level+1,height)
				&& isPerfectTree(root.right,level+1,height);
	}
	private static boolean isLeaf(Node node){
		return node.left==null && node.right==null;
	}
	private static int height(Node root){
		if (root==null)
			return 0;
		int left=height(root.left);
		int right=height(root.right);
		return Math.max(left,right)+1;
	}
}
