package line;/* package whatever; // don't place package name! */

import java.io.*;

class MemCopy {

	void memcpy(byte[] v, int dest, int src, int size) {
		if (v == null || v.length == 0) {
			throw new RuntimeException();
		}
		if (v.length > 1024) {
			throw new RuntimeException();
		}

		byte[] temp = new byte[v.length];
		for (int i = src; i < src + size; i++) {
			temp[i] = v[i];
		}
//
		for (int i = dest; i <= dest + size - 1; i++) {
			v[i] = temp[src++];
		}

		for (int i = 0; i < v.length; i++) {
			// java 의 byte 는 -128 ~ 127을 넘어가면 -1 로 표시됨 그래서 & 0xFF 로 선연산을 해줘야됨.
			String value = String.valueOf(v[i] & 0xFF);
			System.out.print(value + " ");
		}
	}

	/*
	* input :
	* 10
	* 0 255 123 12 2 4 12 4 55 2
	* 5 0 3
	  output :
	  0 255 123 12 2 0 255 123 55 2
	* */
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int first = Integer.parseInt(br.readLine());
		byte[] data = new byte[first];

		String second = br.readLine();
		String[] splits = second.split(" ");

		for (int i = 0; i < splits.length; i++) {
			String string = splits[i];
			int number = (Integer.parseInt(string));
			data[i] = (byte) number;
		}

		String third = br.readLine();
		splits = third.split(" ");
		int[] params = new int[splits.length];
		for (int i = 0; i < splits.length; i++) {
			params[i] = Integer.parseInt(splits[i]);
		}

		MemCopy memCopy = new MemCopy();
		memCopy.memcpy(data, params[0], params[1], params[2]);
	}

}
