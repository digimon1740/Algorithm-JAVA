package sort;

public class BinarySearch {

	public int search(int[] arr, int target) {
		int first = 0;
		int last = arr.length;
		int mid;

		while (first <= last) {
			mid = (first + last) / 2;
			if (target == arr[mid]) {
				return mid;
			} else {
				if (target < arr[mid])
					last = mid - 1;
				else
					first = mid + 1;
			}
			// if target is not existed,
			// not occur reversal of the first and last
		}
		return -1;
		// when target is not existed
	}

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int[] arr = {5, 10, 3, 1, 23, 6, 8, 9, 19};
		//int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		System.out.println(binarySearch.search(arr, 10));
	}
}
