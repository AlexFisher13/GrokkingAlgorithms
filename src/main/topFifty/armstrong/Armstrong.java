package main.topFifty.armstrong;

import java.util.Arrays;

public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrongNumber(n));
    }

    private static boolean isArmstrongNumber(int n) {
        int originalNumber = n;
        int numbersCount = (int) Math.ceil(Math.log10(n));
        int[] arr = new int[numbersCount];
        int i = 0;
        while(n != 0) {
            arr[i] = n % 10;
            n /= 10;
            i++;
        }

        int sum = 0;
        for (int k : arr) {
            sum += Math.pow(k, 3);
        }

        return originalNumber == sum;
    }
}
