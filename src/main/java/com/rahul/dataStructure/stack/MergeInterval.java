package com.rahul.dataStructure.stack;

import java.util.Stack;

public class MergeInterval {

	public static void main(String[] args) {
		Interval arr[]=new Interval[4];
		arr[0]=new Interval(1,3);
		arr[1]=new Interval(2,4);
		arr[2]=new Interval(5,7);
		arr[3]=new Interval(6,8);
		mergeIntervals(arr);

	}
	private static void mergeIntervals(Interval[] arr){
		sortInterval(arr);
		print(arr);
		Stack<Interval> stack= new Stack<>();
		for(int k=0;k<arr.length;k++){
			if(stack.isEmpty()){
				stack.push(arr[k]);
			}else{
				Interval top=stack.peek();
				if(arr[k].end<=top.end){
					continue;
				}else if(arr[k].start<top.end && arr[k].end>top.end){
					Interval mergedInterval=new Interval(top.start,arr[k].end);
					stack.pop();
					stack.push(mergedInterval);
				}else {
					stack.push(arr[k]);
				}
			}
		}
		System.out.println("Merge stack is");
		printStack(stack);
	}

	private static  void printStack(Stack<Interval> stack){
		for(int i=0;i<stack.size();i++){
			System.out.println(stack.elementAt(i).start +" "+stack.elementAt(i).end);
		}
	}
	private static void sortInterval(Interval[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j].start>arr[j+1].start){
					Interval temp= arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	private static void print(Interval[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].start+" "+arr[i].end);
		}
	}
}



