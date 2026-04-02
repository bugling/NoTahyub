package bbs.gold3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * [ 슈도 코드 ]
 * N: 노드 개수, A: 그래프 데이터 저장 인접 리스트
 * visited: 방문 기록 저장 배열, distance: 거리 저장 배열
 * for(N의 개수만큼 반복) {
 *    A 인접 리스트의 각 ArrayList 초기화하기
 * }
 * for(M의 개수만큼 반복하기) {
 *     A 인접 리스트에 그래프 데이터 저장하기
 * }
 * visited 배열 초기화하기
 * distance 배열 초기화하기
 * BFS(임의의 점을 시작점으로) 실행하기
 * distance 배열에서 가장 큰 값을 지니고 있는 노드를 시작점으로 지정하기
 * visited 배열 초기화하기
 * distance 배열 초기화하기
 * BFS(새로운 시작점으로) 실행하기
 * distance 배열에서 가장 큰 수를 정답으로 출력
 *
 * BFS {
 *     큐 자료구조에 시작 노드 삽입하기(add 연산)
 *     visited 배열에 현재 노드 방문 기록하기
 *     while(큐가 비어 있을 때까지) {
 *         큐에서 노드 데이터를 가져오기(poll연산)
 *         현재 노드의 연결 노드 중 방문하지 않은 노드로
 *         큐에 데이터 삽입(add 연산)하고 visited 배열에 방문 기록하기
 *         그리고 현재 노드의 거리 + 에지의 가중치로 방문하지 않은 노드 거리 배열 업데이트
 *     }
 * }
 *
 * Edge {
 *     e(목적지 노드), value(에지의 가중치)
 * }
 *
 * **/
public class BOJ1167 {
    static private boolean visited[];
    static private int[] distance;
    static private ArrayList<Edge>[] A;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        distance = new int[N + 1];
        A = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            while (true) {
                int num = Integer.parseInt(st.nextToken());
                if (num == -1) break;

                int weight = Integer.parseInt(st.nextToken());

                A[index].add(new Edge(num, weight));
            }
        }

        BFS(1);
        int max = 1;
        for (int i = 2; i <= N; i++) {
            if (distance[max] < distance[i]) {
                max = i;
            }
        }

        distance = new int[N + 1];
        visited = new boolean[N + 1];
        BFS(max);
        Arrays.sort(distance);
        System.out.println(distance[N]);
    }

    private static void BFS(int index) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(index);
        visited[index] = true;
        while(!queue.isEmpty()) {
            int now = queue.poll();
            for (Edge edge : A[now]) {
                int e = edge.e;
                int v = edge.v;
                if (!visited[e]) {
                    visited[e] = true;
                    queue.add(e);
                    distance[e] = distance[e] + v;
                }
            }
        }
    }

    private static class Edge {
        int e;
        int v;
        public Edge (int e, int v) {
            this.e = e;
            this.v = v;
        }
    }
}
