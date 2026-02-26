package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10867_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[2001];        // -1000 ~ +1000 (총 2001개의 인자가 들어올 수 있음)

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            A[temp + 1000] = 1;         // 배열의 인덱스가 음수를 가질 수 없으므로 +1000 쉬프트한다.
        }

        for (int i = 0; i < 2001; i++) {
            if (A[i] != 0) {
                System.out.print((i-1000) + " ");       // 출력할 때는 -1000하여 쉬프트를 해제한다.
            }
        }
    }
}
