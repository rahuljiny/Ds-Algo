package com.rahul.dataStructure.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class RearrangeCharacter {
	final static int MAX_CHAR=26;
	public static void main(String[] args) {
		String str = "bbba" ;
		rearrangeString(str);
	}

	private static void rearrangeString(String str){
		int[] arr= new int[MAX_CHAR];
		for(char ch:str.toCharArray()){
			arr[ch-'a']++;
		}
		PriorityQueue<Key> pq= new PriorityQueue<>(new KeyComparator());
		for(char i='a';i<'z';i++){
			int val=i-'a';
			if(arr[val]>0){
				pq.add(new Key(arr[val],i));
			}
		}
		String n = "" ;
		Key prev=new Key(-1,'#');
		while (!pq.isEmpty()){
			Key now=pq.peek();
			pq.poll();
			n=n+now.ch;
			if(prev.freq>0){
				pq.add(prev);
			}
			now.freq--;
			prev=now;
		}
		if(n.length()!=str.length()){
			System.out.println("Not possible");
		}
		else System.out.println(n);
	}
}


class KeyComparator implements Comparator<Key> {

	// Overriding compare()method of Comparator
	public int compare(Key k1, Key k2)
	{
		if (k1.freq < k2.freq)
			return 1;
		else if (k1.freq > k2.freq)
			return -1;
		return 0;
	}
}

class Key {
	int freq; // store frequency of character
	char ch;
	Key(int val, char c)
	{
		freq = val;
		ch = c;
	}
}
