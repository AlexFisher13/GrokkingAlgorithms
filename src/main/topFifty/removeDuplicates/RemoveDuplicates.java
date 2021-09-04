package main.topFifty.removeDuplicates;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] arr = {5, 5, 7, 7, 8, 8};
        Arrays.stream(removeDuplicates(arr)).forEach(System.out::println);
    }

    public static Object[] removeDuplicates(Object[] arr) {
        //находим дубликаты их опустошаем их ячейки
        int duplicates = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != null && arr[j] != null && arr[i].equals(arr[j])) {
                    arr[j] = null;
                    duplicates++;
                }
            }
        }
        //двигаем пустые ячейки в конец
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] == null) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = null;
                }
            }
        }
        //отрезаем пустые ячейки
        int newLength = arr.length - duplicates;
        Object[] newArr = new Object[newLength];
        System.arraycopy(arr, 0, newArr, 0, newLength);

        return newArr;
    }


}
