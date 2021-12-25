package main.kevin;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Task15 {
    static List<Pair<Integer, Integer>> cord = new ArrayList<>(223);
    static List<Pair<Integer, Integer>> result = new ArrayList<>(223);

    public static void main(String[] args) throws IOException {
        readFile();

        int sumLenght = 0;
        for (int i = 0; i < cord.size(); i++) {
            for (int j = 0; j < cord.size(); j++) {
                sumLenght += getLength(cord.get(i), cord.get(j));
            }
//            System.out.printf("На координатах (%d,%d) сумма длин равна %d, а сумма координат равна %d\n", cord.get(i).getKey(), cord.get(i).getValue(),
//                    sumLenght, cord.get(i).getKey() + cord.get(i).getValue());
            result.add(new Pair<>( sumLenght, cord.get(i).getKey() + cord.get(i).getValue()));
            sumLenght = 0;
        }

        result.stream().sorted(Comparator.comparing(Pair::getKey)).forEach(System.out::println);
    }

    private static int getLength(Pair<Integer, Integer> pair1, Pair<Integer, Integer> pair2) {
        int x = Math.abs(pair1.getKey() - pair2.getKey());
        int y = Math.abs(pair1.getValue() - pair2.getValue());
        return x + y;
    }

    static void readFile2() {
        cord.add(new Pair<>(1, 1));
        cord.add(new Pair<>(3, 3));
        cord.add(new Pair<>(1, 2));
        cord.add(new Pair<>(3, 2));
    }

    static void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c://advent_15.test.txt")));
        reader.readLine();
        String line = reader.readLine();
        while (line != null) {
            String[] s = line.split(" ");
            cord.add(new Pair<>(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
            line = reader.readLine();
        }
    }
}