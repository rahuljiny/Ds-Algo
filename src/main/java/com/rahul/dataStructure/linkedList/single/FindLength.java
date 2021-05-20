package com.rahul.dataStructure.linkedList.single;

import com.rahul.dataStructure.linkedList.LinkedList;
import com.rahul.dataStructure.linkedList.Node;

public class FindLength {
	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.pushAtFront(5);
		ll.pushAtFront(6);
		ll.pushAtLast(3);
		int iterativeLength=findIterativeLength(ll.getHead());
		System.out.println(iterativeLength);
		int recursiveLength=findLengthRecursively(ll.getHead());
		System.out.println(recursiveLength);
	}

	private static int findIterativeLength(Node node){
		int count=0;
		while (node!=null){
			count++;
			node=node.next;
		}
		return count;
	}
	private static int findLengthRecursively(Node node){
		if(node==null)
			return 0;
		return 1+findLengthRecursively(node.next);
	}
}
