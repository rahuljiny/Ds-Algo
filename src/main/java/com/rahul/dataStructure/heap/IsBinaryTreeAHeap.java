package com.rahul.dataStructure.heap;

import com.rahul.dataStructure.tree.Node;

public class IsBinaryTreeAHeap {
	public static void main(String[] args) {
		IsBinaryTreeAHeap bt= new IsBinaryTreeAHeap();
		Node root = new Node(10);
		root.left = new Node(9);
		root.right = new Node(8);
		root.left.left = new Node(7);
		root.left.right = new Node(6);
		root.right.left = new Node(5);
		root.right.right = new Node(4);
		root.left.left.left = new Node(3);
		root.left.left.right = new Node(2);
		root.left.right.left = new Node(1);

		if(bt.isHeap(root) == true)
			System.out.println("Given binary tree is a Heap");
		else
			System.out.println("Given binary tree is not a Heap");
	}


	private boolean isHeap(Node root){
		if(root==null)
			return true;
		int nodeCount=nodeCount(root);
		return isCompleteTree(root,0,nodeCount) && isHeapUtil(root);

	}

	private int nodeCount(Node root){
		if(root==null)
			return 0;
		return 1+nodeCount(root.left)+nodeCount(root.right);
	}

	private boolean isCompleteTree(Node root,int index,int nodeCount){
		if(root==null)
			return true;
		if(index>=nodeCount){
			return false;
		}
		return isCompleteTree(root.left,2*index+1,nodeCount) && isCompleteTree(root.right,2*index+2,nodeCount);
	}

	private boolean isHeapUtil(Node root){
		if(root.left==null && root.right==null)
			return true;
		if(root.right==null)
			return root.data>=root.left.data;
		else {
			if(root.data>=root.left.data && root.data>=root.right.data){
				return isHeapUtil(root.left) && isHeapUtil(root.right);
			}else
				return false;
		}
	}
}
