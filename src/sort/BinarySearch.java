package sort;

public class BinarySearch {

	int sum(int n) {
		if (n < 2) {
			return n;
		}
		return n + sum(n - 1);
	}

	int search(int[] arr, int target) {
		int first = 0;
		int last = arr.length;
		int mid = 0;

		while (first <= last) {
			mid = (first + last) / 2;
			if (target == arr[mid]) {
				return mid;
			} else {
				if (target < arr[mid]) {
					last = mid - 1;
				} else {
					first = mid + 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int[] arr = {5, 10, 3, 1, 23, 6, 8, 9, 19};
		//int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		System.out.println(binarySearch.search(arr, 10));
	}
}
