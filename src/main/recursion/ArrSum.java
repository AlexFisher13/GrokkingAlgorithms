package main.recursion;

import java.util.Arrays;
import java.util.stream.IntStream;


/**
 * Задача рекурсивно посчитать сумму чисел массива
 */
public class ArrSum {
    private static int sum;

    public static void main(String[] args) {
        int[] arr = IntStream.range(1, 15).toArray();
        sum(arr);
        System.out.println(sum);
    }

    public static void sum(int arr[]) {
        if (arr.length == 1) {
            //БАЗОВЫЙ СЛУЧАЙ, то есть посчитать сумму из одноэлементного массива мы можем легко
            sum += arr[0];
        } else {
            //РЕКУРСИВНЫЙ СЛУЧАЙ, мы складываем в сумму последний элемент массива и обрезаем его на 1, и так будем делать пока не прийдем к базовому случаю
            sum += arr[arr.length-1];
            sum(Arrays.copyOf(arr, arr.length-1));
        }
    }

}
