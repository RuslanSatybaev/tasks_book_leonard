package part1;

import java.util.Locale;

public class Palindrome11 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ma4d4am"));
        System.out.println(isPal("Madam, I'm Adam!"));
    }

    private static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPal(String text) {
        String str = text.replaceAll("[^a-zA-Z0-9]", "");
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}
