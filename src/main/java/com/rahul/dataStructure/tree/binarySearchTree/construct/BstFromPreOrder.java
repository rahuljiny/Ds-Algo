package com.rahul.dataStructure.tree.binarySearchTree.construct;

import com.rahul.dataStructure.tree.Node;
import com.rahul.dataStructure.tree.binarySearchTree.BST;

public class BstFromPreOrder {
	public static void main(String[] args) {
		int[] arr={10, 5, 1, 7, 40, 50};
		Node node = createBstPreOrder(arr,0,arr.length-1);
		Node node1=createBstPreOrder(arr,arr.length,new Index(),arr[0], Integer.MIN_VALUE, Integer.MAX_VALUE);
		BST bst= new BST(node);
		BST bst2= new BST(node1);
		bst.levelOrder();
		bst.inOrder(bst.root);
		System.out.println(" ");
		bst2.levelOrder();
	}

	private static class Index{
		int index=0;
	}
	private static Node createBstPreOrder(int[] arr,int size,Index preIndex, int key, int min, int max){
		if(preIndex.index>=size)
			return null;
		Node node=null;
		if(key>min && key<max){
			node = new Node(key);
			preIndex.index++;
			if(preIndex.index<size){
				node.left=createBstPreOrder(arr,size,preIndex,arr[preIndex.index],min,key);
				node.right=createBstPreOrder(arr,size,preIndex,arr[preIndex.index],key,max);
			}
		}
		return node;
	}

	private static Node createBstPreOrder(int[] arr, int start, int end){
		if(start>end)
			return null;
		Node root=new Node(arr[start]);
		int rightRootIndex=findRightRoot(arr,arr[start],start+1,end);
		if(rightRootIndex!=-1)
			root.right=createBstPreOrder(arr,rightRootIndex,end);
		if(rightRootIndex>start+1)
			root.left=createBstPreOrder(arr,start+1,rightRootIndex-1);
		return root;
	}

	private static int findRightRoot(int[] arr,int root,int start,int end){
		if(start>end)
			return -1;
		for(int i=start;i<=end;i++){
			if(arr[i]>root)
				return i;
		}
		return -1;
	}
}
