package com.rahul.dataStructure.tree.binaryTree.traversal;


import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class DeleteNode {
	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree(13);
		tree.root.left=new Node(12);
		tree.root.right=new Node(10);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(19);
		tree.root.right.left=new Node(16);
		tree.root.right.right=new Node(9);
		tree.inorder(tree.root);
		System.out.println(" ");
		tree.deleteNode(tree.root,12);

		System.out.println("tree after deletion");
		tree.inorder(tree.root);
	}
}
