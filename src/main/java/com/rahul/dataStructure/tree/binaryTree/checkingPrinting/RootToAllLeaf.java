package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RootToAllLeaf {
	public static void main(String[] args) {
		Node root=new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		root.right.left = new Node(4);
		printRootToLeaf(root);
	}

	private static void printRootToLeaf(Node root){
		if(root==null)
			return;
		Stack<Node> stack= new Stack<>();
		stack.push(root);
		Map<Node, Node> parent= new HashMap<>();
		while (!stack.isEmpty()){
			Node node= stack.pop();
			if(node.left==null && node.right==null){
				printTopToBottom(node,parent);
			}
			if(node.right!=null){
				stack.push(node.right);
				parent.put(node.right,node);
			}
			if(node.left!=null){
				stack.push(node.left);
				parent.put(node.left,node);
			}
		}

	}

	private static void printTopToBottom(Node curr,Map<Node,Node>parent){
		Stack<Node> stack= new Stack<>();
		while (curr!=null){
			stack.push(curr);
			curr=parent.get(curr);
		}
		while (!stack.isEmpty()){
			Node node=stack.pop();
			System.out.print(node.data+" ");
		}
		System.out.println(" ");
	}
}
