package bbs.self.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Integer[] ropes = new Integer[N];
        for (int i = 0; i < N; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(ropes);

        int maxWeight = 0;
        for (int i = 0; i < N; i++) {
            if (maxWeight < ropes[i] * (N-i)) {
                maxWeight = ropes[i] * (N-i);
            }
        }

        System.out.println(maxWeight);
    }
}
