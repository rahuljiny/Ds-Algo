package com.rahul.dataStructure.matrix;


import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int[] arr={5,4,4,2,2,8};
		int[] result=cutTheSticks(arr);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

	static int[] cutTheSticks(int[] arr) {
		List<Integer> list= new ArrayList<>();
		int count=0;
		while(true){
			int noStick=0;
			int min=findMin(arr);
			if(min==Integer.MAX_VALUE){
				break;
			}
			for(int i=0;i<arr.length;i++){
				if(arr[i]>0){
					arr[i]=arr[i]-min;
					noStick++;
				}
			}
			list.add(noStick);
		}
		int[] result= new int[list.size()];
		for(int i=0;i<list.size();i++){
			result[i]=list.get(i);
		}
		return result;
	}

	static int findMin(int[] arr){
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0 && arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}
}
