package com.rahul.hackerRank;

import java.util.Arrays;

public class KeyboardDrive {
	public static void main(String[] args) {
		int[] keyboards={40,50,60};
		int[] drives={5,8,12};
		int b=60;
		System.out.println(getMoneySpent( keyboards, drives, b));
	}

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int maxMoneySpent=Integer.MIN_VALUE;
		Arrays.sort(keyboards);
		Arrays.sort(drives);
		if(keyboards[0]+drives[0]>b){
			return -1;
		}
		for(int i=0;i<keyboards.length;i++){
			if(keyboards[i]>b){
				break;
			}
			for(int j=0;j<drives.length;j++){
				int keyBoardPrice=keyboards[i];
				int drivePrice=drives[j];
				if(keyBoardPrice+drivePrice>b){
					break;
				}else {
					if(keyBoardPrice+drivePrice>maxMoneySpent){
						maxMoneySpent=keyBoardPrice+drivePrice;
					}
				}
			}
		}
		return maxMoneySpent;
	}
}
