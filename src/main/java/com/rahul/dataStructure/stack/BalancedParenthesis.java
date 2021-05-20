package com.rahul.dataStructure.stack;

import java.util.Stack;

public class BalancedParenthesis {

	public static void main(String[] args) {
		char exp[] = {'{','(',')','}','[',']'};
		if(checkIfBalance(exp)){
			System.out.println("Balance");
		}else System.out.println("Not Balance");
	}

	private static boolean checkIfBalance(char[] exp){
		Stack<Character> stack= new Stack<>();
		for (int i=0;i<exp.length;i++){
			char ch= exp[i];
			if(ch=='{' || ch=='['|| ch=='('){
				stack.push(ch);
			}if(ch=='}' || ch==']'|| ch==')'){
				if(stack.isEmpty())
					return false;
				if(!matchingPair(ch,stack.peek())){
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

	private static boolean matchingPair(char ch,char top){
		if(ch==')' && top=='(' || ch=='}' && top=='{' || ch==']' && top=='[' )
			return true;
		return false;
	}
}
