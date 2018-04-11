import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
public class Sample3 {

	/**
	 * 이 문제는 두개의 정수 변수로 현재의 합(currentSum) 과 전체의 제일 큰 합(max Sum)을 저장해야 합니다.
	 * 각 원소마다 (currentSum + 원소) 값을 원소 값이랑 비교하고, 더 큰 값이 currentSum이 됩니다.
	 * maxSum은 currentSum 이 바뀔때마다 체크하여 제일 큰 값을 저장하면 됩니다.
	 * */
	public static int[] solution(int[] input, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length; i++) {
			int complement = target - input[i];
			if (map.containsKey(complement)) {
				return new int[]{map.get(complement), i};
			}
			map.put(input[i], i);
		}
		return new int[]{-1, -1};
	}

	public static void main(String[] args) {
		int[] array = new int[]{1, 2, 6, 4, 5, 6, 8, 10};
		System.out.println(Arrays.toString(solution(array, 5)));
	}
}
