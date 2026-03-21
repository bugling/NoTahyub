package bbs.self.silver4;

import java.util.Scanner;

public class BOJ1748_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int totalLen = 0;
        int jarisu = 1;
        int num = 10;

        for (int i = 1; i <= N; i++) {
            if (i == num) {
                num = num * 10;
                jarisu++;
            }
            totalLen += jarisu;
        }

        System.out.println(totalLen);
    }
}
