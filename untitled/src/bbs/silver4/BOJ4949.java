package bbs.silver4;

import java.io.*;
import java.util.Stack;

public class BOJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text;

        while (!(text = br.readLine()).equals(".")) {
            Stack<Character> myStack = new Stack<>();
            boolean result = true;

            for (char now : text.toCharArray()) {
                if (now == '(' || now == '[') {
                    myStack.push(now);
                } else if (now == ')') {
                    if (myStack.isEmpty() || myStack.pop() != '(') {
                        result = false;
                        break;
                    }
                } else if (now == ']') {
                    if (myStack.isEmpty() || myStack.pop() != '[') {
                        result = false;
                        break;
                    }
                }
            }

            System.out.println(result && myStack.isEmpty() ? "yes" : "no");
        }
    }
}
