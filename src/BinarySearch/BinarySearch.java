package BinarySearch;

import java.util.stream.IntStream;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = IntStream.range(1, 100).toArray();
        int x = 65;
        int head = 0;
        int tail = arr.length;
        int mid = (tail + head) / 2;
        int count = 0;

        while (x != arr[mid]) {
            if (x > arr[mid]) {
                head = mid;
            } else {
                tail = mid;
            }
            mid = (tail + head) / 2;
            count++;
        }

        System.out.println(String.format("Позиция найденного значения: %d, количество шагов: %d", mid, count));
    }
}
