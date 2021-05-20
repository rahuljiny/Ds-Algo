package com.rahul.dataStructure.stack;

public class TowerOfHanoi {

	public static void main(String[] args) {
		int numberOfStack=4;
		char source='a';
		char via='b';
		char destination='c';
		printTowerOfHanoi(numberOfStack,source,via,destination);
	}

	private static void printTowerOfHanoi(int n, char from,char via,char to){
		if(n==1){
			System.out.println("put stack no "+ n +" from " +from + " to "+to);
			return;
		}else {
			printTowerOfHanoi(n-1,from,to,via);
			System.out.println("put stack no "+ n +" from " +from + " to "+to);
			printTowerOfHanoi(n-1,via,from,to);
		}
	}
}
