package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;

public class LeafToLeaf {

	static  int maxLength=Integer.MIN_VALUE;
	static Node begin;
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		A a= new A();
		maxLeafToLeaf(root,a);
		System.out.println(a.ans);
	}

	private static int maxLeafToLeaf(Node root,A a){
		if(root==null){
			return 0;
		}
		int leftHeight=maxLeafToLeaf(root.left,a);
		int rightHeight=maxLeafToLeaf(root.right,a);
		a.ans=Math.max(a.ans,1+leftHeight+rightHeight);
		return Math.max(leftHeight,rightHeight)+1;
	}

}
class A{
	int ans=Integer.MIN_VALUE;
}
