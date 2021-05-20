package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;

public class SameLeafTraversal {

	public static void main(String[] args) {
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.right.left = new Node(6);
		root1.right.right = new Node(7);

		Node root2 = new Node(0);
		root2.left = new Node(1);
		root2.right = new Node(5);
		root2.left.right = new Node(4);
		root2.right.left = new Node(6);
		root2.right.right = new Node(7);
		if (isSame(root1, root2))
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}

	private static boolean isSame(Node root1, Node root2){
		if(root1==null && root2==null)
			return true;
		if(root1==null || root2==null)
			return false;
		return (isBothLeaf(root1,root2)|| isBothNoneLeaf(root1,root2)) &&  isSame(root1.left,root2.left) && isSame(root1.right,root2.right);
	}
	private static boolean isBothLeaf(Node node1,Node node2){
		if(node1==null && node2==null){
			return true;
		}
		return isLeaf(node1) && isLeaf(node2);
	}

	private static boolean isBothNoneLeaf(Node node1,Node node2){
		if(node1==null && node2==null){
			return true;
		}
		return !isLeaf(node1) && !isLeaf(node2);
	}

	private static boolean isLeaf(Node root){
		return root==null || (root.left==null && root.right==null);
	}
}
