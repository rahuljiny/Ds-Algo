package com.rahul.dataStructure.tree.binaryTree.checkingPrinting;

import com.rahul.dataStructure.tree.Node;

import java.util.ArrayList;
import java.util.List;

public class RootToNode {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		List<Integer> arr= new ArrayList<>();
		boolean exist=getPath(root,arr,5);
		if(exist)
			arr.forEach(a-> System.out.print(a+" "));
	}

	private static boolean getPath(Node root,List<Integer> arr,int key){
		if(root==null)
			return false;
		arr.add(root.data);
		if(root.data==key)
			return true;
		if(getPath(root.left,arr,key)||getPath(root.right,arr,key))
			return true;
		arr.remove(arr.size()-1);
		return false;
	}
}
