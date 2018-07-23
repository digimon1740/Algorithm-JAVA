package tmon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//다음 array는 물건의 중량이다. Array의 순서대로 물건을 상자에 담되, 중량이 20을 넘지 않도록 상자를 분할하는 출력 함수를 만드시오.
//
//	예) 9, 7, 6, 6, 4, 3, 4, 5, 3, 4, 3, 4, 1, 2
//
//	결과 )
//	9 7
//	6 6 4 3
//	4 5 3 4 3
//	4 1 2
//
//public static List<Stack<Integer>> doDo() {
//final List<Integer> elements = Arrays.asList(9, 7, 6, 6, 4, 3, 4, 5, 3, 4, 3, 4, 1, 2);
public class Test1 {

	public static List<Stack<Integer>> doDo() {
		final int MAX_SIZE = 20;
		final List<Integer> elements = Arrays.asList(9, 7, 6, 6, 4, 3, 4, 5, 3, 4, 3, 4, 1, 2);

		List<Integer> saved = new ArrayList<>();
		List<Stack<Integer>> seperatedElements = new ArrayList<>();
		for (int i = 0; i < elements.size(); i++) {
			int num = elements.get(i);
			if (num >= MAX_SIZE) { // 입력된 값이 20보다 크거나 같다면
				Stack stack = new Stack();
				stack.push(num);
				seperatedElements.add(stack);
				saved.clear();
				continue;
			}
			// 저장된 값의 토탈을 구한다.
			int savedSum = saved.stream().mapToInt(Integer::intValue).sum();
			int total = savedSum + num;
			if (total >= MAX_SIZE) { // 토탈 값이 20을 넘기면
				Stack stack = new Stack();
				saved.forEach(savedNum -> {
					stack.push(savedNum);
				});
				seperatedElements.add(stack);
				saved.clear();
			}
			saved.add(num);
		}
		Stack stack = new Stack();
		for (int i = 0; i < saved.size(); i++) {
			stack.push(saved.get(i));
		}
		seperatedElements.add(stack);
		return seperatedElements;
	}

	public static void main(String... args) {
		List<Stack<Integer>> stackList = doDo();
		for (Stack<Integer> stack : stackList) {
			for (Integer element : stack) {
				System.out.print(element.toString() + " ");
			}
			System.out.println();
		}
	}
}
