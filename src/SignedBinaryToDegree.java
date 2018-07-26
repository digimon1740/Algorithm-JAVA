import java.util.Random;

public class SignedBinaryToDegree {

	public static void main(String[] args) {
		int sbin[] = new int[8]; // 최상위 비트가 부호비트인 8비트 2진수를 받을 배열
		Random random = new Random();
		int i; // 반복문을 돌리기 위한 변수
		for (i = 0; i < 8; i++) {
			sbin[i] = random.nextInt(2);
		}
		int dec = 0; // 각 자리수의 값을 누적해 10진수로 만든 수를 넣을 변수
		int k; // 2진수 각 자리의 10진수 값을 만들어 줄 변수. ex) 2의 1승 = 2 / 2 의 2승 = 4

		for (i = 1; i < 8; i++) {
			k = (int) Math.pow(2, 7 - 1); // 2의 자리수 제곱을 k에 대입
			dec = dec + (k * sbin[i]); // 2진수의 i번째 자리수가 1이라면 k를 dec에 누적
		}

		if (sbin[0] == 1) { // 부호비트가 1일  경우
			dec = 128 - dec; // 128(2의 7승)에서 dec를 빼고
			dec = dec * (-1); // 마이너스(-)부호를 붙여준다.
		}

		//출력
		for (i = 0; i < 8; i++) {
			System.out.print(sbin[i]);
		}
		System.out.print("(2) = " + dec + "(10)");
	}
}
