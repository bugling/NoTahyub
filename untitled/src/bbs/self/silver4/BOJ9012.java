package bbs.self.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            char[] parenthesises = br.readLine().toCharArray();

            int openCnt = 0;
            for (int j = 0; j < parenthesises.length; j++) {
                if (parenthesises[j] == '(') {
                    openCnt++;
                }else {
                    openCnt--;
                    if (openCnt < 0) {
                        sb.append("NO").append("\n");
                        break;
                    }
                }

                if (j == parenthesises.length - 1 ) {
                    if (openCnt == 0) {
                        sb.append("YES").append("\n");
                    } else {
                        sb.append("NO").append("\n");
                    }
                }
            }
        }

        System.out.println(sb);
        
    }
}
