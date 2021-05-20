package com.rahul.hackerRank;

public class AppleOrange {
	public static void main(String[] args) {
		int[] apples={2,3,-4};
		int[] oranges={3,-2,-4};
		countApplesAndOranges( 7, 10, 4, 12, apples, oranges);
	}
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int appleCount=0;
		int orangeCount=0;
		for(int i=0;i<apples.length;i++){
			int pos=a+apples[i];
			if(pos>=s && pos<=t){
				appleCount++;
			}
		}
		for(int i=0;i<oranges.length;i++){
			int pos=b+oranges[i];
			if(pos>=s && pos<=t){
				orangeCount++;
			}
		}
		System.out.println(appleCount);
		System.out.println(orangeCount);

	}
}
