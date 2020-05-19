package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DiagonalSum {
	static Map<Integer, List<Node>>nodeMap= new HashMap<>();
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node (2);
		root.right = new Node (3);
		root.left.left = new Node (9);
		root.left.right = new Node (6);
		root.right.left = new Node (4);
		root.right.right = new Node (5);
		root.right.left.left = new Node (12);
		root.right.left.right = new Node (7);
		root.left.right.left = new Node (11);
		root.left.left.right = new Node (10);
		printDiagonalSum(root);
	}

	private static void printDiagonalSum(Node root){
		diagonalSum(root,0);
		nodeMap.keySet().forEach(i->{
			List<Node> nodes = nodeMap.get(i);
			Integer sum = nodes.stream().map(n -> n.data).reduce(0, (a, b) -> a + b);
			System.out.println(sum+" ");
		});
	}
	private static void diagonalSum(Node root, int level){
		if(root==null)
			return;
		if(nodeMap.get(level)==null || CollectionUtils.isEmpty(nodeMap.get(level))){
			List<Node> nodeList= new ArrayList<>();
			nodeList.add(root);
			nodeMap.put(level,nodeList);
		}else {
			nodeMap.get(level).add(root);
		}
		diagonalSum(root.right,level);
		diagonalSum(root.left,level+1);
	}
}
