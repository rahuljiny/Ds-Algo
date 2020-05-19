package com.rahul.hackerRank;

public class Lexicography {
	public static void main(String[] args) {
		String str="ab";
		String out="imllmmcslslkyoegyoam";
		System.out.println(biggerIsGreater(str));
	}

	static String biggerIsGreater(String w) {

		char[] arr=w.toCharArray();
		int n=w.length();
		int i=n-2;
		while (i>=0 && arr[i]>=arr[i+1]){
			i--;
		}
		if(i<0){
			return "no answer";
		}
		int j=n-1;
		while (j>i && arr[j]<=arr[i]){
			j--;
		}
		swap(arr,i,j);
		int k=i+1,l=n-1;
		while (k<l){
			swap(arr,k,l);
			k++;
			l--;
		}
		StringBuilder sb= new StringBuilder();
		for(int a=0;a<arr.length;a++){
			sb.append(arr[a]);
		}

		return sb.toString();
	}
	private static void swap(char[] arr,int i,int j){
		char temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	private static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}
}
