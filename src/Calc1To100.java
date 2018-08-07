public class Calc1To100 {

	int sum(int n) {
		if (n < 2) {
			return n;
		}
		return n + sum(n-1);
	}

	public static void main(String[] args) {
		Calc1To100 calc1To100 = new Calc1To100();
		//System.out.println(calc1To100.calc(101));
		System.out.println(calc1To100.sum(2));
	}
}
