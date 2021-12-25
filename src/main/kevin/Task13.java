package main.kevin;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Task13 {

    private static List<String> listStr = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader contentReader = new BufferedReader(new InputStreamReader(new FileInputStream("c://advent_13.test.txt")));
        contentReader.readLine();
        String line = contentReader.readLine();
        while (line != null) {
            listStr.add(clearNum(line));
            line = contentReader.readLine();
        }

        List<Long> collect = listStr.stream().map(Long::parseLong).sorted().collect(Collectors.toList());
        System.out.println(collect.get(7492));
    }

    private static String clearNum(String s) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) != '(' &&
                s.charAt(i) != ')' &&
                s.charAt(i) != '-' &&
                s.charAt(i) != '+') {
                result.append(s.charAt(i));
            }
        }

        return result.delete(0, 1).toString();
    }
}
