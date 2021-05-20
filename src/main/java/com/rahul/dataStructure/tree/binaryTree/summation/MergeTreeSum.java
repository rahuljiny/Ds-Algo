package com.rahul.dataStructure.tree.binaryTree.summation;

import com.rahul.dataStructure.tree.Node;

public class MergeTreeSum {
	public static void main(String[] args)
	{ 
         /* Let us construct the first Binary Tree 
                 1 
               /   \ 
              2     3 
             / \     \ 
            4   5     6 
         */

		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		root1.left.left = new Node(4);
		root1.left.right = new Node(5);
		root1.right.right = new Node(6); 
        
         /* Let us construct the second Binary Tree 
                4 
              /   \ 
             1     7 
            /     /  \ 
           3     2    6   */
		Node root2 = new Node(4);
		root2.left = new Node(1);
		root2.right = new Node(7);
		root2.left.left = new Node(3);
		root2.right.left = new Node(2);
		root2.right.right = new Node(6);

		Node root3 = mergeTrees(root1, root2);
		System.out.printf("The Merged Binary Tree is:\n");
		inorder(root3);
	}

	private static Node mergeTrees(Node root1, Node root2){
		if(root1==null && root2==null)
			return null;
		Node newNode=new Node((root1!=null?root1.data:0)+(root2!=null?root2.data:0));
		newNode.left= mergeTrees(root1==null?null:root1.left,root2==null?null:root2.left);
		newNode.right= mergeTrees(root1==null?null:root1.right,root2==null?null:root2.right);

		return newNode;
	}


	private static void inorder(Node root3){
		if(root3==null)
			return;
		inorder(root3.left);
		System.out.print(root3.data+" ");
		inorder(root3.right);
	}
}
