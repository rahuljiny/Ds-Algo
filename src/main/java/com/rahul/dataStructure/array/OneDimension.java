package com.rahul.dataStructure.array;

import java.util.Random;


public class OneDimension {

	Random random= new Random();

	int[] arr=null;

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public OneDimension(int size){
		arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=size+random.nextInt(size*size);
		}
		print();
	}
	public OneDimension(int size, boolean inc){
		arr=new int[size];
		for(int i=0;i<size;i++){
			if(inc){
				arr[i]=i+1;
			}else {
				arr[i]=size-i;
			}

		}
		print();
	}

	public void print(){
		if(arr==null){
			System.out.println("Array is empty");
		}
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i] +" ");
		}
		System.out.println(" ");
	}

	public   void rotateArray(){
		int rotation=random.nextInt(arr.length);
		for( int i=0;i<rotation;i++){
			int temp=arr[0];
			for(int j=1;j<arr.length;j++){
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
		}
	}
}
