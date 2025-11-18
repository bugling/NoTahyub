package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1476 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());   // 15
        int S = Integer.parseInt(st.nextToken());   // 28
        int M = Integer.parseInt(st.nextToken());   // 19

        int x = 0;
        while (true) {
            x++;

            if ((x - E) % 15 == 0 &&
                (x - S) % 28 == 0 &&
                (x - M) % 19 == 0) {
                System.out.println(x);
                break;
            }
        }
    }
}