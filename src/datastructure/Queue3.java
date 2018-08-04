package datastructure;

import java.util.Arrays;
import java.util.Objects;

public class Queue3 {

	private Object[] arr;
	private int idx;

	public Queue3(int size) {
		arr = new Object[size];
	}

	void enqueue(Object obj) {
		Objects.requireNonNull(obj);
		arr[idx++] = obj;
	}

	Object dequeue() {
		Object temp = arr[0];
		arr = Arrays.copyOfRange(arr, 1, arr.length);
		return temp;
	}

	boolean isEmpty() {
		return arr == null || arr.length == 0;
	}

	public static void main(String[] args) {
		Queue3 queue3 = new Queue3(2);
		queue3.enqueue("A");
		queue3.enqueue("B");

		while (!queue3.isEmpty()) {
			System.out.println(queue3.dequeue());
		}
	}
}
