package com.rahul.dataStructure.stack;

import java.util.Stack;

public class PostfixToInfix {
	public static void main(String[] args) {
		String exp="abc++";
		String result=convertPostfixToInfix(exp);
		System.out.println(result);
	}

	private static String convertPostfixToInfix(String exp){
		Stack<String> stack= new Stack<>();
		for (int i=0;i<exp.length();i++){
			char ch= exp.charAt(i);
			if(isOperator(ch)){
				String opr1=stack.pop();
				String opr2=stack.pop();
				String temp="("+opr1+ch+opr2+")";
				stack.push(temp);
			}else {
				stack.push(String.valueOf(ch));
			}
		}
		return stack.pop();
	}
	private static boolean isOperator(char ch){
		switch (ch){
			case '+': case '-': case '/': case '*':
				return true;
		}
		return false;
	}
}
