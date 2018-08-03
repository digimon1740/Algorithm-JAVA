package datastructure;

import java.util.Arrays;

public class Queue2 {

	int[] queue;
	int idx = 0;

	public Queue2(int queueSize) {
		this.queue = new int[queueSize];
	}

	public void enqueue(int i) {
		if (idx > queue.length) {
			System.out.println("queue is full");
			return;
		}
		queue[idx++] = i;
	}

	public int dequeue() {
		int val = queue[0];
		queue = Arrays.copyOfRange(queue, 1, queue.length);
		return val;
	}

	public boolean isEmpty() {
		return queue == null || queue.length == 0;
	}

	public static void main(String[] args) {
		Queue2 queue = new Queue2(2);
		queue.enqueue(1);
		queue.enqueue(2);
		//queue.enqueue(3);
		while(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
	}
}
