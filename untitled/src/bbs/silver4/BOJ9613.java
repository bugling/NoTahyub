package bbs.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ9613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());

            int[] arr = new int[cnt];
            for (int j = 0; j < cnt; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[j] = num;
            }

            long sum = 0;

            for (int j = 0; j < cnt-1; j++) {
                int a = arr[j];
                for (int k = j+1; k < cnt; k++) {
                    int b = arr[k];
                    int min = a, max = b;
                    if (min > max) {
                        int temp = min;
                        min = max;
                        max = temp;
                    }
                    sum += gcd(max, min);
                }
            }
            System.out.println(sum);
        }
    }

    private static int gcd (int a, int b) {
        if (a%b == 0) return b;
        else return gcd(b, a%b);
    }
}
