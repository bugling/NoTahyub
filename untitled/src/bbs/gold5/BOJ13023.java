package bbs.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * [ 슈도 코드 ]
 * N: 노드 개수
 * M: 에지 개수
 * A: 그래프 데이터 저장 인접 리스트
 * visited: 방문 기록 저장 배열
 * arrive: 도착 확인 변수
 * for(N의 개수만큼 반복) {
 *     A 인접 리스트의 각 ArrayList 초기화하기
 * }
 * for(M의 개수만큼 반복하기) {
 *     A 인접 리스트에 그래프 데이터 저장하기
 * }
 * for(N의 개수만큼 반복하기) {
 *     각 노드마다 DFS 실행하기
 *     if (arrive) 반복문 종료       // depth가 5에 도달한 적이 있다면
 * }
 * 
 * if(arrive) 1출력
 * else 0 출력
 *
 * DFS {
 *     if (깊이가 5 || arrive) {
 *         arrive = true;
 *         함수 종료
 *     }
 *     방문 배열에 현재 노드 방문 기로하기
 *     현재 노드의 연결 노드 중 방문하지 않은 노드로 DFS 실행하기(호출마다 depth++ 실행)
 * }
 *
 * **/
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
        for (int i = 0; i < N; i++) {
            A[i] = new ArrayList<>();
        }

        visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        for (int i = 0; i < N; i++) {
            DFS(i, 1);

            if (arrive) break;
        }

        System.out.println(arrive ? 1 : 0);
    }

    private static void DFS(int now, int depth) {
        if (depth == 5 || arrive) {
            arrive = true;
            return;
        }

        visited[now] = true;

        for (int i : A[now]) {
            if (!visited[i]) {
                DFS(i, depth+1);
            }
        }
        visited[now] = false;
    }
}
