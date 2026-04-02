package bbs.self.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * [ 슈도 코드 ]
 * N: 노드 개수, M: 에지 개수, Start: 시작점
 * A: 그래프 데이터 저장 인접 리스트, visited: 방문 기록 저장 배열
 * for(N의 개수만큼 반복) {
 *     A 인접 리스트의 각 ArrayList 초기화하기
 * }
 * for(M의 개수만큼 반복) {
 *     A 인접 리스트의 그래프 데이터 사용하기
 * }
 * // 방문할 수 있는 노드가 여러 개일 경우에는 번호가 작은 것을 먼저 방문하기 위해 정렬
 * for(N의 개수만큼 반복) {
 *     각 노드와 관련된 에지를 정렬
 * }
 * visited배열 초기화
 * DFS(Start)
 * visited 배열 초기화
 * BFS(Start)
 *
 * DFS {
 *     현재 노드 출력하기
 *     visited 배열에 현재 노드 방문 기록
 *     현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행하기(재귀 함수 형태)
 * }
 * BFS {
 *     큐 자료구조에 시작 노드 삽입하기(add 연산)
 *     visited 배열에 현재 노드 방문 기록하기
 *     while(큐가 비어 있을 때까지) {
 *         큐에서 노드 데이터를 가져오기 (poll 연산)
 *         가져온 노드 출력하기
 *         현재 노드의 연결 노드 중 미방문 노드를 큐에 삽입(add 연산)하고 방문 배열에 기록하기
 *     }
 * }
 * 
 * **/
public class BOJ1260 {
    static private ArrayList<Integer>[] A;
    static private boolean[] visited;
    static private StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        sb = new StringBuilder();
        A = new ArrayList[N + 1];
        visited = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
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

        for (int i = 1; i <= N; i++) {
            Collections.sort(A[i]);
        }

        DFS(start);

        for (int i = 1; i <= N; i++) {
            visited[i] = false;
        }
        sb.append("\n");

        BFS(start);

        System.out.println(sb);
    }

    static private void DFS(int v) {
        sb.append(v).append(" ");
        visited[v] = true;

        for(int n : A[v]) {
            if (!visited[n]) DFS(n);
        }
    }

    static private void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            sb.append(now).append(" ");
            for (int i : A[now]) {
                if(!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

    }
}
