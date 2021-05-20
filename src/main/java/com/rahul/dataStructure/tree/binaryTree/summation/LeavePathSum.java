package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binaryTree.BinaryTree;

public class LeavePathSum {
	public static void main(String args[])
	{
		int sum = 23;

        /* Constructed binary tree is
              10
             /  \
           8     2
          / \   /
         3   5 2
        */
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(2);

		if (hasPathSum(tree.root, sum))
			System.out.println("There is a root to leaf path with sum " + sum);
		else
			System.out.println("There is no root to leaf path with sum " + sum);
	}

	private static boolean hasPathSum(Node root, int sum){
		if(root==null)
			return false;
		if(sum-root.data==0)
			return true;
		return hasPathSum(root.left,sum-root.data)|| hasPathSum(root.right,sum-root.data);
	}
}
