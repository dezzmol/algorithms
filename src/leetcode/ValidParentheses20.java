package leetcode;

import java.util.Stack;

public class ValidParentheses20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                if (c == ')' && stack.getLast() == '(') {
                    stack.pop();
                    continue;
                }
                if (c == ']' && stack.getLast() == '[') {
                    stack.pop();
                    continue;
                }
                if (c == '}' && stack.getLast() == '{') {
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "]";
        System.out.println(isValid(s));
    }
}
