package main.topFifty.reverseWords;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "Мама мыла раму";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            for (int j = 0; j < chars.length / 2; j++) {
                char temp = chars[j];
                chars[j] = chars[chars.length - j - 1];
                chars[chars.length - j - 1] = temp;
            }
            arr[i] = String.valueOf(chars);
        }
        return String.join(" ", arr);
    }
}
