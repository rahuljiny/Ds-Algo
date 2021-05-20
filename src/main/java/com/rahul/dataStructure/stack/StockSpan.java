package com.rahul.dataStructure.stack;

import com.rahul.dataStructure.array.OneDimension;

public class StockSpan {

	public static void main(String[] args) {
		for (int l=0;l<10;l++){
			OneDimension oneDimension= new OneDimension(10);
			printSpan(oneDimension.getArr());
		}


	}
	private static void printSpan(int[] arr){
		int [] span= new int[arr.length];
		span[0]=1;
		for(int i=1;i<arr.length;i++){
			int j=i-1;
			while (j>=0){
				if(arr[i]<arr[j]){
					break;
				}else{
					span[i]=span[i]+span[j];
					j=j-span[j];
				}
			}
			span[i]=span[i]+1;
		}
		for (int k=0;k<span.length;k++){
			System.out.print(span[k]+"  ");
		}
		System.out.println(" ");
	}
}
