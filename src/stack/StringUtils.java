package stack;

import java.util.Stack;

public class StringUtils {
    public static String reverse(String string) {
        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            stack.push(c);
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.empty()) {
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.toString();
    }
    
}
