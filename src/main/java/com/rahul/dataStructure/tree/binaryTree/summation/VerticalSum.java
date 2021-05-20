package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

import java.util.HashMap;
import java.util.Map;


public class VerticalSum {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left=new  Node(2);
		root.right=new  Node(3);
		root.left.left=new  Node(4);
		root.left.right=new  Node(5);
		root.right.left=new  Node(6);
		root.right.right=new  Node(7);
		System.out.println("Following are the values of" +
				" vertical sums with the positions" +
				" of the columns with respect to root ");
		VerticalSumMain(root);
	}

	private static void VerticalSumMain(Node root){
		if(root==null)
			return;
		Map<Integer,Integer> map=new HashMap<>();
		setVerticalMap(root,map,0);
		for(Integer integer:map.keySet()){
			System.out.println("sum for vertical level"+integer+" is "+map.get(integer));
		}
	}
	private static void setVerticalMap(Node root,Map<Integer,Integer> map,int level){
		if(root==null)
			return;
		if(map.containsKey(level)){
			map.put(level,map.get(level)+root.data);
		}else{
			map.put(level,root.data);
		}
		setVerticalMap( root.left, map, level-1);
		setVerticalMap( root.right, map, level+1);
	}
}
