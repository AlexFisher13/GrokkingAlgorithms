package main.bracketsValidator;

import java.util.Stack;

public class BracketsValidator {
    public static void main(String[] args) {
        System.out.println(isValidBrackets("({[]})[]"));
    }

    private static boolean isValidBrackets(String brackets) {
        char[] chars = brackets.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '(':
                case '[':
                case '{':
                    stack.push(chars[i]);
                    break;
                case ')':
                    if (stack.peek() == '(')
                        stack.pop();
                    else
                        stack.push(chars[i]);
                    break;
                case '}':
                    if (stack.peek() == '{')
                        stack.pop();
                    else
                        stack.push(chars[i]);
                    break;
                case ']':
                    if (stack.peek() == '[')
                        stack.pop();
                    else
                        stack.push(chars[i]);
                    break;
            }
        }
        return stack.isEmpty();
    }
}
