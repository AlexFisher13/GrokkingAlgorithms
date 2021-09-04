package main.topFifty.reverseString;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        String s = "Саша";
//      изи подход
        System.out.println(new StringBuilder(s).reverse());
//      не используя дополнительный  массив
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {
        int[] arr = s.chars().toArray();

        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length -i -1];
            arr[arr.length -i -1] = temp;
        }

        return Arrays.stream(arr).toString();
    }
}
