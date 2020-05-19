package com.rahul.dataStructure.stack;

public class StackArray {

	static final int max=100;
	int top=-1;
	int[] arr=new int[max];

	public void push(int data){
		if(top==max){
			System.out.println("Overflow");
		}
		arr[++top]=data;
	}
	public int pop(){
		if (top==-1){
			System.out.println("Underflow");
		}
		return arr[top--];
	}
	public int peek(){
		if (top==-1){
			System.out.println("Empty");
		}
		return arr[top];
	}
	public boolean isEmpty(){
		return top==-1;
	}
	public boolean isFull(){
		return top==max;
	}

	public void print(){
		for (int i=top;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}

}
