package main.kevin;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    private static List<Integer> screamersChain = new ArrayList<>();
    private static Map<Integer, List<Integer>> rows = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader contentReader = new BufferedReader(new InputStreamReader(new FileInputStream("c://advent_11.test.txt")));
        String line = contentReader.readLine();
        int index = 1;
        while (line != null) {
            List<Integer> collect = Stream.of(line.split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            line = contentReader.readLine();
            if (collect.size() == 1) {
                rows.put(index++, Collections.EMPTY_LIST);
            } else {
                rows.put(index++, collect.subList(1, collect.size()));
            }
        }

        rows.forEach((k, v) -> runScreamer(k));

        long sum = 0;
        for (int i = 0; i < 5000 ; i++) {
            sum += (long) (i + 1) * screamersChain.get(i);
        }
        System.out.println(sum);
    }

    private static void runScreamer(int number) {
        List<Integer> beforeScreamersNumbers = rows.get(number);
        for (int i = 0; i < beforeScreamersNumbers.size(); i++) {
            if (!screamersChain.contains(beforeScreamersNumbers.get(i))) {
                runScreamer(beforeScreamersNumbers.get(i));
            }
        }
        if (!screamersChain.contains(number)) {
            screamersChain.add(number);
        }
    }
}