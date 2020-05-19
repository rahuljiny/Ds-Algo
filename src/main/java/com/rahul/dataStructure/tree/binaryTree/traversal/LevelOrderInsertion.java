package com.rahul.dataStructure.tree.binaryTree.traversal;


import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderInsertion {
	public static void main(String[] args) {
		BinaryTree binaryTree=new BinaryTree(10);
		Node root=binaryTree.root;
		root.left = new Node(11);
		root.left.left = new Node(7);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(8);

		System.out.print( "Inorder traversal before insertion: ");
		binaryTree.inorder(root);

		int key = 12;
		insert(root, key);

		System.out.print("\nInorder traversal after insertion: ");
		binaryTree.inorder(root);
	}

	private static void insert(Node root, int key){
		if(root==null){
			root=new Node(key);
		}
		Queue<Node> q= new LinkedList<Node>();
		q.add(root);
		while (!q.isEmpty()){
			Node node=q.poll();
			if(node.left==null){
				node.left= new Node(key);
				break;
			}else {
				q.add(node.left);
			}
			if(node.right==null){
				node.right= new Node(key);
				break;
			}else {
				q.add(node.right);
			}
		}

	}
}
