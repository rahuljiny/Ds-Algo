package com.rahul.dataStructure.tree.binarySearchTree.basic;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class SearchAndInsertion {

	public static void main(String[] args) {
		BST bst= new BST(10);
		bst.insert(bst.root,5);
		bst.insert(bst.root,15);
		bst.insert(bst.root,3);
		bst.insert(bst.root,7);
		bst.insert(bst.root,12);
		bst.insert(bst.root,17);
		System.out.println(search(bst.root,13));
	}

	private static boolean search(Node root,int key){
		if(root==null){
			return false;
		}
		if (root.data==key)
			return true;
		if(root.data>key)
			return  search(root.left,key);
		else return search(root.right,key);
	}
}
