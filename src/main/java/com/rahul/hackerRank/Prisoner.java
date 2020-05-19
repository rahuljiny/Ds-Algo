package com.rahul.hackerRank;


import java.util.List;

import static com.rahul.util.CommonUtil.readInputInteger;
import static com.rahul.util.CommonUtil.readOutputInteger;

public class Prisoner {
	public static void main(String[] args) {
		String inputFile="/Users/rahulkumar/Downloads/input.txt";
		String outputFile="/Users/rahulkumar/Downloads/output.txt";
		List<List<Integer>> inputLists = readInputInteger(inputFile);
		List<Integer> outputList = readOutputInteger(outputFile);
		for(int i=0;i<inputLists.size();i++){
			int outcome = saveThePrisoner(inputLists.get(i).get(0), inputLists.get(i).get(1), inputLists.get(i).get(2));
			int fileOutput=outputList.get(i).intValue();
			if(outcome!=fileOutput){
				System.out.println("Running test case no "+(i+1));
				System.out.println(inputLists.get(i).get(0)+" "+inputLists.get(i).get(1)+" "+inputLists.get(i).get(2));
				System.out.println("Output from file is "+outputList.get(i) + " Output from method is "+outcome);

			}
		}
	}

	static int saveThePrisoner(int n, int m, int s) {
		int mod=(m+s-1)%n;
		if(mod==0)
			return n;
		return mod;
	}
}
