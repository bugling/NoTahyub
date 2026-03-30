package bbs.self.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < N; i++) { 
            int banjirm = Integer.parseInt(st.nextToken());
            int gcdValue = gcd(first, banjirm);
            sb.append(first / gcdValue);
            sb.append("/");
            sb.append(banjirm / gcdValue);
            sb.append("\n");
        }

        System.out.println(sb);
    }

    private static int gcd(int a, int b) {
        if (a%b==0) return b;
        else return gcd(b, a%b);
    }
}
