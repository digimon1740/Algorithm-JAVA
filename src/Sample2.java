/**
 * 정수 배열(int array)가 주어지면 가장 큰 이어지는 원소들의 합을 구하시오. 단, 시간복잡도는 O(n).
 * <p>
 * ﻿
 * <p>
 * 예제}
 * <p>
 * Input: [-1, 3, -1, 5]
 * <p>
 * Output: 7 // 3 + (-1) + 5
 * <p>
 * <p>
 * <p>
 * Input: [-5, -3, -1]
 * <p>
 * Output: -1 // -1
 * <p>
 * <p>
 * <p>
 * Input: [2, 4, -2, -3, 8]
 * <p>
 * Output: 9 // 2 + 4 + (-2) + (-3) + 8
 */
public class Sample2 {

	/**
	 * 이 문제는 두개의 정수 변수로 현재의 합(currentSum) 과 전체의 제일 큰 합(max Sum)을 저장해야 합니다.
	 * 각 원소마다 (currentSum + 원소) 값을 원소 값이랑 비교하고, 더 큰 값이 currentSum이 됩니다.
	 * maxSum은 currentSum 이 바뀔때마다 체크하여 제일 큰 값을 저장하면 됩니다.
	 */
	static int solution(int[] arr) {
		int maxSum = arr[0];
		int currentSum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			currentSum = Math.max(currentSum + arr[i], arr[i]);
			maxSum = Math.max(currentSum, maxSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 10, 22, 12};
		System.out.println(solution(arr));
	}
}
