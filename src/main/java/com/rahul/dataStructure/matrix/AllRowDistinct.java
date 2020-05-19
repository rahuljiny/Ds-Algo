package com.rahul.dataStructure.matrix;

import java.util.HashMap;
import java.util.Map;

public class AllRowDistinct {
	public static void main(String[] args) {
		int n=4;
		int mat[][] = {  {2, 1, 4, 3},
			{1, 2, 3, 2},
			{3, 6, 2, 3},
			{5, 2, 5, 3}  };
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(map.containsKey(mat[i][j])){
					map.put(mat[i][j],(map.get(mat[i][j]))+1);
				}else {
					map.put(mat[i][j],1);
				}
			}
		}
		for(Integer val:map.keySet()){
			if(map.get(val)>=4){
				System.out.print(val+" ");
			}
		}
	}
}
