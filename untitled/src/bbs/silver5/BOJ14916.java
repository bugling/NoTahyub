package bbs.silver5;

import java.util.Scanner;

public class BOJ14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N == 1 || N == 3) {
            System.out.println(-1);
            return;
        }

        int cnts = N / 5;
        N = N % 5;
        if (N % 2 != 0) {   // 남은 거스름돈이 홀수이면 5원짜리를 하나 빼서 거스름 돈에 더해줌 (홀수 + 홀수 == 짝수)
            cnts--;
            N += 5;
        }

        cnts += N / 2;

        System.out.println(cnts);

    }
}
