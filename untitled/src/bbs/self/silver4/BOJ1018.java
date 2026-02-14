package bbs.self.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;

        char[][] board = new char[x][y];
        for (int i = 0; i < x; i++) {
            st = new StringTokenizer(br.readLine());
            char[] line = st.nextToken().toCharArray();
            for (int j = 0; j < y; j++) {
                board[i][j] = line[j];
            }
        }

        for (int i = 0; i <= x - 8; i++) {
            for (int j = 0; j <= y-8; j++) {
                int w_cnt = 0;
                for (int k = i; k < i+8; k++) {
                    for (int l = j; l < j+8; l++) {
                        if ((k+l) % 2 == 1 && board[k][l] == 'W') {
                            w_cnt++;
                        } else if ((k + l) % 2 == 0 && board[k][l] == 'B') {
                            w_cnt++;
                        }
                    }
                }
                min = Math.min(min, Math.min(w_cnt, 64 - w_cnt));
            }
        }

        System.out.println(min);
    }
}
