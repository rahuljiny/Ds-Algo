package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class SumTreeProperty {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(26);
		tree.root.left = new Node(10);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(6);
		tree.root.right.right = new Node(3);

		if (isSumTree(tree.root)==1)
			System.out.println("The given tree is a sum tree");
		else
			System.out.println("The given tree is not a sum tree");
	}

	private static int isSumTree(Node root){
		if(root==null ||(root.left==null && root.right==null)){
			return 1;
		}
		int left,right;
		left=sum(root.left);
		right=sum(root.right);
		if(root.data==left+right && isSumTree(root.left)!=0 && isSumTree(root.right)!=0)
			return 1;
		return 0;
	}

	private  static  int sum(Node root){
		if(root==null){
			return 0;
		}
		return sum(root.left)+root.data+sum(root.right);
	}
}
