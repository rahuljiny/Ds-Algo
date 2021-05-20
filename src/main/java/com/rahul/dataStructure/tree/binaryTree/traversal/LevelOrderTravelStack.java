package com.rahul.dataStructure.tree.binaryTree.traversal;


import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTravelStack {

	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree(1);
		tree.root.left=new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left=new Node(2);
		tree.root.left.right=new Node(5);
		tree.root.right.right=new Node(6);
		printLevelOrderTravel(tree.root);
	}

	private static void printLevelOrderTravel(Node root){
		if(root==null)
			return;
		Queue<Node> queue= new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()){
			int size=queue.size();
			while (size>0){
				Node temp=queue.poll();
				System.out.print(temp.data+" ");
				if(temp.left!=null)
				queue.add(temp.left);
				if(temp.right!=null)
				queue.add(temp.right);
				size--;
			}
			System.out.println(" ");
		}

	}
}
