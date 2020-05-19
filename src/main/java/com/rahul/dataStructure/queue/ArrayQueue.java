package com.rahul.dataStructure.queue;

public class ArrayQueue {

	int size;
	int arr[];
	int topOfQueue;
	int startOfQueue;
	ArrayQueue(int size){
		this.size=size;
		topOfQueue=startOfQueue=-1;
	}

	public void createQueue(){
		arr= new int[size];
	}

	public void insertIntoQueue(int data){
		if(isFull()){
			System.out.println("queue is full");
			return;
		}
		if(startOfQueue==-1){
			startOfQueue++;
		}
		arr[++topOfQueue]=data;
	}
	public int deQueue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}
		int item= arr[startOfQueue++];
		if(startOfQueue>topOfQueue){
			startOfQueue=topOfQueue=-1;
		}
		return item;
	}

	public boolean isEmpty(){
		return startOfQueue>topOfQueue;
	}

	public boolean isFull(){
		return topOfQueue==size-1;
	}
}
