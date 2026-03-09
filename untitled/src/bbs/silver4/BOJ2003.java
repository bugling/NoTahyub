package bbs.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        int startIndex = 0;
        int endIndex = 0;
        int sum = 0;

        while (true) {
            if (sum >= M) {
                // 합이 M보다 크거나 같으면 왼쪽(start)을 빼고 포인터 이동
                sum -= arr[startIndex++];
            } else if (endIndex == N) {
                // 더 이상 더할 숫자가 없으면 종료
                break;
            } else {
                // 합이 M보다 작으면 오른쪽(end)을 더하고 포인터 이동
                sum += arr[endIndex++];
            }

            // 위에서 sum을 조정한 후, 딱 M이 되는 순간 카운트
            if (sum == M) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
