package bbs.silver5;

import java.util.Scanner;

public class BOJ2563 {
    public static void main(String[] args) {
        int[][] D = new int[101][101];
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {       // N개의 색종이
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < x+10; j++) {
                for (int k =y; k < y+10; k++) {
                    D[j][k] = 1;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(D[i][j] == 1) sum++;
            }
        }

        System.out.println(sum);

    }
}
