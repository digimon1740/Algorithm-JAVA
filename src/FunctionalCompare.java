import java.util.function.BiPredicate;

public class FunctionalCompare {

    static boolean sameText(String left, String right, BiPredicate<Character, Character> predicate) {
        if (left == null || left.length() == 0) {
            return false;
        }
        if (right == null || right.length() == 0) {
            return false;
        }
        if (left.length() != right.length()) {
            return false;
        }
        int length = left.length();
        char[] lefts = left.toLowerCase().toCharArray();
        char[] rights = right.toLowerCase().toCharArray();
        boolean result = true;
        for (int i = 0; i < length; i++) {
            if (!predicate.test(lefts[i], rights[i])) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String text1 = "abcd";
        String text2 = "bcda";
        boolean exp1 = sameText(text1, text2, (a, b) -> a == b);
        System.out.println(exp1);

        text1 = "abcd";
        text2 = text1;
        boolean exp2 = sameText(text1, text2, (a, b) -> a == b);
        System.out.println(exp2);
    }

//    @FunctionalInterface
//    interface BiPredicate {
//        boolean test(char a, char b);
//    }
}


