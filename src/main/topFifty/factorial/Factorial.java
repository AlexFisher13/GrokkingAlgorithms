package main.topFifty.factorial;

public class Factorial {
    public static void main(String[] args) {
        int a = 5;
        System.out.printf("Факториал числа %d равен %d%n", a, getFactorialIterative(a));
        System.out.printf("Факториал числа %d равен %d%n", a, getFactorialRecursion(a));
    }

    private static int getFactorialIterative(int a) {
        int factorial = 1;
        for (int i = 1; i < a + 1; i++)
            factorial *= i;
        return factorial;
    }

    private static int getFactorialRecursion(int a) {
        if (a == 1) return 1;
        else return a * getFactorialRecursion(a - 1);
    }
}
