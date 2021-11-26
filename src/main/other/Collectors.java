package main.other;

import java.util.stream.Stream;

public class Collectors {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, -1, -2, -3)
                .collect(java.util.stream.Collectors.groupingBy(i -> i > 0, java.util.stream.Collectors.summarizingInt(Integer::intValue)))
                .forEach((k,v) -> System.out.println(k + " - " + v.getSum()));

    }
}
