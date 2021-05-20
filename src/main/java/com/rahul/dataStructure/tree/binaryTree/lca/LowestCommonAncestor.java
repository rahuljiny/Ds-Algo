package com.rahul.dataStructure.tree.binaryTree.lca;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

import java.util.Vector;

public class LowestCommonAncestor {
	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);

		System.out.println("LCA(4, 5): " + findLCA(tree.root,4,5));
		System.out.println("LCA(4, 6): " + findLCA(tree.root,4,6));
		System.out.println("LCA(3, 4): " + findLCA(tree.root,3,4));
		System.out.println("LCA(2, 4): " + findLCA(tree.root,2,4));
	}

	private static int findLCA(Node root,int a,int b){
		if(root==null)
			return -1;
		int commonAncestor=Integer.MIN_VALUE;
		Vector<Node> v1= new Vector<>();
		Vector<Node> v2= new Vector<>();
		getPath(root,a,v1);
		getPath(root,b,v2);
		for(int i=0;i<Math.min(v1.size(),v2.size());i++){
			Node node1=(Node)v1.get(i);
			Node node2=(Node)v2.get(i);
			if(node1.data==node2.data){
				commonAncestor=node1.data;
			}else{
				break;
			}
		}
		return commonAncestor;
	}

	private static boolean getPath(Node root,int a,Vector<Node> v){
		if(root==null)
			return false;
		v.add(root);
		if(root.data==a)
			return true;
		if(root.left!=null && getPath(root.left,a,v))
			return true;
		if(root.right!=null && getPath(root.right,a,v))
			return true;
		v.remove(v.size()-1);
		return false;
	}
}
