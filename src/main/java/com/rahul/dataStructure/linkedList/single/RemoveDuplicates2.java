package com.rahul.dataStructure.linkedList.single;

import com.rahul.dataStructure.linkedList.LinkedList;
import com.rahul.dataStructure.linkedList.Node;

public class RemoveDuplicates2 {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.pushAtLast(11);
		ll.pushAtLast(12);
		ll.pushAtLast(11);
		ll.pushAtLast(21);
		ll.pushAtLast(34);
		ll.pushAtLast(21);
		ll.print();
		ll.setHead(removeDuplicate(ll.getHead()));
		ll.print();
	}
	private static Node removeDuplicate(Node node){
		if(node==null)
			return node;
		Node start=node;
		while (start.next!=null){
			Node pre=start,curr=start.next;
			while (curr!=null){
				if(curr.data==start.data){
					pre.next=curr.next;
				}else {
					pre=pre.next;
				}
				curr=curr.next;
			}
			start=start.next;
		}
		return node;
	}
}
