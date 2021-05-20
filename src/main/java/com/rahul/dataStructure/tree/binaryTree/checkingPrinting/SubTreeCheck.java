package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class SubTreeCheck {

	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();

		Node S = new Node('a');
		S.left = new Node('b');
		S.right = new Node('d');
		S.left.left = new Node('c');
		S.right.right = new Node('e');

		Node T = new Node('a');
		T.left = new Node('b');
		T.right = new Node('d');
		T.left.left = new Node('c');
		T.right.right = new Node('e');

		if (isSubtree(S,T)) {
			System.out.println("Yes, S is a subtree of T");
		}
		else {
			System.out.println("No, S is not a subtree of T");
		}
	}

	private static boolean isSubtree(Node node1, Node node2){
		if(node1==null || node2==null)
			return false;
		if(node1.data==node2.data && matchSubTree(node1,node2)){
			return true;
		}
		return isSubtree(node1,node2.left) || isSubtree(node1,node2.right);
	}

	private static boolean matchSubTree(Node node1,Node node2){
		if(node1==null && node2==null)
			return true;
		if(node1==null && node2!=null)
			return true;
		if(node1!=null && node2==null)
			return false;
		return node1.data==node2.data && matchSubTree(node1.left,node2.left)&&matchSubTree(node1.right,node2.right);
	}
}
