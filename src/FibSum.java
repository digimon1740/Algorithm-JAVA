/**
 * 피보나치 배열은 0과 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 된다.
 * 정수 N이 주어지면, N보다 작은 모든 짝수 피보나치 수의 합을 구하여라.
 * <p>
 * <p>
 * <p>
 * 예제)
 * <p>
 * Input: N = 12
 * <p>
 * Output: 10 // 0, 1, 2, 3, 5, 8 중 짝수인 2 + 8 = 10.
 */
public class FibSum {

	/**
	 * 이 문제는 N보다 클때까지 피보나치의 수를 구하며 짝수인 피보나치 수를 다 더해주면 됩니다.
	 */
	static int evenFibSum(int n) {
		int sum = 0;
		int x = 1;
		int y = 2;

		while (x <= n) {
			if (x % 2 == 0) {
				sum += x;
			}

			int z = x + y;

			x = y;
			y = z;
		}
		return sum;
	}

	static int oddFibSum(int n) {
		int sum = 0;
		int x = 1;
		int y = 2;

		int i = 0;
		while (x <= n) {
			if (x % 1 == 0) {
				sum += x;
			}

			int z = x + y;
			x = y;
			y = z;
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println(evenFibSum(50));
		System.out.println(oddFibSum(10));
	}

}
