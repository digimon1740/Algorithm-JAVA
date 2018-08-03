package cafe24;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	// 1. 앞자리가 3으로 시작하는 모든 요소를 출력
	private static void printStartNumber3(String[] numbers) {
		List<String> filtered = new ArrayList<>();
		for (String number : numbers) {
			char first = number.charAt(0);
			if (first != '3') {
				continue;
			}
			filtered.add(number);
		}
		System.out.println(String.join(",", filtered));
	}

	// 2. 76이 포함된 모든 요소를 출력
	private static void printContainsNumber3(String[] numbers) {
		List<String> filtered = new ArrayList<>();
		for (String number : numbers) {
			if (!number.contains("76")) {
				continue;
			}
			filtered.add(number);
		}
		System.out.println(String.join(",", filtered));
	}

	// 3. 76이 포함된 모든 요소중에서 가장 작은 요소를 삭제하고, 오름차순으로 정렬
	private static void printNumbersAfterRemovingMinimum(String[] numbers) {
		List<Integer> filtered = new ArrayList<>();
		for (String number : numbers) {
			if (!number.contains("76")) {
				continue;
			}
			filtered.add(Integer.parseInt(number));
		}
		filtered.sort(Comparator.comparingInt(o -> o));
		filtered.remove(0);
		List<String> results = filtered.stream().map(String::valueOf).collect(Collectors.toList());
		System.out.println(String.join(",", results));
	}

	public static void main(String[] args) {
		String numberString = "1234,3343,5544,2223,4223,7644,3332,5676,7876,3322,67954,2238,3456,7681";

		String[] numbers = numberString.split(",");
		printStartNumber3(numbers);
		printContainsNumber3(numbers);
		printNumbersAfterRemovingMinimum(numbers);
	}
}
