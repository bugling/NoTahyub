package bbs.self.silver4;

import java.util.Scanner;

public class BOJ2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int five = N / 5; five >= 0 ; five--) {

            // N = 5 * five + remain
            int remain = N - 5 * five;

            // five == 0 인데 remain이 3의 배수가 아니면 for문을 빠져나와 -1을 출력한다.
            if (remain % 3 == 0) {
                int three = remain / 3;
                System.out.println(five + three);
                return;
            }
        }

        System.out.println(-1);
    }
}
