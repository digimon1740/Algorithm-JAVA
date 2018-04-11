package recursion;

import java.util.Scanner;

public class Recursion {

	/**
	 * if the string is empty
	 * return 0;
	 * else
	 * return 1 plus the length of the string that
	 * excludes the first character
	 */
	public static int length(String str) {
		if ("".equals(str)) {
			return 0;
		}
		return 1 + length(str.substring(1));
	}

	public static void printChars(String str) {
		if ("".equals(str) || str.length() == 0) {
			return;
		}
		System.out.println(str.charAt(0));
		printChars(str.substring(1));
	}

	public static void printCharsReverse(String str) {
		if ("".equals(str) || str.length() == 0) {
			return;
		}
		printCharsReverse(str.substring(1));
		System.out.println(str.charAt(0));
	}

	public static void printInBinary(int n) {
		if (n < 2) {
			System.out.printf("n<2 = %s \n", n);
		} else {
			printInBinary(n / 2);
			System.out.println(n % 2);
		}
	}

	public static int sum(int n, int[] data) {
		if (n <= 0)
			return 0;
		else
			return sum(n - 1, data) + data[n - 1];
	}

	public static void readFrom(int n, int[] data, Scanner in) {
		if (n <= 0) {
			return;
		}
		readFrom(n - 1, data, in);
		data[n - 1] = in.nextInt();
		System.out.println(data);
	}

	public static void main(String[] args) {
		//System.out.println(length("abbccc"));
		//printChars("안녕하세여");
		//printCharsReverse("안녕하세여");
		//printInBinary(20);
		//System.out.println(sum(10,new int[]{1,2,3,4,5,6,7,8,9,10}));
	}
}
