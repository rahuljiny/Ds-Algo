package com.rahul.dataStructure.tree.binaryTree.traversal;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class AlternateLevelOrderBottomUp {

	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree(1);
		tree.root.left=new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.root.right.left=new Node(6);
		tree.root.right.right=new Node(7);
		tree.root.left.left.left=new Node(8);
		tree.root.left.left.right=new Node(9);
		tree.root.left.right.left=new Node(10);
		tree.root.left.right.right=new Node(11);
		tree.root.right.left.left=new Node(12);
		tree.root.right.left.right=new Node(13);
		tree.root.right.right.left=new Node(14);
		tree.root.right.right.right=new Node(15);
		printTopDownAlternate(tree.root);
	}

	private static  void printTopDownAlternate(Node root){
		if (root==null)
			return;
		Queue<Node> queue= new LinkedList<>();
		queue.add(root);
		Stack stack= new Stack();
		Stack finalStack= new Stack();
		while (!queue.isEmpty()){
			int size= queue.size();
			while (size>0){
				Node left=queue.poll();
				Node right=queue.poll();
				if(left!=null){
					stack.add(left.data);
					if(left.left!=null)
						queue.add(left.left);
				}if(right!=null){
					stack.add(right.data);;
					if(right.right!=null){
						queue.add(right.right);
					}
				}
				if(left!=null && left.right!=null)
					queue.add(left.right);
				if(right!=null && right.left!=null)
					queue.add(right.left);

				size=size-2;
			}
			while (!stack.isEmpty()){
				finalStack.push(stack.pop());
			}
		}
		while (!finalStack.isEmpty()){
			Integer data=(Integer) finalStack.pop();
			System.out.print(data+ " ");
		}

	}
}
