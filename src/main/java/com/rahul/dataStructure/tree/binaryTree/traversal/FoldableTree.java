package com.rahul.dataStructure.tree.binaryTree.traversal;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class FoldableTree {

	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree(13);
		tree.root.left=new Node(12);
		tree.root.right=new Node(10);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(19);
		tree.root.left.right.right=new Node(19);
		tree.root.right.left=new Node(16);
		tree.root.right.right=new Node(9);
		if(tree.root==null){
			System.out.println("tree is Foldable");
		}
		boolean isFoldable=isFoldable(tree.root.left,tree.root.right);
		System.out.println(isFoldable);
	}
	private static boolean isFoldable(Node left,Node right){
		if((left!=null && right==null)|| (right!=null && left==null) ){
			return false;
		}
		if(left!=null && right!=null){
			return isFoldable(left.left,right.right) && isFoldable(left.right,right.left);
		}
		return true;
	}
}
