package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

public class OnlyOneChild {
	public static void main(String[] args) {
		int pre[] = new int[]{8, 3, 5, 7, 6};
		int size = pre.length;
		if (hasOnlyOneChild(pre, size) == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	private static boolean hasOnlyOneChild(int[] pre, int size){
		int firstDiff,lastDiff;
		for(int i=0;i<size-1;i++){
			firstDiff=pre[i]-pre[i+1];
			lastDiff=pre[i]-pre[size-1];
			if(firstDiff*lastDiff<0)
				return false;
		}
		return true;
	}
}
