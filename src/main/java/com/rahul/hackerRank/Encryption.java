package com.rahul.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class Encryption {
	public static void main(String[] args) {
		String str="iffactsdontfittotheorychangethefacts";
		System.out.println(encryption(str));
	}
	static String encryption(String s) {
		s=s.replaceAll(" ","");
		int n=s.length();
		char[] str=s.toCharArray();
		double sqrt=Math.sqrt(n);
		int row=Double.valueOf(Math.floor(sqrt)).intValue();
		int col=Double.valueOf(Math.ceil(sqrt)).intValue();
		if(row*col<n){
			row++;
		}
		List<String> stringList= new ArrayList<>();
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				int pos=((i*col)+j);
				if(pos<n){
					char ch=str[pos];
					if(stringList.size()<=j){
						String temp=""+ch;
						stringList.add(temp);
					}else{
						String temp=stringList.get(j);
						stringList.set(j,temp+ch);
					}
				}
			}
		}
		String join = String.join(" ", stringList);
		return join;
	}
}
