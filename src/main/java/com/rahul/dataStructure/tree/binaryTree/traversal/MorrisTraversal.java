package com.rahul.dataStructure.tree.binaryTree.traversal;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class MorrisTraversal {
	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree(1);
		Node root = tree.root;
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		travel(tree.root);
	}

	private static void travel(Node root){
		if(root==null)
			return;
		Node curr=root;
		while(curr!=null){

			if(curr.left==null){
				System.out.print(curr.data+" ");
				curr=curr.right;
			}
			else {
				Node pre=curr.left;
				while (pre.right!=curr && pre.right!=null){
					pre=pre.right;
				}
				if(pre.right==null){
					pre.right=curr;
					curr=curr.left;
				}else {
					pre.right=null;
					System.out.print(curr.data+" ");
					curr=curr.right;
				}
			}
		}
	}
}
