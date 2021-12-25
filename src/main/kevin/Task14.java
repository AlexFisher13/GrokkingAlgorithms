package main.kevin;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class Task14 {
    static Map<Integer, List<String>> exclusions = new HashMap<>();
    static StringBuffer password = new StringBuffer();
    
    public static void main(String[] args) throws IOException {
        readExclusionsFromFile();

        for (int i = 1; i < exclusions.size() + 1; i++) {
            String median = getMedian(exclusions.get(i));
            password.append(median);
        }
        System.out.println(password);
    }


    private static String getMedian(List<String> exclusions) {
        StringBuffer alphabet = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        int tmp;
        for (int i = 0; i < exclusions.size(); i++) {
            tmp = alphabet.indexOf(exclusions.get(i));
            alphabet.delete(tmp, tmp + 1);
        }
        int median = alphabet.length() / 2;

        return alphabet.substring(median-1, median);
    }

    static void readExclusionsFromFile() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c://advent_14.test.txt")));
        reader.readLine();
        String line = reader.readLine();
        int i = 0;
        while (line != null) {
            String[] s = line.split(" ");
            int exKey = Integer.parseInt(s[0]);
            if (i == exKey) {
                List<String> l = exclusions.get(exKey);
                l.add(s[1]);
                exclusions.put(Integer.parseInt(s[0]), l);
            } else {
                i++;
                List<String> l = new LinkedList<>();
                l.add(s[1]);
                exclusions.put(Integer.parseInt(s[0]), l);
            }

            line = reader.readLine();
        }
    }
}