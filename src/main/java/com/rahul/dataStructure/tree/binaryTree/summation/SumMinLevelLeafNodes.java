package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class SumMinLevelLeafNodes {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.left.right.left = new Node(8);
		root.right.left.right = new Node(9);

		System.out.println("Sum = " +
				sumOfLeafNodesAtMinLevel(root));

	}
	private static int sumOfLeafNodesAtMinLevel(Node root){
		if(root==null){
			return 0;
		}
		int sum=0;
		boolean f=false;
		Queue<Node> queue=new LinkedList<>();
		while (f==false){
			queue.add(root);
			int size=queue.size();
			while (size-->0){
				Node node=queue.poll();
				if(node.left==null && node.right==null){
					sum+=node.data;
					f=true;
				}else {
					if(node.left!=null){
						queue.add(node.left);
					}if(node.right!=null){
						queue.add(node.right);
					}
				}
			}
		}
		return sum;
	}

}
