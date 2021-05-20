package com.rahul.hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BonAppetite {
	public static void main(String[] args) {
		Integer arr[]={3,10,2,9};
		List<Integer> bill= Arrays.asList(arr);
		Map<Integer,Integer> map= new HashMap<>();

		int k=1;
		int b=12;
		bonAppetite(bill, k, b);
	}

	static int sockMerchant(int n, int[] ar) {
		int noOfPair=0;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<ar.length;i++){
			if(map.containsKey(ar[i])){
				map.put(ar[i],map.get(ar[i])+1);
			}else{
				map.put(ar[i],1);
			}
		}
		for(Integer key:map.keySet()){
			noOfPair+=(map.get(key)/2);
		}
		return noOfPair;
	}
	static void bonAppetite(List<Integer> bill, int k, int b) {
		long totalBill=0;
		for(int i=0;i<bill.size();i++){
			totalBill+=bill.get(i);
		}
		long diff=totalBill-bill.get(k);
		if(b==diff/2){
			System.out.println("Bon Appetit");
		}else {
			System.out.println(b-(diff/2));
		}
	}
}
