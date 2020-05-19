package com.rahul.dataStructure.tree.binarySearchTree.construct;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

import java.util.Arrays;

public class BtToBst {
	static int index=0;
	public static void main(String[] args) {
		BinaryTree binaryTree= new BinaryTree(13);
		binaryTree.root.left=new Node(12);
		binaryTree.root.right=new Node(10);
		binaryTree.root.left.left=new Node(4);
		binaryTree.root.left.right=new Node(19);
		binaryTree.root.right.left=new Node(16);
		binaryTree.root.right.right=new Node(9);
		binaryTree.root.left.right.right=new Node(20);
		binaryTree.inorder(binaryTree.root);
		System.out.println(" ");
		binaryTree.levelOrder();
		System.out.println(" ");
		Node bst=convert(binaryTree.root);
		BST bst1=new BST(bst);
		System.out.println(" ");
		bst1.inOrder(bst1.root);
	}
	private static Node convert(Node root){
		if(root==null)
			return null;
		int[] arr= new int[8];
		inOrder(root,arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		System.out.println(" ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		index=0;
		convertInOrder(root,arr);
		return root;
	}
	private static void inOrder(Node root,int[] arr){
		if(root==null){
			return;
		}
		inOrder(root.left,arr);
		arr[index++]=root.data;
		inOrder(root.right,arr);
	}

	private static void convertInOrder(Node root,int[] arr){
		if(root==null){
			return;
		}
		convertInOrder(root.left,arr);
		root.data=arr[index++];
		convertInOrder(root.right,arr);
	}
}
