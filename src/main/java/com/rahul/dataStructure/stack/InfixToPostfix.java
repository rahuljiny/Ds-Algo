package com.rahul.dataStructure.stack;

import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		String exp= "a+b*(c^d-e)^(f+g*h)-i";
		String result = infix2Postfix(exp);
		System.out.println(result);
	}

	private static String infix2Postfix(String exp){
		String result=new String("");
		Stack<Character> stack= new Stack<>();
		for(int i=0;i<exp.length();i++){
			char ch= exp.charAt(i);
			if(Character.isLetterOrDigit(ch))
				result+=ch;
			else if(ch=='(')
				stack.push(ch);
			else if(ch==')'){
				while (!stack.isEmpty() && stack.peek()!='('){
					result+=stack.pop();
				}
				if(!stack.isEmpty() && stack.peek()!='('){
					return "Invalid expression";
				}
				else stack.pop();
			}
			else {
				while (!stack.isEmpty() && pre(ch)<=pre(stack.peek())){
					if(stack.peek()=='(')
						return "Invalid expression";
					result+=stack.pop();
				}
				stack.push(ch);
			}
		}
		while (!stack.isEmpty()){
			if(stack.peek() == '(')
				return "Invalid Expression";
			result += stack.pop();
		}
		return result;
	}

	private static  int pre(char ch){
		switch (ch){
			case '+' : case '-' : return 1;
			case '*' : case  '/': return 2;
			case '^' : return 3;
		}
		return -1;
	}
}
