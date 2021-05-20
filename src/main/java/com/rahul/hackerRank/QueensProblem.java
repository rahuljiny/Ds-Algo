package com.rahul.hackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueensProblem {
	public static void main(String[] args) {
		int[][] obstacles={{4,2},{2,3},{5,5}};
		System.out.println(queensAttack(5, 3, 4, 3,obstacles));
	}

	static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
		Map<Integer, List<Integer>> obstacleMap= new HashMap<>();
		for(int l=0;l<k;l++){
			if(obstacleMap.containsKey(obstacles[l][0])){
				obstacleMap.get(obstacles[l][0]).add(obstacles[l][1]);
			}else {
				List<Integer> list=new ArrayList<>();
				list.add(obstacles[l][1]);
				obstacleMap.put(obstacles[l][0],list);
			}

		}
		int count=0;
		for(int j=c_q-1;j>0;j--){
			if(isObstacle(r_q,j,obstacleMap)){
				break;
			}
			count++;
		}
		for(int j=c_q+1;j<=n;j++){
			if(isObstacle(r_q,j,obstacleMap)){
				break;
			}
			count++;
		}
		for(int i=r_q-1;i>0;i--){
			if(isObstacle(i,c_q,obstacleMap)){
				break;
			}
			count++;
		}
		for(int i=r_q+1;i<=n;i++){
			if(isObstacle(i,c_q,obstacleMap)){
				break;
			}
			count++;
		}
		for(int i=r_q-1,j=c_q-1;i>0 && j>0;i--,j--){
			if(isObstacle(i,j,obstacleMap)){
				break;
			}
			count++;
		}
		for(int i=r_q+1,j=c_q+1;i<=n && j<=n;i++,j++){
			if(isObstacle(i,j,obstacleMap)){
				break;
			}
			count++;
		}
		for(int i=r_q+1,j=c_q-1;i<=n && j>0;i++,j--){
			if(isObstacle(i,j,obstacleMap)){
				break;
			}
			count++;
		}
		for(int i=r_q-1,j=c_q+1;i>0 && j<=n;i--,j++){
			if(isObstacle(i,j,obstacleMap)){
				break;
			}
			count++;
		}
		return count;
	}
	private static boolean isObstacle(int i, int j, Map<Integer, List<Integer>> obstacleMap){
		return obstacleMap.containsKey(i) && obstacleMap.get(i).contains(j);
	}
}
