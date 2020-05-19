package com.rahul.dataStructure.stack;

public class DeleteMiddleElement {
	public static void main(String[] args) {
		int n=5;
		StackArray stack= new StackArray();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.print();
		deleteMidElement(stack,n);
		System.out.println(" ");
		stack.print();
	}

	private static void deleteMidElement(StackArray stack,int n){
		if (stack.isEmpty())
			return;
		int temp=stack.pop();
		deleteMidElement(stack,n);
		if(temp!=stack.arr[n/2]){
			stack.push(temp);
		}
	}
}
