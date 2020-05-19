package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

import java.util.HashMap;
import java.util.Map;

public class MaxSumNoAdjacent {

	public static void main(String args[]){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
		root.left.left = new Node(1);
		System.out.print(getMaxSum(root));
	}

	private static int getMaxSum(Node root){
		if(root==null){
			return 0;
		}
		Map<Node,Integer> sumMap= new HashMap<>();
		return getMaxSumUtil(root,sumMap);
	}

	private static int getMaxSumUtil(Node root,Map<Node,Integer> sumMap){
		if(root==null)
			return 0;
		if(sumMap.containsKey(root))
			return sumMap.get(root);
		int incl=root.data+sumOfGrandChildren(root,sumMap);
		int excl=getMaxSumUtil(root.left,sumMap)+getMaxSumUtil(root.right,sumMap);
		sumMap.put(root,Math.max(incl,excl));
		return sumMap.get(root);
	}
	private static int sumOfGrandChildren(Node root,Map<Node,Integer> sumMap){
		int sum=0;
		if(root.left!=null){
			sum+=getMaxSumUtil(root.left.left,sumMap)+getMaxSumUtil(root.left.right,sumMap);
		}
		if(root.right!=null){
			sum+=getMaxSumUtil(root.right.left,sumMap)+getMaxSumUtil(root.right.left,sumMap);
		}
		return sum;
	}
}
