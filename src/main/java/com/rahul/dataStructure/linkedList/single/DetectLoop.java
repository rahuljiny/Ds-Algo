package com.rahul.dataStructure.linkedList.single;

import com.rahul.dataStructure.linkedList.LinkedList;
import com.rahul.dataStructure.linkedList.Node;

public class DetectLoop {
	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.pushAtFront(5);
		ll.pushAtFront(4);
		ll.pushAtFront(3);
		ll.pushAtFront(2);
		ll.pushAtFront(1);
		ll.print();
		boolean loopExist=detectLoop(ll.getHead());
		System.out.println(loopExist);
		ll.getHead().next.next.next.next.next=ll.getHead().next.next;
		boolean loopExist2=detectLoop(ll.getHead());
		System.out.println(loopExist2);
	}
	private static boolean detectLoop(Node head){
		if(head==null)
			return false;
		Node slow=head,fast=head.next;
		boolean loopExist=false;
		while (fast!=null && fast.next!=null){
			if(fast==slow){
				loopExist=true;
				break;
			}
			slow=slow.next;
			fast=fast.next.next;
		}
		return loopExist;
	}
}
