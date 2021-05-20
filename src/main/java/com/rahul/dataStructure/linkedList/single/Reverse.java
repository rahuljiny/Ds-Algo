package com.rahul.dataStructure.linkedList.single;

import com.rahul.dataStructure.linkedList.LinkedList;
import com.rahul.dataStructure.linkedList.Node;

public class Reverse {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.pushAtLast(11);
		ll.pushAtLast(12);
		ll.pushAtLast(15);
		ll.pushAtLast(21);
		ll.pushAtLast(34);
		ll.pushAtLast(27);
		ll.print();
		ll.setHead(reverseLL(ll.getHead()));
		ll.print();
	}

	private static Node reverseLL(Node head){
		if(head==null)
			return head;
		Node pre=head,curr=head.next;
		pre.next=null;
		while (curr!=null){
			Node next=curr.next;
			curr.next=pre;
			pre=curr;
			curr=next;
		}

		return pre;
	}
}
