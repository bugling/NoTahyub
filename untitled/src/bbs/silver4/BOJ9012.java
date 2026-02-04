package bbs.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            char[] temp = br.readLine().toCharArray();
            Stack<Character> stk = new Stack<>();
            boolean isEnd = false;

            for (char now : temp) {
                if (now == '(') {
                    stk.push(now);
                } else {
                    if (stk.isEmpty()) {
                        System.out.println("NO");
                        isEnd = true;
                        break;
                    } else {
                        stk.pop();
                    }
                }
            }
            if (!isEnd) {
                if (stk.isEmpty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
