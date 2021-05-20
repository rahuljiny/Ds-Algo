package com.rahul.dataStructure.array.util;

public class SumTreePath {
	static int max(int l, int r) {
		return (l > r ? l : r);
	}



	static class Node {
		int data;
		Node left, right;
	};



	static class INT {
		int v;

		INT(int a) {
			v = a;
		}
	}



	static Node newNode(int data) {
		Node node = new Node();
		node.data = data;
		node.left = node.right = null;
		return node;
	}





	static Node pruneUtil(Node root, int k, INT sum) {
		if (root == null)
			return null;

		INT lsum = new INT(sum.v + (root.data));
		INT rsum = new INT(lsum.v);

		root.left = pruneUtil(root.left, k, lsum);
		root.right = pruneUtil(root.right, k, rsum);
		sum.v = max(lsum.v, rsum.v);
		if (sum.v < k) {
			root = null;
		}

		return root;
	}



}
