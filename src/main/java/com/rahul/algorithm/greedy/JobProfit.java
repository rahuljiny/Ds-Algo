package com.rahul.algorithm.greedy;

import java.util.Arrays;

public class JobProfit {


	public static void main(String[] args) {
		Job arr[] = { new Job('a', 2, 100), new Job('b', 1, 19), new Job('c', 2, 27),
				new Job('d', 1, 25), new Job('e', 3, 15)};
		int n = arr.length;
		System.out.println( "Following is maximum profit sequence of jobsn");
		printJobScheduling(arr, n);
	}

	private static void printJobScheduling(Job[] arr, int n){
		Arrays.sort(arr);
		int []result=new int[n];
		boolean[] slot= new boolean[n];
		for (int i=0;i<n;i++){
			slot[i]=false;
		}

		for(int i=0;i<n;i++){
			for(int j=Math.min(n,arr[i].dead)-1;j>=0;j--){
				if(slot[j]==false){
					result[j]=i;
					slot[j]=true;
					break;
				}
			}
		}
		for (int i=0;i<n;i++){
			if(slot[i])
			System.out.print(arr[result[i]].id +" ");
		}
	}

}

class Job implements Comparable<Job>{
	public char id;
	public int dead;
	public int profit;
	Job(char id,int dead,int profit){
		this.id=id;
		this.dead=dead;
		this.profit=profit;
	}

	@Override
	public int compareTo(Job o) {
		if(this.profit>o.profit)
			return -1;
		if(this.profit<o.profit)
			return 1;
		return 0;
	}
}
