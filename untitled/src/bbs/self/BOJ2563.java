package bbs.self;

import java.util.Scanner;

public class BOJ2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] D = new int[101][101];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    D[j][k] = 1;
                }
            }
        }
        
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (D[i][j] == 1) sum++;
            }
        }

        System.out.println(sum);
    }
}
