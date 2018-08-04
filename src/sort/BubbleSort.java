package sort;

import java.util.Arrays;

public class BubbleSort {

	void bubbleSort(int[] arr) {
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length -i; j++) {
				if (arr[j] < arr[j -1]) {
					tmp = arr[j -1];
					arr[j -1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		final int[] arr = {1, 2, 55, 2, 30, 77, 2, 9, 9, 99};
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.bubbleSort(arr);
	}
}
