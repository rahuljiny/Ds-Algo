package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class LargestLessThanN {
	static int largest=-1;
	public static void main(String[] args) {
		BST tree= new BST();
		tree.root = new Node(8);
		tree.root.left = new Node(5);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(7);
		tree.root.left.left.left = new Node(1);
		int n=7;
		findLargest(tree.root,n);
		if(largest!=-1){
			System.out.println("Larges less than "+n +" exist and is "+largest);
		}else {
			System.out.println("Larges less than "+n +" doesn't exist ");
		}
	}
	private static void findLargest(Node root,int n){
		if(root==null)
			return;
		findLargest(root.left,n);
		if(root.data<n)
			largest=root.data;
		findLargest(root.right,n);
	}
}
