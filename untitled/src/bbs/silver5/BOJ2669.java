package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2669 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] map = new int[101][101];        // 0: 0~1, 1: 1~2 ... 100: 100~101까지의 면적을 차지하기 때문에 101까지 선언함
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    map[x][y] = 1;
                }
            }
        }

        int count = 0;
        for (int x = 0; x < 101; x++) {
            for (int y = 0; y < 101; y++) {
                if (map[x][y] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
