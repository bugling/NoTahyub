package bbs.self.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text;
        while (!(text = br.readLine()).equals(".")) {

            char[] chars = text.toCharArray();
            Stack<Character> myStack = new Stack<>();
            boolean flag = true;

            for (char now : chars) {
                if (now == '(' || now == '[') {
                    myStack.push(now);
                } else if (now == ')') {
                    if (myStack.isEmpty() || myStack.pop() != '(') {
                        flag = false;
                        break;
                    }
                } else if (now == ']') {
                    if (myStack.isEmpty() || myStack.pop() != '[') {
                        flag = false;
                        break;
                    }
                }
            }

            System.out.println(myStack.isEmpty() && flag ? "yes" : "no");
        }
    }
}
