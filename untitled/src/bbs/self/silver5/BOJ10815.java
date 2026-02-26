package bbs.self.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ10815 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

//        System.out.println();
//        System.out.println(Arrays.toString(arr));

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            // 중간 인덱스를 구한다.
            // 중간 자리 수보다 크면 위의 수 중 중간 자리 인덱스 수와 비교한다.
            // 또 중간 자리 수보다 크면 위의 수 중 중간 자리 인덱스 수와 비교한다.
            int startIndex = 0;
            int midIndex = N / 2;
            int endIndex = N-1;

            boolean flag = false;

            while (startIndex <= endIndex) {

                if (arr[midIndex] < num) {
                    startIndex = midIndex + 1;
                    midIndex = (startIndex + endIndex) / 2;
                }else if (arr[midIndex] == num) {
                    flag = true;
                    break;
                }else {
                    endIndex = midIndex - 1;
                    midIndex = (startIndex + endIndex) / 2;
                }
            }

            System.out.print(flag == true ? 1 + " " : 0 + " ");
        }

    }
}
