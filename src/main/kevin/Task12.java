package main.kevin;

import java.util.LinkedList;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        List<Long> l = primeNumbersBruteForce(10100000l);

        long multi = 0;
        long multiTmp;
        for (int i = 0; i < l.size(); i++) {
            for (int j = 0; j < l.size(); j++) {
                if (Math.abs(l.get(i) - l.get(j)) < 100) {
                    multiTmp = l.get(i) * l.get(j);
                    if ((String.valueOf(multiTmp).length() == 14) && (multiTmp > multi)) {
                        multi = multiTmp;
                    }
                }
            }
        }
        System.out.println(multi);
    }

    public static List<Long> primeNumbersBruteForce(long n) {
        List<Long> primeNumbers = new LinkedList<>();
        for (long i = 9999999; i <= n; i++) {
            if (isPrimeBruteForce(i)) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
    public static boolean isPrimeBruteForce(long number) {
        for (long i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}