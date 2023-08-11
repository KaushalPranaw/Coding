package lendingkart;

public class PermutationOfString {
    public static void main(String[] args) {
        String s = "ABC";
        permute(s);
    }

    private static void permute(String s) {
        helper("", s);
    }

    private static void helper(String prefix, String remaining) {
        if (remaining.length() == 0) System.out.println(prefix);

        for (int i = 0; i < remaining.length(); i++) {
            helper(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
        }
    }
}
