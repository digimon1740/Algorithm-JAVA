package recursion;

/**
*   암시적 암묵적(implicit) 변수를
 *  묵시적 명시적(explicit) 매개변수 바꾸어라.
* */
public class Recursion2 {

	/*
	 *   순차탐색 : 정방향
	 * */
	static int search(int[] data, int begin, int end, int target) {
		if (begin > end) {
			return -1;
		} else if (target == data[begin]) {
			return begin;
		} else {
			return search(data, begin + 1, end, target);
		}
	}

	/*
	 *   순차탐색 : 역방향
	 * */
	static int searchReverse(int[] data, int begin, int end, int target) {
		if (begin > end) {
			return -1;
		} else if (target == data[begin]) {
			return begin;
		} else {
			return searchReverse(data, begin, end - 1, target);
		}
	}

	/*
	 *   순차탐색 : 다른버전 (반을 나눠서 탐색)
	 * */
	static int searchAfterSplit(int[] data, int begin, int end, int target) {
		if (begin > end) {
			return -1;
		} else {
			int middle = (begin + end) / 2;
			if (data[middle] == target) {
				return middle;
			}
			int index = searchAfterSplit(data, begin, middle - 1, target);
			if (index != -1) {
				return index;
			} else {
				return searchAfterSplit(data, middle + 1, end, target);
			}
		}
	}

	/*
	 *  최대값 찾기
	 * */
	static int findMax(int[] data, int begin, int end) {
		if (begin == end) {
			return data[begin];
		}
		return Math.max(data[begin], findMax(data, begin + 1, end));
	}

	/*
	 *   최대갑 찾기 : 다른버전 (반을 나눠서 탐색)
	 * */
	static int findMaxAfterSplit(int[] data, int begin, int end) {
		if (begin == end) {
			return data[begin];
		}
		int middle = (begin + end) / 2;
		int max1 = findMaxAfterSplit(data, begin, middle);
		int max2 = findMaxAfterSplit(data, middle + 1, end);
		return Math.max(max1, max2);
	}

	/*
	 *   이진검색 (이진검색은 정렬이 우선이 되어야한다.
	 *   정렬된 데이터를 가지고 절반을 나눈뒤에 값을 비교한다.)
	 * */
	static int binarySearch(String[] items, String target, int begin, int end) {
		if (begin > end) {
			return -1;
		}
		int middle = (begin + end) / 2;
		int compResult = target.compareTo(items[middle]);
		if (compResult == 0) {
			return middle;
		} else if (compResult < 0) {
			return binarySearch(items, target, begin, middle - 1);
		} else {
			return binarySearch(items, target, middle + 1, end);
		}
	}

	public static void main(String[] args) {
		String str = "aaa";
		String str2 = "aac";
		System.out.println(str.compareTo(str2));
	}

}
