package com.rahul.algorithm.greedy;

public class MinimumProductSubset {

	public static void main(String[] args) {
		int a[] = { -1, -1, -2,-1, 4, 3 };
		int n = a.length;
		System.out.println(minProductSubset(a, n));
	}

	private static int minProductSubset(int[]a, int n){
		if(n==1)
			return a[0];
		int pos=0,neg=0,zero=0,min=Integer.MAX_VALUE,prod=1,negMax=Integer.MIN_VALUE;

		for(int i=0;i<n;i++){
			if(a[i]==0){
				zero++;
				continue;
			}
			if(a[i]>0)
				pos++;
			else{
				neg++;
				if(a[i]>negMax)
					negMax=a[i];
			}
			if(a[i]<min)
				min=a[i];
			prod=prod*a[i];
		}
		if(neg==0){
			if( zero>0)
				return 0;
			else return min;
		}else if(neg%2==0){
			return prod/negMax;
		}else return prod;

	}
}
