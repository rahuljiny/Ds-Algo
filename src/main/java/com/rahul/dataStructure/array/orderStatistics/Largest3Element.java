package com.rahul.dataStructure.array.orderStatistics;

public class Largest3Element {
	public static void main(String[] args) {
		int []arr={20, 10, 30, 4, 100};
		printLargest3Element(arr);
	}
	private static void printLargest3Element(int[] arr){
		int n1,n2,n3;
		n1=n2=n3=Integer.MIN_VALUE;
		for (int i=0;i<arr.length;i++){
			if(arr[i]>n1){
				n3=n2;
				n2=n1;
				n1=arr[i];
				continue;
			}else if(arr[i]>n2){
				n3=n2;
				n2=arr[i];
				continue;
			}else if(arr[i]>n3){
				n3=arr[i];
				continue;
			}
		}
		System.out.println(n1+" "+ n2+" "+n3);
	}
}
