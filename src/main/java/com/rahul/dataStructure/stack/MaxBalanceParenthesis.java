package com.rahul.dataStructure.stack;

import java.util.Stack;

public class MaxBalanceParenthesis {
	public static void main(String[] args) {
		String exp = "( ((X)) ()((((Y)))) )";
		int maxPar=countMaxPar(exp);
		System.out.println(maxPar);
	}

	private static int countMaxPar(String expStr){
		Stack<Character> stack= new Stack<>();
		char[] exp=expStr.toCharArray();
		int maxCount=0;
		int currentCount=0;
		for (int i=0;i<exp.length;i++){
			char ch= exp[i];
			if(ch=='{' || ch=='['|| ch=='('){
				stack.push(ch);
				currentCount++;
				maxCount=currentCount;
			}if(ch=='}' || ch==']'|| ch==')'){
				if(stack.isEmpty())
					return -1;
				if(!matchingPair(ch,stack.peek())){
					return -1;
				}
				stack.pop();
				currentCount--;
			}
		}
		if(!stack.isEmpty()){
			return -1;
		}
		return maxCount;
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
