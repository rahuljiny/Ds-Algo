package com.rahul.dataStructure.other;

import org.apache.commons.lang3.RandomStringUtils;

public class SecretKey {
	public static void main(String[] args) {
		String generatedString = RandomStringUtils.random(16, true, true);
		System.out.println( generatedString.toUpperCase());
	}
}
