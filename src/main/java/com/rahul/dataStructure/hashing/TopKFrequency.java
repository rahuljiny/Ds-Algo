package com.rahul.dataStructure.hashing;


import java.util.HashMap;
import java.util.Map;

public class TopKFrequency {
	public static void main(String[] args) {
		int k = 4;
		int[] arr = {5, 2, 1, 3, 2};
		int n = arr.length;
		kTop(arr, n, k);
	}

	private static void kTop(int[] arr, int n,int  k){
		Map<Integer,Integer> freq=new HashMap<>();
		int[] temp= new int[k+1];
		for(int i=0;i<temp.length;i++){
			freq.put(i,0);
		}
		for(int j=0;j<n;j++){
			if(freq.containsKey(arr[j]))
				freq.put(arr[j],freq.get(arr[j])+1);
			else freq.put(arr[j],1);
			temp[k]=arr[j];
			int l=find(temp,arr[j]);
			l--;
			while (l>=0){
				if(freq.get(temp[l])<freq.get(temp[l+1])){
					int a=temp[l];
					temp[l]=temp[l+1];
					temp[l+1]=a;
				} else  if(freq.get(temp[l])==freq.get(temp[l+1]) && temp[l]>temp[l+1]){
					int b=temp[l];
					temp[l]=temp[l+1];
					temp[l+1]=b;
				}else {
					break;
				}
				l--;
			}
			for (int c=0; c<k && temp[c]!=0;c++ ){
				System.out.print(temp[c]+" ");
			}
			System.out.println(" ");
		}
	}

	private static int find(int[] temp,int ele){
		for(int x=0;x<temp.length;x++){
			if(temp[x]==ele)
				return x;
		}
		return -1;
	}
}
