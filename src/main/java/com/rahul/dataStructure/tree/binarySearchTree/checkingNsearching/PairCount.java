package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

import java.util.Stack;

public class PairCount {
	public static void main(String[] args) {
		BST bst1= new BST();
		bst1.root = new Node(5);       /*             5        */
		bst1.root.left = new Node(3); /*           /   \      */
		bst1.root.right = new Node(7); /*         3     7     */
		bst1.root.left.left = new Node(2); /*    / \   / \    */
		bst1.root.left.right = new Node(4); /*  2   4 6   8    */
		bst1.root.right.left = new Node(6);
		bst1.root.right.right = new Node(8);

		BST bst2= new BST();
		bst2.root = new Node(10);        /*           10         */
		bst2.root.left = new Node(6); /*           /   \        */
		bst2.root.right = new Node(15); /*        6     15      */
		bst2.root.left.left = new Node(3); /*    / \   /  \     */
		bst2.root.left.right = new Node(8); /*  3  8  11  18    */
		bst2.root.right.left = new Node(11);
		bst2.root.right.right = new Node(18);
		int x = 16;
		System.out.println("Pairs = " + countPairs(bst1.root, bst2.root, x));
	}

	private static int countPairs(Node root1, Node root2, int x){
		int count =0;
		if(root1==null || root2==null)return 0;
		Stack<Node> stack1= new Stack<>();
		Stack<Node> stack2= new Stack<>();
		Node top1,top2;
		while (true){
			while (root1!=null){
				stack1.add(root1);
				root1=root1.left;
			}
			while (root2!=null){
				stack2.add(root2);
				root2=root2.right;
			}
			if(stack1.isEmpty() || stack2.isEmpty()){
				break;
			}
			top1=stack1.peek();
			top2=stack2.peek();
			if(top1.data+top2.data==x){
				count++;
				System.out.println(top1.data+" "+top2.data);
				stack1.pop();
				stack2.pop();
				root1=top1.right;
				root2=top2.left;
			}
			if(top1.data+top2.data<x){
				stack1.pop();
				root1=top1.right;
			}
			if(top1.data+top2.data>x){
				stack2.pop();
				root2=top2.left;
			}
		}
		return count;
	}

}
