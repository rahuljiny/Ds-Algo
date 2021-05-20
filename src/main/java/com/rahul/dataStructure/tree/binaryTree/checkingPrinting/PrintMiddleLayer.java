package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class PrintMiddleLayer {
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);

		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;
		n1.left = n2;
		n1.right = n3;
		printMiddleLevel(n1);
	}

	private static void printMiddleLevel(Node n1){
		if(n1==null)
			return;

		Queue queue1= new LinkedList();
		Queue queue2= new LinkedList();
		queue1.add(n1);
		queue2.add(n1);
		while (!queue2.isEmpty()){
			int size2=queue2.size();
			while (size2>0){
				Node node2=(Node) queue2.poll();
				if(node2!=null && node2.left!=null && node2.right!=null){
					Node node1= (Node) queue1.poll();
					if(node1!=null){
						queue1.add(node1.left);
						queue1.add(node1.right);
					}
					queue2.add(node1.left.left);
					queue2.add(node1.left.right);
					queue2.add(node1.right.left);
					queue2.add(node1.right.right);
				}
				size2--;
			}
		}
		while (!queue1.isEmpty()){
			System.out.print(((Node)queue1.poll()).data+" ");
		}

	}
}
