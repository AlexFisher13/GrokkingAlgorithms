package main.bracketsValidator;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BracketsValidator2 {
    public static void main(String[] args) {
        System.out.println(isValidBrackets("({[]})[]"));
    }

    public static boolean isValidBrackets(String s) {
        if(s == null || s.length() == 0) return true;
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                stack.add(c);
            } else {
                if (stack.isEmpty() || map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}