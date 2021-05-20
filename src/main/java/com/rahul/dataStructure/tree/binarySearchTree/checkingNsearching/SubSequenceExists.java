package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class SubSequenceExists {
	static boolean result=true,flag=false;
	static class Index{
		int index;
		Index(int d){
			index=d;
		}
	}
	public static void main(String[] args) {
		int arr[]={1,2,7,11,29};
		BST bst= new BST(11);
		bst.root.left= new Node(2);
		bst.root.right= new Node(29);
		bst.root.left.left= new Node(1);
		bst.root.left.right= new Node(7);
		bst.root.right.left= new Node(15);
		bst.root.right.right= new Node(40);
		bst.root.right.right.left= new Node(35);
		checkSubsequence(bst.root,arr,new Index(0));
		System.out.println("subsequence exist "+ result);
	}

	private static void checkSubsequence(Node root,int[] arr,Index index){

		if(root==null || index.index==arr.length)
			return;
		checkSubsequence(root.left,arr,index);
		if(index.index<arr.length && flag && root.data!=arr[index.index]){
			result= false;
		}
		if(index.index<arr.length &&root.data==arr[index.index]){
			flag=true;
			index.index++;
		}
		checkSubsequence(root.right,arr,index);
	}
}
