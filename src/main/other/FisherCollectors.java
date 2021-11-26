package main.other;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FisherCollectors {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, -1, -2, -3)
                .collect(Collectors.groupingBy(i -> i > 0, Collectors.summarizingInt(Integer::intValue)))
                .forEach((k, v) -> System.out.println(k + " - " + v.getSum()));

    }
}
