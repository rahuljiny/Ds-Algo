package com.rahul.hackerRank;

public class BirthdayBall {
	public static void main(String[] args) {
		int b=27984;
		int w=1402;
		int bc=619246;
		int wc=615589;
		int z=247954;
		System.out.println(taumBday(b,w,bc,wc,z));
	}

	public static long taumBday(int b, int w, int bc, int wc, int z) {
		long black=b;
		long white=w;
		long blackCost=bc;
		long whiteCost=wc;
		long conversionCost=z;
		long price=0;
		long totalConversionCost=0;
		long totalBall=b+w;
		long totalBallCost=0;
		if(blackCost>whiteCost && blackCost-(whiteCost+conversionCost)>0){
			totalConversionCost=black*conversionCost;
			totalBallCost=totalBall*whiteCost;
			price=totalBallCost+totalConversionCost;
		}else if(whiteCost>blackCost && whiteCost-(blackCost+conversionCost)>0){
			totalConversionCost=white*conversionCost;
			totalBallCost=totalBall*blackCost;
			price=totalBallCost+totalConversionCost;
		}else{
			price=(black*blackCost)+(white*whiteCost);
		}
		return price;
	}
}
