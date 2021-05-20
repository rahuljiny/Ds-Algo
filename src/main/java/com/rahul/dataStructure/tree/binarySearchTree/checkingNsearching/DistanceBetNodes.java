package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class DistanceBetNodes {
	static int lcaDist=0;
	public static void main(String[] args) {
		BST tree= new BST();
		tree.root = new Node(8);
		tree.root.left = new Node(5);
		tree.root.right = new Node(9);
		tree.root.left.left = new Node(2);
		tree.root.left.right = new Node(7);
		tree.root.left.left.left = new Node(1);
		tree.levelOrder();
		int dist=findDistance(tree.root,2,7);
		System.out.println(dist);
	}

	private static int findDistance(Node root,int n1,int n2){
		findLcaDistance(root,n1,n2,0);
		 return findLevel(root,n1,0)+findLevel(root,n2,0)-(2*lcaDist);
	}

	private static void findLcaDistance(Node root,int n1,int n2,int dist){
		if(root==null)
			return;
		if((root.data<=n1 && root.data>=n2)||(root.data>=n1 && root.data<=n2)){
			lcaDist=dist;
			return;
		}
		if(root.data>n1 && root.data>n2){
			findLcaDistance(root.left,n1,n2,(dist+1));
		}else {
			findLcaDistance(root.right,n1,n2,(dist+1));
		}
	}

	private static int  findLevel(Node root,int n,int level){
		if(root==null){
			return -1;
		}
		if(root.data==n)
			return level;
		int l=findLevel(root.left,n,level+1);
		return l!=-1?l:findLevel(root.right,n,level+1);
	}
}
