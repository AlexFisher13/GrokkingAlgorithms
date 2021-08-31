package main.topFifty.palindrome;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        String a = "Шалаш";
        System.out.println(isPalindromeIterative(a));
        System.out.println(isPalindromeRecursive(a));
    }
    /** Итеративный подход */
    private static boolean isPalindromeIterative(String a) {
        int[] chars = a.toLowerCase().chars().toArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i])
                return false;
        }
        return true;
    }


    /** Рекурсивынй подход */
    private static boolean isPalindrome = false;
    private static boolean isPalindromeRecursive(String a) {
        int[] chars = a.toLowerCase().chars().toArray();
        isPalindrome(chars);
        return isPalindrome;
    }
    private static void isPalindrome(int[] chars) {
        if (chars.length < 2) {
            isPalindrome = true;
            return;
        }
        if (chars[0] == chars[chars.length - 1]) {
            isPalindrome(Arrays.copyOfRange(chars, 1, chars.length - 1));
        }
    }


}
