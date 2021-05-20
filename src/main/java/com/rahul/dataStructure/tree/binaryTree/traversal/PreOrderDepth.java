package com.rahul.dataStructure.tree.binaryTree.traversal;

public class PreOrderDepth {
	public static void main(String[] args) {
		String str="nlnnlll";
		char[] strArr=str.toCharArray();
		int depth=findDepth(strArr,0);
		System.out.println(depth);
	}

	private static int findDepth(char[] strArr,int charAt){
		if(strArr[charAt]=='l' || charAt>strArr.length){
			return 0;
		}
		charAt++;
		int left=findDepth(strArr,charAt);
		charAt++;
		int right=findDepth(strArr,charAt);
		return Math.max(left,right)+1;
	}
}
