package com.rahul.dataStructure.tree.binaryTree.traversal;

import com.rahul.dataStructure.tree.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class DiagonalPrint {
	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(3);
		root.right = new Node(10);
		root.left.left = new Node(1);
		root.left.right = new Node(6);
		root.right.right = new Node(14);
		root.right.right.left = new Node(13);
		root.left.right.left = new Node(4);
		root.left.right.right = new Node(7);
		diagonalPrint(root);
	}

	private static void diagonalPrint(Node root){
		if (root==null)
			return;
		Map<Integer, Vector<Node>> map= new HashMap<>();
		printDiagonalUtil(root,map,0);
		for(Integer integer1:map.keySet()){
			Vector vector= map.get(integer1);
			vector.forEach(v->{
				Node d=(Node)v;
				System.out.print(d.data+" ");
			});
			System.out.println(" ");
		}
	}

	private static void printDiagonalUtil(Node root,Map<Integer, Vector<Node>> map,int d){
		if(root==null)
			return;
		Vector vector=map.get(d);
		if (vector==null){
			vector= new Vector();
			vector.add(root);
		}else {
			vector.add(root);
		}
		map.put(d,vector);
		printDiagonalUtil(root.left, map,d+1);
		printDiagonalUtil(root.right, map, d);
	}
}
