package bbs.self.silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178_1 {

    static private int N, M;
    static private int[][] map;
    static private boolean[][] visited;
    static private int[] dx = {0, 1, 0, -1};
    static private int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0, 0);

        System.out.println(map[N-1][M-1]);
    }

    static private void bfs(int a, int b) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(a, b));
        visited[a][b] = true;

        while (!queue.isEmpty()) {
            Point now = queue.poll();

            for (int i = 0; i < 4; i++) {
                int newX = now.x + dx[i];
                int newY = now.y + dy[i];

                if (newX >= 0 && newY >= 0 && newX < N && newY < M) {
                    if (map[newX][newY] != 0 && !visited[newX][newY]) {
                        visited[newX][newY] = true;
                        map[newX][newY] = map[now.x][now.y] + 1;
                        queue.add(new Point(newX, newY));
                    }
                }
            }
        }


    }

    static private class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
