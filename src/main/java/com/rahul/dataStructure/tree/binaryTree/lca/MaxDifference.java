package com.rahul.dataStructure.tree.binaryTree.lca;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class MaxDifference {
	static int maxDiff= Integer.MIN_VALUE;
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		// Making above given diagram's binary tree
		tree.root = new Node(8);
		tree.root.left = new Node(3);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(4);
		tree.root.left.right.right = new Node(7);

		tree.root.right = new Node(10);
		tree.root.right.right = new Node(14);
		tree.root.right.right.left = new Node(13);
		System.out.println("Maximum difference between a node and"
				+ " its ancestor is : " + maxDiff(tree.root));
	}

	private static int maxDiff(Node root){
		if(root==null)
			return -1;
		findMaxDiff(root.left,root.data);
		findMaxDiff(root.right,root.data);
		return maxDiff;
	}

	private static void findMaxDiff(Node node,int maxRoot){
		if(node==null)
			return;
		if(maxRoot>node.data && (maxRoot-node.data)>maxDiff){
			maxDiff=maxRoot-node.data;
		}
		if(node.data>maxRoot){
			findMaxDiff(node.left,node.data);
			findMaxDiff(node.right,node.data);
		}else {
			findMaxDiff(node.left,maxRoot);
			findMaxDiff(node.right,maxRoot);
		}
	}
}
