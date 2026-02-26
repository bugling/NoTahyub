package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 첫쨰줄 들어오는 값: N(사람 수)
// 둘쨰쭐 ~ 끝줄: 사람 신체 데이터(몸무게, 키)
// 1. 2차원 배열에 사람 데이터를 담는다. (몸무게, 키)[]
// 2. N번 반복 -> 각 사람을 다른 사람과 비교해서 자기보다 덩치 큰 사람 몇 명인지 세고, +1 해서 등수 체크
public class BOJ7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] members = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            members[i][0] = w;
            members[i][1] = h;
        }

        StringBuilder sb = new StringBuilder();
        // 비교 기준점인 사람 i
        for (int i = 0; i < N; i++) {

            // 본인보다 덩치 큰 사람 없으면 1등이므로 디폴트값을 1로 지정
            int rank = 1;

            // 비교 대상 j
            for (int j = 0; j < N; j++) {
                if (i == j) continue;   // 같은 사람은 비교 안하고 넘어감
                if (members[i][0] < members[j][0] && members[i][1] < members[j][1]) {
                    rank++;
                }
            }

            sb.append(rank + " ");
        }

        System.out.println(sb.toString());
    }
}
