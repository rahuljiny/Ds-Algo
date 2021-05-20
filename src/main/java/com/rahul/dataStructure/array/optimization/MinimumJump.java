package com.rahul.dataStructure.array.optimization;

public class MinimumJump {
	public static void main(String[] args) {
		int[] arr={1,3,5,8,9,2,6,7,6,8,9};
		int n=arr.length;
		int[] minJumpArr=new int[n];
		minJumpArr[0]=0;
		findMinJump(arr,0,minJumpArr);
		System.out.println(minJumpArr[arr.length-1]);
	}

	private static void findMinJump(int []arr,int currentIndex,int[] minJumpArr){
		for (int i=currentIndex+1;i<arr.length && i<=currentIndex+arr[currentIndex];i++){
			if(minJumpArr[i]==0)
				minJumpArr[i]=minJumpArr[currentIndex]+1;
			else
			minJumpArr[i]=Math.min(minJumpArr[i],1+minJumpArr[currentIndex]);
		}
		for (int i=currentIndex+1;i<arr.length && i<=currentIndex+arr[currentIndex];i++){
			findMinJump(arr,i,minJumpArr);
		}
	}
}
