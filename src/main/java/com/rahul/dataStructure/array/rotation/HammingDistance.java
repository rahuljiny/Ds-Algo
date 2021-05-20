package com.rahul.dataStructure.array.rotation;

import com.rahul.dataStructure.array.OneDimension;

public class HammingDistance {

	public static void main(String[] args) {
		HammingDistance hammingDistance= new HammingDistance();
		OneDimension oneDimension= new OneDimension(7);
		int arr[]={1,4,1};
		int maxHamm= hammingDistance.findHammingDistance(arr);
		System.out.println(maxHamm);
	}
	private int findHammingDistance(int[] arr){
		int[] hammArr= new int[2*arr.length+1];
		int n=arr.length;
		for(int i=0; i<n;i++){
			hammArr[i]=hammArr[i+n]=arr[i];
		}
		int maxHamm=0;
		for(int i=1;i<n;i++){
			int currHamm=0;
			for(int j=i, k=0;j<(i+n);j++,k++){
				if(hammArr[j]!=hammArr[k])
					currHamm++;
			}
			if(currHamm==n)
				return n;
			maxHamm=Math.max(currHamm,maxHamm);
		}
		return maxHamm;
	}
}
