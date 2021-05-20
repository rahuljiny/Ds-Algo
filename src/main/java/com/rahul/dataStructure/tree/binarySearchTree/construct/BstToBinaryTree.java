package com.rahul.dataStructure.tree.binarySearchTree.construct;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class BstToBinaryTree {
	static int sum=0;
	public static void main(String[] args) {
		BST bst= new BST(11);
		bst.root.left= new Node(2);
		bst.root.right= new Node(29);
		bst.root.left.left= new Node(1);
		bst.root.left.right= new Node(7);
		bst.root.right.left= new Node(15);
		bst.root.right.right= new Node(40);
		bst.root.right.right.left= new Node(35);
		bst.levelOrder();
		Node node=creteBinaryFromBst(bst.root);
		BinaryTree binaryTree= new BinaryTree();
		binaryTree.root=node;
		binaryTree.levelOrder();
	}

	private static Node creteBinaryFromBst(Node root){
		if(root==null)
			return null;
		creteBinaryFromBst(root.right);
		sum+=root.data;
		root.data=sum;
		creteBinaryFromBst(root.left);
		return root;
	}
}
