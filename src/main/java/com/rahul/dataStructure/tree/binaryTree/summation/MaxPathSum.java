package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

public class MaxPathSum {
	static int maxSum;
	static int maxLength;
	public static void main(String[] args) {
		Node root = new Node(4);         /*        4        */
		root.left = new Node(2);         /*       / \       */
		root.right = new Node(5);        /*      2   5      */
		root.left.left = new Node(7);    /*     / \ / \     */
		root.left.right = new Node(1);   /*    7  1 2  3    */
		root.right.left = new Node(2);   /*      /          */
		root.right.right = new Node(3);  /*     6           */
		root.left.right.left = new Node(6);

		System.out.println( "Sum = "
				+ sumOfLongRootToLeafPathUtil(root,0,0));
	}

	static class TEMP
	{
		int x;

		TEMP(int a)
		{
			x = a;
		}
	}

	static Node recursiveNode(Node node, int k, TEMP temp) {
		if (node == null) return null;
		TEMP left = new TEMP(temp.x + (node.data));
		TEMP right = new TEMP(left.x);
		node.left = recursiveNode(node.left, k, left);
		node.right = recursiveNode(node.right, k, right);
		temp.x = Math.max(left.x, right.x);
		if (temp.x < k)
		{
			node = null;
		}
		return node;
	}
	private static int sumOfLongRootToLeafPathUtil(Node root,int sum,int length){
		if(root==null)
			return 0;
		sum+=root.data;
		if(root.left==null && root.right==null){
			if(length>maxLength){
				maxLength=length;
				if(sum>maxSum){
					maxSum=sum;
				}
			}else if(length==maxLength){
				maxSum=sum>maxSum?sum:maxSum;
			}

		}
		sumOfLongRootToLeafPathUtil(root.left,sum,length+1);
		sumOfLongRootToLeafPathUtil(root.right,sum,length+1);
		return maxSum;
	}
}
