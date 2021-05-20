package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

public class RootToLeafSum {
	public static void main(String[] args) {
		int k = 45;
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.left.right.left = new Node(12);
		root.right.right.left = new Node(10);
		root.right.right.left.right = new Node(11);
		root.left.left.right.left = new Node(13);
		root.left.left.right.right = new Node(14);
		root.left.left.right.right.left = new Node(15);

		System.out.println("Tree before truncation\n");
		print(root);

		root = prnes(root, k); // k is 45

		System.out.println("\n\nTree after truncation\n");
		print(root);
	}

	private static Node prnes(Node root,int k){
		Sum sum= new Sum(0);
		return prne(root, k,sum);
	}
	private static Node prne(Node root, int k,Sum sum){
		if(root==null){
			return null;
		}
		Sum lSum = new Sum(root.data+sum.v);
		Sum rSum= new Sum(lSum.v);

		root.left=prne(root.left,k,lSum);
		root.right=prne(root.right,k,rSum);

		sum.v=Math.max(lSum.v,rSum.v);
		if(k>sum.v)
			return null;
		return root;
	}
	private static void print(Node root){
		if (root==null){
			return;
		}
		print(root.left);
		System.out.print(root.data+" ");
		print(root.right);
	}

	static class Sum{
		int v;
		Sum(int k){
			v=k;
		}
	}
}
