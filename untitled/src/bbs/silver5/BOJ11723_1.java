package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11723_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] S = new int[21];

        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String commend = st.nextToken();
            int num = 0;
            if (!"all".equals(commend) && !"empty".equals(commend)) {
                num = Integer.parseInt(st.nextToken());
            }


            switch (commend) {
                case "add":
                    S[num] = 1;
                    break;
                case "remove":
                    S[num] = 0;
                    break;
                case "check":
                    sb.append(S[num]).append("\n");
                    break;
                case "toggle":
                    if(S[num] == 1) {
                        S[num] = 0;
                    }else {
                        S[num] = 1;
                    }
                    break;
                case "all":
                    for (int j = 1; j <= 20; j++) {
                        S[j] = 1;
                    }
                    break;
                case "empty":
                    for (int j = 1; j <= 20; j++) {
                        S[j] = 0;
                    }
                    break;
            }

        }

        System.out.println(sb);
    }
}
