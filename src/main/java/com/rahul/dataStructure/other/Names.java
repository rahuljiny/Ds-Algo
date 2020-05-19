package com.rahul.dataStructure.other;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Names {

	public static void main(String[] args) {
		try{
			String file="/Users/rahulkumar/Downloads/text.txt";
			File file1= new File(file);
			BufferedReader br = new BufferedReader(new FileReader(file));
			List<String> list= new ArrayList<>();
			String st;
			while ((st = br.readLine()) != null)
				list.add(st.substring(0,st.charAt(st.length()-1)=='\n'?st.length()-1:st.length()));
			List<String> collect = list.stream().filter(l-> l.length()==4).collect(Collectors.toList());
			collect.forEach(c-> System.out.println(c));
			System.out.println(collect.size());
		}catch (Exception e){

		}
		System.out.println(convertToExcel(753));

	}

	private  static String convertToExcel(int n) {
		StringBuilder result = new StringBuilder();
		while (n > 0) {
			result.insert(0, (char) ('A' + n % 26));
			n = n / 26;
		}
		return result.toString();
	}
}
