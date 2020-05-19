package com.rahul.dataStructure.tree.binaryTree.traversal;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class InOrderSuccessor {

	static Node temp= new Node(0);
	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree(1);
		tree.root.left=new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.right=new Node(6);
		findInOrderSuccessor(tree.root,tree.root.left.right);
	}

	private static void  findInOrderSuccessor(Node root,Node x){
		if(x.right!=null){
			Node successor=leftMostNode(x.right);
			System.out.println("Successor for "+x.data +" is "+successor.data);
		}
		if(x.right==null){
			Node rightMost=rightMostNode(root);
			if(x==rightMost){
				System.out.println("there is no successor for given node");
			}
			findInOrderSuccessorRecursively(root,x);
		}
	}

	private static Node findInOrderSuccessorRecursively(Node root,Node x){
		if(root==null){
			return null;
		}
		if(root==x || (temp=findInOrderSuccessorRecursively(root.left,x))!=null || (temp=findInOrderSuccessorRecursively(root.right,x))!=null){
			if(temp!=null){
				if(root.left==temp){
					System.out.println("success for "+root.data+" is "+temp.data);
					return null;
				}
			}
			return root;
		}
		return null;
	}
	private static Node leftMostNode(Node node){
		while (node!=null && node.left!=null){
			node=node.left;
		}
		return node;
	}

	private static Node rightMostNode(Node node){
		while (node!=null && node.right!=null){
			node=node.right;
		}
		return node;
	}
}
