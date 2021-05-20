package com.rahul.dataStructure.stack;

import java.util.Stack;

public class PrefixToPostfix {

	public static void main(String[] args) {
		String exp="*+AB-CD";
		String result=convertPrefixToPostfix(exp);
		System.out.println(result);
	}

	private static String convertPrefixToPostfix(String exp){
		Stack<String> stack= new Stack<>();
		for (int i=exp.length()-1;i>=0;i--){
			char ch=exp.charAt(i);
			if(isOperator(ch)){
				String opr1=stack.pop();
				String opr2=stack.pop();
				String temp="("+opr1+opr2+String.valueOf(ch)+")";
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
