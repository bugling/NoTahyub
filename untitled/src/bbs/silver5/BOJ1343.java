package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringBuilder sb = new StringBuilder();
        char[] text = br.readLine().toCharArray();
        int cnt = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == 'X') {
                cnt++;
            } else {
                if (cnt % 2 == 1) {
                    System.out.println(-1);
                    return;
                }

                int sizeA = cnt / 4;

                for (int j = 0; j < sizeA; j++) {
                    sb.append("AAAA");
                }

                cnt = cnt % 4;
                int sizeB = cnt / 2;

                for (int j = 0; j < sizeB; j++) {
                    sb.append("BB");
                }

                sb.append(".");

                cnt = 0;
            }
        }

        if (cnt % 2 == 1) {
            System.out.println(-1);
            return;
        }

        int sizeA = cnt / 4;

        for (int j = 0; j < sizeA; j++) {
            sb.append("AAAA");
        }

        cnt = cnt % 4;
        int sizeB = cnt / 2;

        for (int j = 0; j < sizeB; j++) {
            sb.append("BB");
        }

        System.out.println(sb);

    }
}
