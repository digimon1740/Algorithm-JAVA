public class Sample1 {

	/*
	 * 상수 시간복잡도
	 * 입력으로 n개의 데이터가 저장된 배열 data가 주어지고,그 중 n/2번째 데이터를 반환한다.
	 * n에 관계없이 상수 시간이 소요된다. 이 경우 알고리즘의 시간복잡도는 �(1)이다.
	 * */
	int sample(int[] data, int n) {
		int k = n / 2;
		return data[k];
	}

	/*
	 * 선형 시간복잡도
	 * 입력으로 n개의 데이터가 저장된 배열 data가 주어지고,
	 * 그 합을 구하여 반환한다.
	 * 선형 시간복잡도를 가진다고 말하고 �(n)이라고 표기한다.
	 * */
	int sum(int data[], int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += data[i];
		}
		return sum;
	}

	/*
	 *  순차탐색
	 *  배열 data에 정수 target이 있는지 검색한다.
	 *  최악의 경우 시간복잡도는 �(n)이다.
	 * */
	int search(int n, int data[], int target) {
		for (int i = 0; i < n; i++) {
			if (data[i] == target) {
				return i;
			}
		}
		return -1;
	}

	/*
	 * Quadratic
	 * 배열 x에 중복된 원소가 있는지 검사하는 함수이다.
	 * 최악의 경우 배열에 저장된 모든 원소 쌍을 비교 하므로
	 * 비교 연산의 횟수는 n(n-1)/2이다.
	 * 최악의 경우 시간복잡도는 �(n2)으로 나타낸다.
	 * */
	boolean is_distinct(int n, int x[]) {
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (x[i] == x[j])
					return false;
		return true;
	}


	public static void main(String[] args) {
		int n = 20;
		int idx = 0;
		for (int i=1; i<n; i*=2)
		{
			// 이 문장의 실행 횟수는?
			System.out.println(idx);
		}
	}
}
