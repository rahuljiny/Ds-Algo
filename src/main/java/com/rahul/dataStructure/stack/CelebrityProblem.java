package com.rahul.dataStructure.stack;

import java.util.Stack;

public class CelebrityProblem {
	static int MATRIX[][] = { { 0, 0, 1, 0 },
			{ 0, 0, 1, 0 },
			{ 0, 0, 0, 0 },
			{ 0, 0, 1, 0 } };

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		int ch=findCelebrity(stack);
		if (ch == -1)
		{
			System.out.println("No Celebrity");
		}
		System.out.println(ch);
	}

	private static int findCelebrity(Stack<Integer> stack){
		while (stack.size()>1) {
			int a, b;
			a = stack.pop();
			b = stack.pop();
			if (knows(a, b)) {
				stack.push(b);
			} else stack.push(a);
		}
		int c=stack.pop();
		for(int i=0;i<stack.size();i++){
			if(stack.elementAt(i)!=c && knows(stack.elementAt(i),c) || !knows(c,stack.elementAt(i))){
				return -1;
			}
		}
		return c;
	}

	private static boolean knows( int a, int b){
		return MATRIX[a][b]==1;
	}
}
