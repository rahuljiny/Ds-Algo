package com.rahul.dataStructure.tree;

public class Node {
	public int data;
	public Node left;
	public Node right;
	public boolean visited;

	public Node(int date){
		this.data=date;
		left=null;
		right=null;
		visited=false;
	}
}
