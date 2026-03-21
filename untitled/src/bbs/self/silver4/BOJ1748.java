package bbs.self.silver4;

import java.util.Scanner;

public class BOJ1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int totalLen = 0;
        int plus = 1;       // 현재 숫자의 자리수(숫자의 길이)
        int num = 10;       // 자릿수가 바뀌는 기준점

        for (int i = 1; i <= N ; i++) {
            // num: 10, 100, 1000 ...
            if (i == num) {
                plus++;
                num *= 10;
            }
            totalLen += plus;
        }

        System.out.println(totalLen);

    }
}
