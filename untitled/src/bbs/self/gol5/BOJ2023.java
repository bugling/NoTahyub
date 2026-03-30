package bbs.self.gol5;

import java.util.Scanner;

public class BOJ2023 {
    static private int N;
    static private StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
        System.out.println(sb);
    }

    private static void DFS(int number, int jarisu) {
        if (jarisu == N) {
            if (isPrime(number)) sb.append(number).append("\n");
        }

        if (isPrime(number)) {
            for (int i = 1; i < 10; i++) {
                if (i % 2 == 0) continue;
                DFS(number*10+i, jarisu+1);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num == 2) return true;
        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
