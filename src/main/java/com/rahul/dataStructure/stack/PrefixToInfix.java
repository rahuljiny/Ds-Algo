package com.rahul.dataStructure.stack;

import java.util.Stack;

public class PrefixToInfix {
	public static void main(String[] args) {
		String exp= "*+AB-CD";
		String result=convertPrefixToInfix(exp);
		System.out.println(result);
	}

	private static String convertPrefixToInfix(String exp){
		String result= new String("");
		Stack<String> stack= new Stack<>();
		for (int i=exp.length()-1;i>=0;i--){
			if(isOperator(exp.charAt(i))){
				String opr1=stack.pop();
				String opr2=stack.pop();
				result="("+opr1+exp.charAt(i)+opr2+")";
				stack.push(result);
			}else {
				stack.push(String.valueOf(exp.charAt(i)));
			}
		}
		result="";
		while (!stack.isEmpty()){
			result=result+stack.pop();
		}

		return result;
	}

	private static boolean isOperator(char ch){
		switch (ch){
			case '+': case '-': case '/': case '*':
				return true;
		}
		return false;
	}
}
