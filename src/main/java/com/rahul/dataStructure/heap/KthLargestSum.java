package com.rahul.dataStructure.heap;

import java.util.PriorityQueue;

public class KthLargestSum {
	public static void main(String[] args) {
		int a[] = {20, -5, -1};
		int n = a.length;
		int k = 2;
		System.out.println(kthLargestSum(a, n, k));
	}
	private static int kthLargestSum(int[]a, int n, int k){
		int []sum= new int[n+1];
		sum[0]=0;
		sum[1]=a[0];
		for(int i=2;i<=n;i++){
			sum[i]=sum[i-1]+a[i-1];
		}
		PriorityQueue<Integer> Q = new PriorityQueue<Integer>();
		for (int i = 1; i <= n; i++)
		{

			// loop to traverse all positions that
			// form contiguous subarray
			for (int j = i; j <= n; j++)
			{
				// calculates the contiguous subarray
				// sum from j to i index
				int x = sum[j] - sum[i - 1];

				// if queue has less then k elements,
				// then simply push it
				if (Q.size() < k)
					Q.add(x);

				else
				{
					// it the min heap has equal to
					// k elements then just check
					// if the largest kth element is
					// smaller than x then insert
					// else its of no use
					if (Q.peek() < x)
					{
						Q.poll();
						Q.add(x);
					}
				}
			}
		}

		// the top element will be then kth
		// largest element
		return Q.poll();
	}
}
