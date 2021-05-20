package com.rahul.dataStructure.tree.binarySearchTree.construct;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class BstFromLevelOrder {
	public static void main(String[] args) {
		int arr[]={7, 4, 12, 3, 6, 8, 1, 5, 10};
		Node node=createBst(arr,arr.length);
		BST bst= new BST(node);
		bst.inOrder(bst.root);
	}
	private static Node createBst(int[] arr,int n){
		if(n==0)
			return null;
		Node node=null;
		for(int i=0;i<arr.length;i++){
			node=levelOrder(node,arr[i]);
		}
		return node;
	}

	private static Node levelOrder(Node node,int data){
		if(node==null){
			node= new Node(data);
			return node;
		}
		if(data<=node.data){
			node.left=levelOrder(node.left,data);
		}else {
			node.right=levelOrder(node.right,data);
		}
		return node;
	}
}
