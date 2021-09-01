package main.topFifty.palindromeInt;

import java.util.Arrays;

public class PalindromeInt {
    public static void main(String[] args) {
        int a = 1221;
        System.out.println(isPalindromeIterative(a));
        System.out.println(isPalindromeRecursive(a));
    }

    private static int[] getArray(int a) {
        String s = String.valueOf(a);
        return s.chars().toArray();
    }

    /** Итеративный подход */
    private static boolean isPalindromeIterative(int a) {
        int[] arr = getArray(a);
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i])
                return false;
        }
        return true;
    }

    /** Рекурсивынй подход */
    private static boolean isPalindrome = false;
    private static boolean isPalindromeRecursive(int a) {
        int[] arr = getArray(a);
        isPalindrome(arr);
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
