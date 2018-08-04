package datastructure;

public class Stack2 {

	int[] arr;
	int top = 0;

	public Stack2(int size) {
		arr = new int[size];
	}

	void push (int num) {
		if (top < arr.length) {
			arr[top++] = num;
		} else {
			// stack over flow
			System.out.println("stack over flow");
		}
	}

	int pop () {
		if (top == 0) {
			// stack under flow
			return -1;
		} else {
			return arr[--top];
		}
	}

	boolean isEmpty() {
		return top <= 0;
	}

	public static void main(String[] args) {
		Stack2 stack2 = new Stack2(2);
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);

		while (!stack2.isEmpty()) {
			System.out.println(stack2.pop());
		}
	}
}
