package bbs.self.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) queue.offer(i);

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                int num = queue.poll();
                queue.offer(num);
            }

            int num = queue.poll();
            sb.append(num);

            if (!queue.isEmpty()) sb.append(", ");
        }

        sb.append(">");
        System.out.println(sb);

    }
}
