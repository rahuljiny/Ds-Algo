package com.rahul.algorithm.dynamic;

import java.util.Arrays;
import java.util.List;

public class InfiniteMonkey {

	static int UNDEFINED=Integer.MIN_VALUE;
	public static void main(String[] args) {
		String pie="31415926";
		int n=pie.length();
		int[] dp=new int[n];
		for(int i=0;i<n;i++){
			dp[i]=UNDEFINED;
		}
		String[] arr={"314","15","159265358979323","314159","92","6"};
		long time=System.currentTimeMillis();
		int result=minSpace(pie,0,pie.length(), Arrays.asList(arr),dp);
		System.out.println("time taken "+(System.currentTimeMillis()-time) +" to get answer "+result);
	}

	private static int minSpace(String pie,int pos,int n, List<String> list,int[] dp){
		if(pos==n){
			return 0;
		}
		int ans=dp[pos];
		if(ans!=UNDEFINED) return ans;
		ans=Integer.MAX_VALUE;
		String curr="";
		for(int i=pos;i<n;i++){
			curr+=pie.charAt(i);
			if(exist(curr,list)){
				int temp=minSpace(pie,i+1,n,list,dp);
				if(temp!=-1){
					ans=Math.min(ans,1+temp);
					dp[pos]=ans;
				}
			}
		}
		return ans==Integer.MAX_VALUE?-1:ans;
	}


	private static boolean exist(String curr,List<String> list){
		return list.contains(curr);
	}
}
