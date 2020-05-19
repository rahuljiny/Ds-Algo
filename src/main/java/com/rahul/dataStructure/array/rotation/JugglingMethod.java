package com.rahul.dataStructure.array.rotation;

import com.rahul.dataStructure.array.OneDimension;

public class JugglingMethod {

	public static void main(String[] args) {
		int d=4;
		int n=10;
		OneDimension oneDimension= new OneDimension(n);
		oneDimension.print();
		juggleUp(oneDimension.getArr(),d,oneDimension.getArr().length);
		oneDimension.print();
	}

	private static void juggleUp(int[] arr,int d,int n){
		int i,j,k,temp;
		int gcd= gcd(d,n);
		System.out.println(gcd);
		for(i=0;i<gcd;i++){
			temp=arr[i];
			j=i;
			while(true){
				k=j+d;
				if(k>=n)
					k=k-n;
				if(k==i)
					break;
				arr[j]=arr[k];
				j=k;

			}
			arr[j]=temp;
		}
	}
	private static int gcd(int a, int b){
		if(b==0)
			return a;

		return gcd(b,a%b);
	}
}
