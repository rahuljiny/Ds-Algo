package com.rahul.dataStructure.linkedList;

public class LinkedList {

	private Node head;

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getHead() {
		return head;
	}

	public Node pushAtFront(int data){
		if(head==null){
			head=new Node(data);
		}
		else {
			Node node= new Node(data);
			node.next=head;
			head=node;
		}
		return head;
	}

	public Node pushAtNode(int data){
		if(head==null){
			Node node=new Node(data);
			head=node;
		}else {
			Node ptr=head;
			while (ptr!=null){
				if(ptr.data==data)
					break;
				ptr=ptr.next;
			}
			if(ptr==null){
				return head;
			}
			Node node= new Node(data);
			node.next=ptr.next;
			ptr.next=node;
		}
		return head;
	}

	public Node pushAtLast(int data){
		if(head==null){
			Node node=new Node(data);
			head=node;
		}else {
			Node ptr=head;
			while (ptr.next!=null){
				ptr=ptr.next;
			}
			Node node= new Node(data);
			ptr.next=node;
		}
		return head;
	}
	public void print(){
		if(head!=null){
			Node ptr= head;
			while (ptr!=null){
				System.out.print(ptr.data+" ");
				ptr=ptr.next;
			}
			System.out.println(" ");
		}
	}
}
