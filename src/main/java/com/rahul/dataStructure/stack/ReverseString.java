package com.rahul.dataStructure.stack;

import java.util.Stack;

public class ReverseString {
	public static void main(String[] args) {
		Stack<String> stack= new Stack<>();
		stack.push("r");
		stack.push("a");
		stack.push("h");
		stack.push("u");
		stack.push("l");
		printStack(stack);
		reverseStack(stack);
		System.out.println(" ");
		printStack(stack);
	}
	private static void reverseStack(Stack<String> stack){
		if(stack.isEmpty())
			return;
		String temp=stack.pop();
		reverseStack(stack);
		insertAtBottom(stack,temp);
	}

	private static void insertAtBottom(Stack<String> stack, String str){
		if(stack.isEmpty()){
			stack.push(str);
			return;
		}
		String temp=stack.pop();
		insertAtBottom(stack,str);
		stack.push(temp);
	}

	private static void printStack(Stack<String> stack){
		int n=stack.size();
		for (int i=0;i<n;i++){
			System.out.print(stack.elementAt(i)+" ");
		}
	}
}
