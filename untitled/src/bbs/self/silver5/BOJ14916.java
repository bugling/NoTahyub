package bbs.self.silver5;

import java.util.Scanner;

// 손님인 2월짜리와 5원짜리로만 돈을 거슬러 달라고 함.
// 최소한의 개수로 돈을 돌려주면 됨
// ex1) 15원 -> 5원짜리 3개
// ex2) 14원 -> 5원 * 2  /  2원 * 2
// ex3) 13원 -> 5원 * 1  /  2원 * 4
public class BOJ14916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int M = 0;
        while(N > 0) {
            if ((N - 5) % 5 == 0) {
                N -= 5;
            } else {
                N -= 2;
            }
            M++;
            // 5원과 2원으로만 거슬러 줄 수 없으면 -1 출력
            if (N < 0) {    // 2와 5의 배수가 아닌 경우 음수가 나올 것이므로 -1 출력
                System.out.println(-1);
                return;
            }
        }

        System.out.println(M);
    }
}
