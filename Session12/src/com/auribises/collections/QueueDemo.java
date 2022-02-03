package com.auribises.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		// Queue follow FIFO
		
		// Polymorphic Statement
		//Queue<Integer> queue = new PriorityQueue<Integer>();
		
		// Direct Object Construction
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		/*queue.add(10);
		queue.add(9);*/
		
		for(int i=10;i>0;i--) {
			queue.add(i);
		}
		
		// Head 10 9 8 7 6 5 4 3 2 1 Tail

		// PriorityQueue will sort the data in Queue for Processing Purpose
		// Head 1 2 3 4 5 6 7 8 9 10 Tail
		
		// 1. peek -> returns the head of queue
		// 2. poll -> removes and return the head of queue
		
		//int head = queue.peek();
		/*int head = queue.poll();
		System.out.println("head is: "+head);
		System.out.println("Size of queue is: "+queue.size());*/
		
		//System.out.println(queue.contains(9));
		
		int size = queue.size();
		for(int i=0;i<size;i++) {
			int head = queue.poll();
			System.out.println(head);
		}
		
		System.out.println("queue is: "+queue);
		System.out.println("finally the size is: "+queue.size());
		
	}

}
