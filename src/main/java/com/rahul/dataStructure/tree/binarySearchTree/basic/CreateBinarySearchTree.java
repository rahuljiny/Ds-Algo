package com.rahul.dataStructure.tree.binarySearchTree.basic;


import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class CreateBinarySearchTree {
	public static void main(String[] args) {
		BST bst= new BST(10);
		bst.insert(bst.root,5);
		bst.insert(bst.root,15);
		bst.insert(bst.root,3);
		bst.insert(bst.root,7);
		bst.insert(bst.root,12);
		bst.insert(bst.root,17);
		bst.levelOrder();
	}
}
