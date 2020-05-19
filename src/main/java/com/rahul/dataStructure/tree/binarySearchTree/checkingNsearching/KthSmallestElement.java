package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class KthSmallestElement {
	static int count=0,kthEle=0;
	public static void main(String[] args) {
		BST tree= new BST();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(22);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(12);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(14);
		int k=3;
		System.out.println(k+" element is "+findKthElement(tree.root,k));
	}
	private static int findKthElement(Node root,int k){
		inOrder(root,k);
		return kthEle;
	}
	private static void inOrder(Node root,int k){
		if(root==null)
			return ;
		findKthElement(root.left,k);
		count++;
		if(count==k){
			kthEle=root.data;
		}
		findKthElement(root.right,k);

	}
}
