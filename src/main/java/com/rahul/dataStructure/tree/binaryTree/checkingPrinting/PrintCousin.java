package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;

public class PrintCousin {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.right = new Node(15);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);

		printCousins(root,root, root.left.right);
	}

	private static void printCousins(Node root,Node ptr, Node given){
		if(root==null || ptr==null)
			return;
		if(isCousin(root,ptr,given)){
			System.out.print(ptr.data+" ");
		}
		printCousins(root,ptr.left,given);
		printCousins(root,ptr.right,given);
	}

	private static boolean isCousin(Node root, Node node1, Node node2){
		if(node1==node2)
			return false;
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
