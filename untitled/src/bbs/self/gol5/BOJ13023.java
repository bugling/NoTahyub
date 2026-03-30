package bbs.self.gol5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ13023 {

    static private ArrayList<Integer>[] A;
    static private boolean[] visited;
    static private boolean arrive;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        A = new ArrayList[N];
        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<>();
            visited[i] = false;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        arrive = false;

        for (int i = 0; i < N; i++) {
            if (arrive) break;

            DFS(i, 1);
        }

        System.out.println(arrive ? 1 : 0);
    }

    static private void DFS(int v, int depth) {

        if (visited[v]) {
            return;
        }

        if (depth == 5 || arrive) {
            arrive = true;
            return;
        }

        visited[v] = true;
        for (int n : A[v]) {
            DFS(n, depth + 1);
        }

        visited[v] = false;
    }
}
