package com.rahul.hackerRank;

public class BasketBall {

	public static void main(String[] args) {
		int[] scores={10, 5, 20, 20, 4, 5, 2, 25, 1};
		int[] result=breakingRecords(scores);
		for(int i=0;i<2;i++){
			System.out.print(result[i]+" ");
		}
	}

	static int[] breakingRecords(int[] scores) {
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int [] result={-1,-1};
		for(int i=0;i<scores.length;i++){
			if(scores[i]<min){
				min=scores[i];
				result[1]++;
			}
			if(scores[i]>max){
				max=scores[i];
				result[0]++;
			}
		}
		return result;
	}
}
