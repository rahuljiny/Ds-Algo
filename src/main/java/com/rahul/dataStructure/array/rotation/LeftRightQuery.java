package com.rahul.dataStructure.array.rotation;

import com.rahul.dataStructure.array.OneDimension;

public class LeftRightQuery {

	public static void main(String[] args) {
		OneDimension oneDimension= new OneDimension(6);
		int[] query= {1,1,3,2,3};
		executeQuery(oneDimension.getArr(),query);
		System.out.println(" ");
		oneDimension.print();
	}
	private static void executeQuery(int arr[], int[] query){
		int start=0;
		int n=arr.length;
		for(int i=0;i<query.length;i++){
			switch (query[i]){
				case 1: start++;
				break;
				case 2: start--;
				break;
				case 3:
					int oldStart=start;
					do {
						System.out.print(arr[start]+" ");
						start=(start+1)%n;
					}while ((start!=oldStart));
					break;
			}

		}
	}
}
