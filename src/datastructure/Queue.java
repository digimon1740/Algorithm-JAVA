package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Queue {

	List<Integer> queue = new ArrayList<>();

	public void enqueue(int i) {
		queue.add(i);
	}

	public int dequeue() {
		if (queue.isEmpty()) {
			throw new NoSuchElementException();
		}
		return queue.remove(0);
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public int size() {
		return this.queue.size();
	}

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		while(!queue.isEmpty()) {
			System.out.println(queue.dequeue());
		}
	}
}
