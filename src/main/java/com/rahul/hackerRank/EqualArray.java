package com.rahul.hackerRank;

import java.util.HashMap;
import java.util.Map;

public class EqualArray {

	public static void main(String[] args) {
		int[] arr = {37, 32, 97, 35, 76, 62};
		System.out.println(equalizeArray(arr));
	}

	static int equalizeArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
				if (max < map.get(arr[i])) {
					max = map.get(arr[i]);
				}
			} else {
				map.put(arr[i], 1);
				if (max < 1) {
					max = 1;
				}
			}

		}
		return arr.length - max;
	}
}
