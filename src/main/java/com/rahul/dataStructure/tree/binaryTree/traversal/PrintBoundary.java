package com.rahul.dataStructure.tree.binaryTree.traversal;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

import java.util.Stack;

public class PrintBoundary {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(12);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(14);
		tree.root.right = new Node(22);
		tree.root.right.right = new Node(25);
		printAllBoundary(tree.root);
	}

	private static void printAllBoundary(Node root){
		if(root==null){
			return;
		}
		printLeftBoundary(root);
		printLeafNodes(root);
		printRightBoundary(root);
	}
	private static void printLeftBoundary(Node root){
		Node left=root;
		while (left.left!=null){
			System.out.print(left.data+" ");
			left=left.left;
		}
	}
	private static void printLeafNodes(Node root){
		if(root==null)
			return;
		if(root.left==null&& root.right==null)
			System.out.print(root.data+" ");
		printLeafNodes(root.left);
		printLeafNodes(root.right);
	}

	private static void printRightBoundary(Node root){
		Node right=root;
		Stack stack= new Stack();
		while (right.right!=null){
			stack.push(right);
			right=right.right;
		}
		while (stack.size()>1){
			Node node=(Node)stack.pop();
			System.out.print(node.data+" ");
		}
	}
}
