package com.rahul.dataStructure.tree.binarySearchTree.construct;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class SortedArrayToBst {
	static int start=0;
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7};
		Node node=arrayToBst(arr,arr.length);
		BST bst= new BST(node);
		bst.levelOrder();
	}

	private static Node arrayToBst(int[] arr,int n){
		if(n<=0)
			return null;
		Node left=arrayToBst(arr,n/2);
		Node root= new Node(arr[start]);
		start++;
		root.left=left;
		root.right=arrayToBst(arr,n-(n/2)-1);
		return root;

	}
}
