package com.rahul.dataStructure.heap;

public class IterativeHeapSort {
	public static void main(String[] args) {
		int arr[] = {10, 20, 15, 17, 9, 21};
		int n = arr.length;
		IterativeHeapSort ihs= new IterativeHeapSort();
		System.out.print("Given array: ");
		printArray(arr);

		ihs.sort(arr, n);

		System.out.print("Sorted array: ");
		printArray(arr);
	}

	private void sort(int[] arr,int n){
		buildMaxHeap(arr);
		for(int i=n-1;i>=0;i--){
			swap(arr,i,0);
			int j=0,index;
			do{
				index=2*j+1;
				if(index<i-1 && arr[index]<arr[index+1])
					index++;
				if(index<i && arr[j]<arr[index])
					swap(arr,index,j);
				j=index;
			}while (j<i);
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	private void buildMaxHeap(int[] arr){
		for(int i=1;i<arr.length;i++){
			if(arr[i]>arr[(i-1)/2]){
				int j=i;
				while (j>0 && arr[j]>arr[(j-1)/2]){
					swap(arr,j,(j-1)/2);
					j=(j-1)/2;
				}
			}
		}
	}


	private void swap(int[] arr,int j,int k){
		int temp=arr[j];
		arr[j]=arr[k];
		arr[k]=temp;
	}
}
