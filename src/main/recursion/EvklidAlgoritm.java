package main.recursion;

/**
 * Необходимо разделить прямоугольник на МАКСИМАЛЬНО БОЛЬШИЕ ОДИНАКОВЫЕ квадраты.
 * p.s. по сути это нахождение наибольшего общего делителя между двумя цифрами.
 */

public class EvklidAlgoritm {
    private static int a = 1680; //длина
    private static int b = 640; //ширина

    public static void main(String[] args) {
        calc(a, b);
    }

    private static void calc(int a, int b) {
        int c;
        if (a % b == 0) {
            // БАЗОВЫЙ СЛУЧАЙ, когда наше поле ровно деится на ровные кадраты. (по сути когда длина кратна ширине)
            System.out.printf("Квдарат %d на %d", b, b);
        } else {
            // РЕКУРСИВНЫЙ СЛУЧАЙ, когда мы остаток, также пытаемся поровну поделить, и передаем дальше
            c = a % b;
            calc(b, c);
        }
    }
}
