package bbs.self.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<Integer> A = new HashSet<>();
        Set<Integer> copiedA = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            A.add(temp);
            copiedA.add(temp);
        }

        Set<Integer> B = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int temp = Integer.parseInt(st.nextToken());
            B.add(temp);
        }

        for (int temp : B) {
            A.remove(temp);
        }

        for (int temp : copiedA) {
            B.remove(temp);
        }

        System.out.println(A.size() + B.size());
    }
}
