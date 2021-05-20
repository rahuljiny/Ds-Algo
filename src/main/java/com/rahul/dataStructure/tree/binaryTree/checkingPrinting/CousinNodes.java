package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class CousinNodes {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.right.right = new Node(15);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.right.left.right = new Node(8);

		Node Node1, Node2;
		Node1 = tree.root.left.left;
		Node2 = tree.root.right;
		if (isCousin(tree.root, Node1, Node2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	private static boolean isCousin(Node root, Node node1, Node node2){
		return level(root,node1,1)==level(root,node2,1)&& !isSibling(root,node1,node2);

	}

	private static boolean isSibling(Node root, Node node1, Node node2){
		if(root==null)
			return false;
		return ((root.left==node1 && root.right==node2)||(root.left==node2 && root.right==node1))
				|| isSibling(root.left,node1,node2) || isSibling(root.right,node1,node2);
	}
	private static int level(Node root, Node node, int level){
		if(root==null){
			return 0;
		}
		if(root==node)
			return level;
		int l=level(root.left,node,level+1);
		if(l!=0){
			return l;
		}
		return level(root.right,node,level+1);
	}
}
