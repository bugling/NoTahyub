package bbs.self;

import java.util.Scanner;

public class BOJ1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0;
        for (int i = 5; i <= N; i++) {
            int now = i;
            while(now % 5 == 0) {
                count++;
                now /= 5;
            }
        }

        System.out.println(count);
    }
}
