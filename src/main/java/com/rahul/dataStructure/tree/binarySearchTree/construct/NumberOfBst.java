package com.rahul.dataStructure.tree.binarySearchTree.construct;

import com.rahul.dataStructure.tree.Node;

import java.util.ArrayList;
import java.util.List;

public class NumberOfBst {
	public static void main(String[] args) {
		List<Node> nodes= constructTree(1,3);
		for(Node node :nodes){
			preOrder(node);
			System.out.println();
		}
	}

	private static List<Node> constructTree(int start,int end){
		List<Node> list= new ArrayList<>();
		if(start>end){
			list.add(null);
			return list;
		}
		for(int i=start;i<=end;i++){
			List<Node> leftSubTree=constructTree(start,i-1);
			List<Node> rightSubTree=constructTree(i+1,end);
			for(int j=0;j<leftSubTree.size();j++){
				Node left= leftSubTree.get(j);
				for(int k=0;k<rightSubTree.size();k++){
					Node right=rightSubTree.get(k);
					Node node= new Node(i);
					node.left=left;
					node.right=right;
					list.add(node);
				}
			}
		}
		return list;
	}
	private static void preOrder(Node node){
		if(node==null)
			return;
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
}
