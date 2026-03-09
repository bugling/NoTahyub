package bbs.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        int[] B = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int idxA = 0, idxB = 0;

        int count = 0;

        while (idxA < N && idxB < M) {
            int tempA = A[idxA];
            int tempB = B[idxB];
            if (tempA == tempB) {
                idxA++;
                idxB++;
            } else if (tempA < tempB) {
                idxA++;
                count++;
            } else {
                idxB++;
                count++;
            }
        }

        if (idxA < N) {
            count += N - idxA;
        }
        if (idxB < M) {
            count += M - idxB;
        }

        System.out.println(count);

    }
}
