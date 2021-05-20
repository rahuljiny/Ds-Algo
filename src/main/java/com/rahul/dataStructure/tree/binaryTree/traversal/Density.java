package com.rahul.dataStructure.tree.binaryTree.traversal;


import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Density {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.left = new Node(3);
		float density=findDensity(tree.root);
		System.out.println("Density of given Binary Tree is : "
				+ density);
	}

	private static float findDensity(Node root){
		if(root==null)
			return 0;
		float density=0;
		Queue<Node> queue= new LinkedList();
		queue.add(root);
		int height=0;
		int count=1;
		while (!queue.isEmpty()){
			int size= queue.size();
			while (size>0){
				Node temp=queue.poll();
				if(temp.left!=null){
					queue.add(temp.left);
					count++;
				}
				if(temp.right!=null){
					queue.add(temp.right);
					count++;
				}
				size--;
			}
			height++;
		}
		return (float)count/height;
	}
}
