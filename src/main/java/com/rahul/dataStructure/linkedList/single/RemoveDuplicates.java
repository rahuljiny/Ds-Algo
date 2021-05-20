package com.rahul.dataStructure.linkedList.single;

import com.rahul.dataStructure.linkedList.LinkedList;
import com.rahul.dataStructure.linkedList.Node;

public class RemoveDuplicates {
	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.pushAtLast(11);
		ll.pushAtLast(11);
		ll.pushAtLast(11);
		ll.pushAtLast(21);
		ll.pushAtLast(34);
		ll.pushAtLast(34);
		ll.print();
		ll.setHead(removeDuplicate(ll.getHead()));
		ll.print();
	}
	private static Node removeDuplicate(Node node){
		if(node==null)
			return node;
		Node pre=node,curr=node.next;
		while (curr!=null){
			if(curr.data==pre.data){
				pre.next=curr.next;
			}else {
				pre=pre.next;
			}
			curr=curr.next;
		}
		return node;
	}
}
