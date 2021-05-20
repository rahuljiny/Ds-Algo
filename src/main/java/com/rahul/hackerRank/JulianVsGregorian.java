package com.rahul.hackerRank;

public class JulianVsGregorian {

	public static void main(String[] args) {
		int year=2017;
		System.out.println(dayOfProgrammer(year));
	}

	static String dayOfProgrammer(int year) {
		String result=null;
		if(year==1918){
			result= "2.09.1918";
		}
		else if(year<1918){
			if(year%4==0){
				result= "12.09."+year;
			}else{
				result= "13.09."+year;
			}
		}else if(year>1918){
			if((year%400==0)||(year%4==0 && year%100!=0)){
				result= "12.09."+year;
			}else{
				result= "13.09."+year;
			}
		}
		return result;
	}
}
