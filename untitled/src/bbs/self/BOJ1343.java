package bbs.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1343 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] text = br.readLine().toCharArray();

        int cnt = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] == 'X') {
                cnt++;
            }
            // '.'이 나왔을 때
            else {

                if (cnt % 2 == 1) {
                    System.out.println("-1");
                    return;
                }

                appendText(cnt);
                sb.append(".");
                cnt = 0;
            }
        }

        if (cnt % 2 == 1) {
            System.out.println("-1");
            return;
        }

        appendText(cnt);

        System.out.println(sb);
    }

    private static void appendText(int cnt) {

        int sizeA = cnt / 4;
        cnt = cnt % 4;
        for (int j = 0; j < sizeA; j++) {
            sb.append("AAAA");
        }

        int sizeB = cnt / 2;
        for (int j = 0; j < sizeB; j++) {
            sb.append("BB");
        }
    }
}
