package bbs.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N+1];
        int[] B = new int[M+1];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int indexA = 0, indexB = 0;

        StringBuilder sb = new StringBuilder();
        while(indexA < N || indexB < M) {

            if (indexA > N - 1) {
                sb.append(B[indexB] + " ");
                indexB++;
                continue;
            }else if (indexB > M - 1) {
                sb.append(A[indexA] + " ");
                indexA++;
                continue;
            }

            if (A[indexA] > B[indexB]) {
                sb.append(B[indexB] + " ");
                indexB++;
            }else {
                sb.append(A[indexA] + " ");
                indexA++;
            }
        }

        System.out.println(sb);


    }
}
