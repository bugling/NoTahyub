package bbs.self.silver4;

import java.util.Scanner;

public class BOJ2839_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int five = N / 4; five >= 0; five--) {
            // N = 5 * five + remain
            int remain = N - 5 * five;

            if (remain % 3 == 0) {
                int three = remain / 3;
                System.out.println(five + three);
                return;
            }
        }

        System.out.println(-1);

    }
}
