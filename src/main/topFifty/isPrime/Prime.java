package main.topFifty.isPrime;

public class Prime {
    public static void main(String[] args) {
        int a = 21;
        System.out.println(isPrime(a));
    }

    private static boolean isPrime(int a) {
        if (a <= 2 ) {
            return true;
        } else if (a % 2 == 0) {
            return false;
        } else {
            for (int i = 2; i < a - 1; i++) {
               if (a % i == 0) {
                   return false;
               }
            }
            return true;
        }
    }
}
