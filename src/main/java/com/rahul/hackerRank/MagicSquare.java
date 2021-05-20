package com.rahul.hackerRank;

public class MagicSquare {
	public static void main(String[] args) {
		int[][] s={{4,8,2},{4,5,7},{6,1,6}};
		System.out.println(formingMagicSquare(s));
	}

	static int formingMagicSquare(int[][] s) {
		int minCost=Integer.MAX_VALUE;
		int [][][] posMat={{{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
        {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
        {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
        {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, 
        {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
        {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}, 
        {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}, 
        {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}};
		for(int i=0;i<8;i++){
			int cost=0;
			for(int j=0;j<3;j++){
				for(int k=0;k<3;k++){
					cost+=Math.abs(posMat[i][j][k]-s[j][k]);
				}
			}
			if(cost<minCost){
				minCost=cost;
			}
		}
		return minCost;
	}
}
