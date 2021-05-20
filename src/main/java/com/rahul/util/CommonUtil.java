package com.rahul.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonUtil {

	public static void printArray(int[] arr){
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
	}

	public static void swap(int[] arr, int i, int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static List<List<Integer>> readInputInteger(String inputFile){
			List<List<Integer>> response= new ArrayList<>();
			try {
				File myObj = new File(inputFile);
				Scanner myReader = new Scanner(myObj);
				while (myReader.hasNextLine()) {
					List<Integer> input=new ArrayList<>();
					String data = myReader.nextLine();
					String[] datas=data.split(" ");
					for(int i=0;i<datas.length;i++){
						input.add(Integer.valueOf(datas[i]));
					}
					response.add(input);
				}
				myReader.close();
			} catch (FileNotFoundException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
			return response;
	}

	public static List<Integer> readOutputInteger(String outputFile){
		List<Integer> response= new ArrayList<>();
		try {
			File myObj = new File(outputFile);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				response.add(Integer.valueOf(data));
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return response;
	}

}
