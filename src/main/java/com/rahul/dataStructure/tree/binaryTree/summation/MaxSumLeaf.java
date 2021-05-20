package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class MaxSumLeaf {
	static int maxSum=0;
		public static void main(String args[]) {
			BinaryTree tree = new BinaryTree();
			tree.root = new Node(-15);
			tree.root.left = new Node(5);
			tree.root.right = new Node(6);
			tree.root.left.left = new Node(-8);
			tree.root.left.right = new Node(1);
			tree.root.left.left.left = new Node(2);
			tree.root.left.left.right = new Node(6);
			tree.root.right.left = new Node(3);
			tree.root.right.right = new Node(9);
			tree.root.right.right.right = new Node(0);
			tree.root.right.right.right.left = new Node(4);
			tree.root.right.right.right.right = new Node(-1);
			tree.root.right.right.right.right.left = new Node(10);
			System.out.println("Max pathSum of the given binary tree is "
					+ maxPathSum(tree.root));
		}
	private static int maxPathSum(Node root){
			Res res= new Res(Integer.MIN_VALUE);
			getMaxSum(root,res);
			return res.sum;
	}
	private static int getMaxSum(Node root,Res res){
			if(root==null){
				return 0;
			}
			if(root.left==null && root.right==null)
				return root.data;
			int lsum=getMaxSum(root.left,res);
			int rSum=getMaxSum(root.right,res);
			if(root.left!=null && root.right!=null){
				res.sum=Math.max(res.sum,root.data+lsum+rSum);
				return Math.max(lsum,rSum)+root.data;
			}
			return (root.left==null)?rSum+root.data:lsum+root.data;
	}
	static class Res{
			int sum;
			Res(int data){
				sum=data;
			}
	}
}

