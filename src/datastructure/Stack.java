package datastructure;

import java.util.NoSuchElementException;

public class Stack {
	private int[] arr;
	private int top = 0;

	public Stack(int stackSize) {
		this.arr = new int[stackSize];
	}

	private void push(int i) {
		if (top < arr.length) {
			arr[top++] = i;
			System.out.println("pushed : " + i);
		} else {
			// stack over flow
			System.out.println("Stack is full");
		}
	}

	private int pop() {
		if (top > 0) {
			return arr[--top];
		} else {
			// stack under flow
			throw new NoSuchElementException();
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack(2);
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
