package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MirrorIterative {

	public static void main(String[] args) {

		BinaryTree tree = new BinaryTree();
		Node a = new Node(1);
		Node b = new Node(1);
		a.left = new Node(2);
		a.right = new Node(3);
		a.left.left = new Node(4);
		a.left.right = new Node(5);

		b.left = new Node(3);
		b.right = new Node(2);
		b.right.left = new Node(5);
		b.right.right = new Node(4);

		if (areMirror(a, b) == true)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	private static boolean areMirror(Node a, Node b){
		if(a==null && b==null)
			return true;
		if(a==null || b==null)
			return false;
		Queue queue1= new LinkedList();
		Queue queue2= new LinkedList();
		queue1.add(a);
		queue2.add(b);
		while (!queue1.isEmpty() || !queue2.isEmpty()){
			int size1=queue1.size();
			int size2=queue2.size();
			if(size1!=size2)
				return false;
			while (size1>0){
				Node node1=(Node)queue1.poll();
				Node node2=(Node)queue2.poll();
				if(node1.data!=node2.data)
					return false;
				if(node1.left!=null)
				queue1.add(node1.left);
				if(node1.right!=null)
				queue1.add(node1.right);
				if(node2.right!=null)
				queue2.add(node2.right);
				if(node2.left!=null)
				queue2.add(node2.left);
				size1--;
			}
		}
		if(!queue1.isEmpty() || !queue2.isEmpty())
			return false;
		return true;
	}
}
