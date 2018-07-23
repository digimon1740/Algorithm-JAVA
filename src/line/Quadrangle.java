package line;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Quadrangle {

	int getSize(int width, int height) {
		// 시간복잡도 : O(1)
		return width * height;
	}

	/*
	*   input : 4 3
	*
	*   output : 12
	* */
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String[] splits = input.split(" ");
		if (splits.length != 2) {
			throw new RuntimeException();
		}
		try {
			int width = Integer.parseInt(splits[0]);
			int height = Integer.parseInt(splits[1]);
			Quadrangle quadrangle = new Quadrangle();
			System.out.println(quadrangle.getSize(width, height));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}
}
