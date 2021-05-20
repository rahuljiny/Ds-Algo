package com.rahul.hackerRank;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lexi {
	public static void main(String[] args) {
		try{
			String inputFile="/Users/rahulkumar/Downloads/input.txt";
			String outputFile="/Users/rahulkumar/Downloads/output.txt";
			File myObj1 = new File(inputFile);
			File myObj2 = new File(outputFile);
			Scanner myReader1 = new Scanner(myObj1);
			Scanner myReader2 = new Scanner(myObj2);
			List<String> inputList= new ArrayList<>();
			List<String> outputList= new ArrayList<>();
			while (myReader1.hasNextLine()) {
				String data = myReader1.nextLine();
				inputList.add(data);
			}
			while (myReader2.hasNextLine()) {
				String data = myReader2.nextLine();
				outputList.add(data);
			}
			for(int i=0;i<inputList.size();i++){
				String input=inputList.get(i);
				String output = biggerIsGreater(input);
				String fileOutput=outputList.get(i);
				if(!StringUtils.equalsIgnoreCase(output,fileOutput)){
					System.out.println(inputList.get(i));
				}
			}
		}catch (Exception e){

		}
	}

	static String biggerIsGreater(String w) {
		char[] arr=w.toCharArray();
		int n=w.length();
		int i=n-2;
		while (i>=0 && arr[i]>=arr[i+1]){
			i--;
		}
		if(i==0){
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
}
