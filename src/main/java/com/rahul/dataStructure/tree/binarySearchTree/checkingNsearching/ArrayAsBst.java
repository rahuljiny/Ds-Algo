package com.rahul.dataStructure.tree.binarySearchTree.checkingNsearching;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayAsBst {
	public static void main(String[] args) {
		int arr[] = {11, 6, 13, 5, 12, 10};
		int n = arr.length;
		if (levelOrderIsOfBST(arr, n))
			System.out.print( "Yes");
		else
			System.out.print( "No");
	}
	static class QueueNode{
		int data;
		int min;
		int max;
		public QueueNode(int key,int mi,int ma){
			data=key;
			min=mi;
			max=ma;
		}
	}
	private static boolean levelOrderIsOfBST(int[] arr,int n){
		if(n==0)
			return false;
		Queue<QueueNode> queueNodes= new LinkedList<>();
		QueueNode rootQueue=new QueueNode(arr[0],Integer.MIN_VALUE,Integer.MAX_VALUE);
		queueNodes.add(rootQueue);
		int index=1;
		while (!queueNodes.isEmpty()){
			int size=queueNodes.size();
			while (size>0){
				QueueNode queueNode=queueNodes.poll();
				if(index<arr.length && arr[index]>queueNode.min && arr[index]<queueNode.data){
					QueueNode leftQueue= new QueueNode(arr[index],queueNode.min,queueNode.data);
					queueNodes.add(leftQueue);
					index++;
				}if(index<arr.length && arr[index]>queueNode.data && arr[index]<queueNode.max){
					QueueNode rightQueue= new QueueNode(arr[index],queueNode.data,queueNode.max);
					queueNodes.add(rightQueue);
					index++;
				}
				size--;
			}
		}
		if(queueNodes.isEmpty() && index==arr.length){
			return true;
		}
		return false;
	}
}
