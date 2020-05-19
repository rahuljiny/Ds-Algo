package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class Median {
	static int totalNode=0,median=0;
	public static void main(String[] args) {
		BST bst1= new BST();
		bst1.root = new Node(20);
		bst1.root.left = new Node(8);
		bst1.root.right = new Node(22);
		bst1.root.right.left = new Node(21);
		bst1.root.right.right = new Node(24);
		bst1.root.left.left = new Node(4);
		bst1.root.left.right = new Node(12);
		bst1.root.left.right.left = new Node(10);
		bst1.root.left.right.right = new Node(17);
		System.out.println("median is "+findMedian(bst1.root));
	}

	private static int findMedian(Node root){
		intOrderCount(root);
		int mid=totalNode%2==0?totalNode/2:(totalNode+1)/2;
		boolean even=totalNode%2==0;
		totalNode=0;
		getMedian(root,mid,even);
		return median/2;
	}

	private static void  getMedian(Node root,int mid,boolean even){
		if(root==null)
			return;
		getMedian(root.left,mid,even);
		totalNode++;
		if(totalNode==mid){
			if(even){
				median+=root.data;
			}else{
				median+=2*root.data;
			}
		}
		if(totalNode==mid+1){
			if(even){
				median+=root.data;
			}
		}
		getMedian(root.right,mid,even);
	}
	private static void intOrderCount(Node root){
		if(root==null)
			return;
		intOrderCount(root.left);
		totalNode++;
		intOrderCount(root.right);
	}
}
