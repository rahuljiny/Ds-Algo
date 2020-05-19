package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

import java.util.Vector;

public class SumPath {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(1);
		root.left.right.left = new Node(1);
		root.right = new Node(-1);
		root.right.left = new Node(4);
		root.right.left.left = new Node(1);
		root.right.left.right = new Node(2);
		root.right.right = new Node(5);
		root.right.right.right = new Node(2);

		int k = 5;
		printKPath(root, k);
	}

	private static void printKPath(Node root, int k) {
		Vector<Node> path = new Vector<>();
		printAllPath(root, k, path);
	}

	private static void printAllPath(Node root, int k, Vector path) {
		if(root==null)
			return;
		path.add(root);
		printAllPath(root.left,k,path);
		printAllPath(root.right,k,path);
		int f=0;
		for(int j=path.size()-1;j>=0;j--){
			f+=((Node)path.get(j)).data;
			if(f==k){
				printPath(path,j);
			}
		}
		path.remove(root);
	}

	private static void printPath(Vector path,int j) {
		for(int i=j;i<path.size();i++){
			System.out.print(((Node)path.get(i)).data+" ");
		}
		System.out.println(" ");
	}
}
