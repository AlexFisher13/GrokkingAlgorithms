package main.kevin;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("c://advent_3.test")))) {
            String[] arr = reader.readLine().split(" ");
            Arrays.sort(arr);
            int count = 0;
            int sum = 0;
            for (int i = arr.length - 1; i > 0; i--) {
                sum += Integer.parseInt(arr[i]);
                count++;
                if (sum >= 1_000_000_000) break;
            }
            System.out.println(count);
        }
    }


}