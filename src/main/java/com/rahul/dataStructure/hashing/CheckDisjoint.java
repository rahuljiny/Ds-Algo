package com.rahul.dataStructure.hashing;

import java.util.HashSet;
import java.util.Set;

public class CheckDisjoint {
	public static void main(String[] args) {
		boolean disjoint=true;
		int[] arr1={12, 34, 11, 9, 3};
		int[] arr2={2, 1,  5};
		Set<Integer> set= new HashSet<>();
		for(int i=0;i<arr1.length;i++){
			set.add(arr1[i]);
		}
		for(int j=0;j<arr2.length;j++){
			if(set.contains(arr2[j]))
				disjoint=false;
		}
		System.out.println("Is disjoint "+disjoint);
	}
}
