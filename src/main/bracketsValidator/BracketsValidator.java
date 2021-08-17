package main.bracketsValidator;

import java.util.Stack;

public class BracketsValidator {
    public static void main(String[] args) {
        System.out.println(isValidBrackets("({[]})[]"));
    }

    private static boolean isValidBrackets(String brackets) {
        char[] chars = brackets.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char с : chars) {
            switch (с) {
                case '(':
                case '[':
                case '{':
                    stack.push(с);
                    break;
                case ')':
                    if (stack.peek() == '(')
                        stack.pop();
                    else
                        stack.push(с);
                    break;
                case '}':
                    if (stack.peek() == '{')
                        stack.pop();
                    else
                        stack.push(с);
                    break;
                case ']':
                    if (stack.peek() == '[')
                        stack.pop();
                    else
                        stack.push(с);
                    break;
            }
        }
        return stack.isEmpty();
    }
}
