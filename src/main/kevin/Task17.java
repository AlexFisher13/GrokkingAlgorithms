package main.kevin;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task17 {


    public static void main(String[] args) throws IOException {
//        String s = "(){(){[]}}{(())}";
        String s = readFile();

        int couter = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '{' && s.charAt(i) != '}')
                continue;
            if (s.charAt(i) == '{')
                couter++;
            if (s.charAt(i) == '}')
                couter--;
            if (couter == 0)
                sum++;
        }
        System.out.println(sum);
    }

    static String readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c://advent_17.test.txt")));
        return reader.readLine();
    }
}