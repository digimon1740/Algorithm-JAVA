public class Calc1To100 {

	int calc(int n) {
		if (n % 2 == 0) {
			return (n + 1) * (n / 2);
		} else {
			return calc(n - 1) + n;
		}
	}

	public static void main(String[] args) {
		Calc1To100 calc1To100 = new Calc1To100();
		System.out.println(calc1To100.calc(101));
	}
}
