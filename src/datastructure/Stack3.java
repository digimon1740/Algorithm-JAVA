package datastructure;

public class Stack3 {

	int[] arr;
	int idx;

	public Stack3(int size) {
		this.arr = new int[size];
	}

	public void push(int num) {
		if (idx < arr.length) {
			arr[idx++] = num;
		} else {
			// stack over flow
		}
	}

	public int pop () {
		if (idx <= 0) {
			// stack under flow
			return -1;
		}
		return arr[--idx];
	}
}
