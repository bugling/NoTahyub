package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// (A * B) / 최대공약수 = 최소공배수
public class BOJ13241 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        if (b > a) {
            long temp = b;
            b = a;
            a = temp;
        }

        System.out.println(a * b / gcd(a, b));
    }

    private static long gcd(long a, long b) {
        if (a % b == 0) return b;
        return gcd(b, a % b);
    }
}
