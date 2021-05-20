package com.rahul.dataStructure.tree.binaryTree.summation;

public class KthLevelSum {
	public static void main(String[] args) {
		String tree = "(0(5(6()())(4()(9()())))(7(1()())(3()())))";
		int k = 2;
		System.out.println(sumAtKthLevel(tree, k));
	}

	private static int sumAtKthLevel(String tree, int k){
		int sum=0,level=-1;
		for(int i=0;i<tree.length();i++){
			char ch=tree.charAt(i);
			if(ch=='('){
				level++;
			}
			else if(ch==')'){
				level--;
			}
			else if(level==k){
				sum+=Integer.parseInt(String.valueOf(ch));
			}
		}
		return sum;
	}
}
