package com.rahul.dataStructure.heap;

public class MinHeap {

	static int[] heap;
	static int heap_size;
	static int capacity;

	MinHeap(int[] len, int size){
		heap=len;
		heap_size=size;
		capacity=size;
		int i=(size-1)/2;
		while (i>=0){
			minHeapify(i);
			i--;
		}
	}

	private static void minHeapify(int i){
		int smallest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<heap_size && heap[l]<heap[i])
			smallest=l;
		if(r<heap_size && heap[r]<heap[smallest])
			smallest=r;
		if(smallest!=i){
			int temp=heap[smallest];
			heap[smallest]=heap[i];
			heap[i]=temp;
			minHeapify(smallest);
		}
	}
	private static boolean isSizeOne(){
		return heap_size==1;
	}
	private int extractMin(){
		if(heap_size<=0)
			return Integer.MIN_VALUE;
		if(heap_size==1){
			heap_size--;
			return heap[0];
		}
		int root=heap[0];
		heap[0]=heap[heap_size-1];
		heap_size--;
		minHeapify(0);
		return root;
	}
	private void insert(int value){
		if(heap_size==capacity){
			System.out.println("Overflow: Could not insertKey");
			return;
		}
		heap_size++;
		int i=heap_size-1;
		heap[i]=value;
		while (i!=0 && heap[i]<heap[parent(i)]){
			int temp=heap[i];
			heap[i]=heap[parent(i)];
			heap[parent(i)]=temp;
			i=parent(i);
		}
	}

	private int parent(int i){
		return (i-1)/2;
	}
	public static void main(String args[]){
		int len[] = { 4, 3, 2, 6 };
		int size = len.length;

		System.out.println("Total cost for connecting ropes is " + minCost(len, size));
	}

	private static int minCost(int[] len, int size){
		int cost=0;
		MinHeap minHeap= new MinHeap(len,size);
		while (!minHeap.isSizeOne()){
			int min=minHeap.extractMin();
			int sec_min=minHeap.extractMin();
			cost+=min+sec_min;
			minHeap.insert(min+sec_min);
		}
		return cost;
	}
}
