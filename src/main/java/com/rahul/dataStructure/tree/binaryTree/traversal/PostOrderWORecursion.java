package com.rahul.dataStructure.tree.binaryTree.traversal;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class PostOrderWORecursion {

	public static void main(String []args)
	{
		BinaryTree tree = new BinaryTree(1);
		Node root=tree.root;
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		postOrder(root);
	}
	private static void postOrder(Node root){
		if(root==null)return;
		Node temp=root;
		while (temp!=null && temp.visited==false){
			if(temp.left!=null && temp.left.visited==false){
				temp=temp.left;
			}else if(temp.right!=null && temp.right.visited==false){
				temp=temp.right;
			}else {
				System.out.print(temp.data+" ");
				temp.visited=true;
				temp=root;
			}

		}
	}
}
