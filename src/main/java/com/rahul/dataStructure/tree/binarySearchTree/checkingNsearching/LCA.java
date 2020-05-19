package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class LCA {
	public static void main(String[] args) {
		BST tree= new BST();
		tree.root = new Node(20);
		tree.root.left = new Node(8);
		tree.root.right = new Node(22);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(12);
		tree.root.left.right.left = new Node(10);
		tree.root.left.right.right = new Node(14);

		int n1 = 10, n2 = 14;
		Node t = lca(tree.root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

		n1 = 14;
		n2 = 8;
		t = lca(tree.root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

		n1 = 10;
		n2 = 22;
		t = lca(tree.root, n1, n2);
		System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);

	}

	private static Node lca(Node root,int node1,int node2){
		if(root==null)
			return null;
		if(node1<root.data && node2<root.data){
			return lca(root.left,node1,node2);
		}
		if(node1>root.data && node2>root.data){
			return lca(root.right,node1,node2);
		}
		return root;
	}
}
