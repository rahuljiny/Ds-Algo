package com.rahul.hackerRank;

import java.util.ArrayList;
import java.util.List;

public class Grading {
	public static void main(String[] args) {
		List<Integer> grades= new ArrayList<>();
		grades.add(38);
		gradingStudents(grades);
		grades.forEach(g-> System.out.println(g));

	}
	public static List<Integer> gradingStudents(List<Integer> grades) {
		for(int i=0;i<grades.size();i++){
			grades.set(i,findGrade(grades.get(i)));
		}
		return grades;
	}
	private static int findGrade(int grade){
		if(grade<38)
			return grade;
		if(grade<40){
			return 40;
		}
		int mod=grade%5;
		if(mod==0)
			return grade;
		if(mod>2)
			return grade+(5-mod);
		return grade;
	}
}
