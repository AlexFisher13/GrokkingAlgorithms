package main.fibonacci;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(0, 1));
        for (int i = 1; i < 20; i++) {
            list.add(list.get(i - 1) + list.get(i));
        }
        list.forEach(System.out::println);
    }
}
