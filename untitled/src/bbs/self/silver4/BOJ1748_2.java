package bbs.self.silver4;

import java.util.Scanner;

public class BOJ1748_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   
        int M = N;      // M: 남은 자연수의 개수, N은 반복문의 조건으로 활용하기 때문에 값을 복사해서 사용함
        int S = 1;      // 현재 자리수
        int totalLen = 0;

        for (int i = 10; i <= N; i=i*10) {
            totalLen += (i-(i/10)) * S++;
            M = M - (i-(i/10));
        }

        totalLen += M * S;

        System.out.println(totalLen);
    }
}
