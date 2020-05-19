package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

import java.util.HashSet;
import java.util.Set;

public class SumRoot {

	public static void main(String[] args) {
		Node root = new Node(8);
		root.left = new Node(5);
		root.right = new Node(4);
		root.left.left = new Node(9);
		root.left.right = new Node(7);
		root.left.right.left = new Node(1);
		root.left.right.right = new Node(12);
		root.left.right.right.right = new Node(2);
		root.right.right = new Node(11);
		root.right.right.left = new Node(3);
		System.out.print(isPathSum(root)==true ?"Yes" : "No");
	}

	private static boolean isPathSum(Node root){
		Set<Integer> s= new HashSet<>();
		return isPairPresent(root.left,s,root.data)|| isPairPresent(root.right,s,root.data);
	}

	private static boolean isPairPresent(Node root,Set<Integer> s ,int data){
		if(root==null)
			return false;
		if(s.contains(data-root.data)){
			return true;
		}else {
			s.add(root.data);
		}
		boolean res= isPairPresent(root.left,s,data)||isPairPresent(root.right,s,data);
		s.remove(root.data);
		return res;
	}
    
}
