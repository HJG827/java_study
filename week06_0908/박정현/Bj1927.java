package week06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinHeap{
	private int[] Heap;
	private int index;
	private int size;
	
	public MinHeap(int size) {
		this.size = size;
		this.index = 0;
		Heap = new int[size];
	}
	
	private int parent(int i) {
		return (i-1)/2;
	}
	private int leftChild(int i) {
		return (i*2)+1;
	}
	private int rightChild(int i) {
		return (i*2)+2;
	}
	private boolean isLeaf(int i) {
		if (rightChild(i) >= size || leftChild(i) >= size) {
			return true;
		}
		return false;
	}
	
	public void insert(int element) {
		if (index >= size) {
			return;
		}
		Heap[index] = element;
		int current = index;
		
		while (Heap[current] < Heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
		index++;
	}
	
	public int remove() {
		int popped = Heap[0];
		Heap[0] = Heap[--index]; // 이게 뭐지? 왜 삭제를 이런 식으로 하지? 어떤 식으로 되는 거지?
		minHeapify(0); //아래에 기술, 
		return popped;
	}
	
	private void minHeapify(int i) {
		if (!isLeaf(i)) {
			if (Heap[i] > Heap[leftChild(i)] ||
					Heap[i] > Heap[rightChild(i)]) {
				if(Heap[leftChild(i)] < Heap[rightChild(i)]]) {
					swap(i, leftChild(i)); // 아래에 기술
					minHeapify(leftChild(i));
				} else {
					swap(i, rightChild(i));
					minHeapify(rightChild(i));
				}
			}
		}
	}
	
	public void minHeap() {
		for (int i=(index-1/2);i>=1;i--) {
			minHeapify(i);
		}
	}
	
	public void swap(int x, int y) {
		int tmp;
		tmp = Heap[x];
		Heap[x] = Heap[y];
		Heap[y] = tmp;
	}
	
	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		MinHeap minHeap = new MinHeap(N);
		for (int i=0;i<N;i++) {
			int x = Integer.parseInt(bf.readLine());
			if(x==0) {
				if minHeap
			}
		}
	}

}