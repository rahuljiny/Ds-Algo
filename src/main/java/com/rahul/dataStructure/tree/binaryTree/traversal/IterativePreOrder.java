package com.rahul.dataStructure.tree.binaryTree.traversal;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

import java.util.Stack;

public class IterativePreOrder {
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(2);
		iterativePreOrder(tree.root);
	}

	private static void iterativePreOrder(Node root){
		if(root==null)
			return;
		Stack<Node> stack=new Stack();
		stack.push(root);
		while (!stack.isEmpty()){
			Node temp=stack.pop();
			System.out.print(temp.data+" ");
			if(temp.right!=null)
			stack.push(temp.right);
			if(temp.left!=null)
			stack.push(temp.left);
		}
	}
}
