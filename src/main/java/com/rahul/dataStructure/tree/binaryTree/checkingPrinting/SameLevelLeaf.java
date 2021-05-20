package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;

public class SameLevelLeaf {
	private static int leafLevel=0;
	public static void main(String args[]) {
		// construct a tree
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(12);
		root.right.left = new Node(43);

		boolean result = checkLevelLeafNode(root,0);
		if (result == true)
			System.out.println("All leaf nodes are at same level");
		else
			System.out.println("Leaf nodes not at same level");
	}
	private static boolean checkLevelLeafNode(Node root,int myLevel){
		if(root==null)
			return true;
		if(root.left==null && root.right==null){
			if(leafLevel==0){
				leafLevel=myLevel;
			}
			if(myLevel!=leafLevel)
				return false;
		}
		return checkLevelLeafNode(root.left,myLevel+1) && checkLevelLeafNode(root.right,myLevel+1);
	}

}
