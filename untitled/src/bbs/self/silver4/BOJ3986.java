package bbs.self.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Character> stk;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            stk = new Stack();
            char[] line = br.readLine().toCharArray();
            for (int j = 0; j < line.length; j++) {
                if (j == 0) {
                    stk.push(line[j]);
                    continue;
                }

                if (!stk.isEmpty() && stk.peek() == line[j]) {
                    stk.pop();
                } else {
                    stk.push(line[j]);
                }
            }

            if (stk.isEmpty()) cnt++;
        }
        System.out.println(cnt);
    }
}
