package com.rahul.hackerRank;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class RankingSystem {
	public static void main(String[] args) {
		int[] scores ={100, 100, 90, 80, 75, 60};
		int[] alice={50, 65, 77, 90, 102};
		int[] result=climbingLeaderboard( scores,  alice);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		int result[]= new int[alice.length];
		PriorityQueue<Integer> pq= new PriorityQueue();
		for(int i=0;i<scores.length;i++){
			if(pq.isEmpty() || (!pq.isEmpty() && pq.peek()!=scores[i])){
				pq.add(scores[i]);
			}
		}
		for(int i=0;i<alice.length;i++){
			int aliceScore=alice[i];
			while (!pq.isEmpty() && aliceScore>=pq.peek()){
				pq.poll();
			}
			if(pq.isEmpty()){
				result[i]=1;
			}else {
				result[i]=pq.size()+1;
			}
		}
			return result;
	}
}
