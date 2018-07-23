package line;/* package whatever; // don't place package name! */

import java.io.*;
import java.util.Arrays;

class MyList {

	private int[] elements = {};
	private int idx = 0;
	private int length = 0;

	int min() {
		if (elements == null || elements.length == 0) {
			throw new RuntimeException();
		}
		int min = elements[0];
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] < min) {
				min = elements[i];
			}
		}
		return min;
	}

	void add(int element) {
		this.length++;
		if (elements.length <= this.length) {
			elements = Arrays.copyOf(elements, this.length);
		}
		elements[this.idx++] = element;
	}

	int remove() {
		if (elements == null || elements.length == 0) {
			throw new RuntimeException();
		}
		int removeTarget = elements[0];
		elements = Arrays.copyOfRange(elements, 1, this.length);
		return removeTarget;
	}

	int[] get() {
		return elements;
	}

	/*
	*   input :
	*           add 2
	*           add 1
	*           add 5
	*           min
	*           remove
	*	output : 1
	 *	remove : 2
	* */
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MyList clazz = new MyList();

		for (String input = br.readLine(); input != null; input = br.readLine()) {
			String[] splits = input.split(" ");
			if (splits.length == 1) {
				String method = splits[0].trim();
				switch (method) {
					case "min":
						System.out.println(clazz.min());
						break;
					case "remove":
						System.out.println(clazz.remove());
						break;
					case "get":
						System.out.println(Arrays.toString(clazz.get()));
						break;
					case "exit":
					System.exit(0);
					break;
				}
			} else {
				String method = splits[0].trim();
				if (!"add".equals(method)) {
					System.exit(0);
				}
				int value = Integer.parseInt(splits[1]);
				clazz.add(value);
			}
		}

	}
}
