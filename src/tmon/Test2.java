package tmon;

public class Test2 {
//	입력받은 문자열을 뒤집어서 반환하는 함수를 작성하세요.
//
//	ex> “I am a boy.” ->”.yob a ma I”
//
//	단 Java API인 reverse() 함수를 직접 호출하지 않고 직접 구현해야 합니다.
//

	public static String reverseString(String source) {
		if (source == null || source.length() == 0) {
			throw new NullPointerException("please input a source");
		}
		char[] in = source.toCharArray();
		int begin = 0;
		int end = in.length - 1;
		char temp;
		while (end > begin) {
			temp = in[begin];
			in[begin] = in[end];
			in[end] = temp;
			end--;
			begin++;
		}
		return new String(in);
	}

	public static String reverseString2(String source) {
		if (source == null || source.length() == 0) {
			throw new NullPointerException("please input a source");
		}
		char[] arr = new char[source.length()];
		int idx = 0;
		for (int i = source.length() - 1; i >= 0; i--) {
			arr[idx] = source.charAt(i);
			idx++;
		}
		return new String(arr);
	}

	public static void main(String[] args) {
		String source = "I am a boy.";
		System.out.println(reverseString(source));
		System.out.println(reverseString2(source));
	}
}
