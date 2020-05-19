package com.rahul.dataStructure.tree.binarySearchTree.construct;

import com.rahul.dataStructure.linkedList.LinkedList;
import com.rahul.dataStructure.linkedList.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class LLtoBST {
	static Node head;
	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		Node node= new Node(7);
		ll.setHead(node);
		ll.pushAtFront(6);
		ll.pushAtFront(5);
		ll.pushAtFront(4);
		ll.pushAtFront(3);
		ll.pushAtFront(2);
		ll.pushAtFront(1);
		com.rahul.dataStructure.tree.Node treeNode= constructTree(ll);
		BST bst= new BST(treeNode);
		bst.levelOrder();
	}

	private static com.rahul.dataStructure.tree.Node constructTree(LinkedList ll){
		int n=countNode(ll);
		head=ll.getHead();
		return constructTree(n);
	}

	private static com.rahul.dataStructure.tree.Node constructTree(int n){
		if(n<=0){
			return null;
		}
		com.rahul.dataStructure.tree.Node left=constructTree(n/2);
		com.rahul.dataStructure.tree.Node root=new com.rahul.dataStructure.tree.Node(head.data);
		root.left=left;
		head=head.next;
		root.right= constructTree(n-(n/2)-1);
		return root;
	}
	private static int countNode(LinkedList ll){
		if(ll==null)
			return 0;
		Node head= ll.getHead();
		int count=0;
		while (head!=null){
			count++;
			head=head.next;
		}
		return count;
	}
}
