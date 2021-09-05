package main.topFifty.repeatebleSimbols;

import java.util.HashMap;
import java.util.Map;

public class RepeatableSimbols {
    public static void main(String[] args) {
        String s = "кблаблаалллалааа";
        printRepeatableSimbols(s);
    }

    private static void printRepeatableSimbols(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char a : s.toCharArray()) {
            if (map.containsKey(a))
                map.put(a, map.get(a) + 1);
            else
                map.put(a, 1);
        }

        map.keySet().forEach(k -> {
            if (map.get(k) > 1)
                System.out.println(k + " : " + map.get(k));
        });
    }
}
