package com.rahul.dataStructure.other;

class Solution {

	public static void main(String[] args) {
		System.out.println(convertToExcel(27));
	}
	private static  String convertToExcel(int n) {
		StringBuilder result = new StringBuilder();
		while (n > 0) {
			n--;
			result.insert(0, (char) ('A' + n % 26));
			n = n / 26;
		}
		return result.toString();
	}
}
