package bbs.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[20000];
        int head = 10000;        // 덱 첫번째 데이터의 앞를 가르키는 index
        int tail = 10000;          // 덱 마지막 데이터의 뒤를 가르키는 index

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push_front" :
                    A[--head] = Integer.parseInt(st.nextToken());
                    break;

                case "push_back" :
                    A[tail++] = Integer.parseInt(st.nextToken());
                    break;

                case "pop_front" :
                    if (tail - head == 0) System.out.println(-1);
                    else System.out.println(A[head++]);
                    break;

                case "pop_back" :
                    if (tail - head == 0) System.out.println(-1);
                    else System.out.println(A[--tail]);
                    break;

                case "size" :
                    System.out.println(tail - head);
                    break;

                case "empty" :
                    System.out.println(tail - head == 0 ? 1 : 0);
                    break;

                case "front" :
                    if (tail - head == 0) System.out.println(-1);
                    else System.out.println(A[head]);
                    break;

                case "back" :
                    if (tail - head == 0) System.out.println(-1);
                    else System.out.println(A[tail-1]);
                    break;

            }
        }

    }
}
