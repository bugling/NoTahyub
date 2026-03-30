package bbs.gold5;

import java.util.Scanner;

/**
 * N: 자릿수
 * DFS 실행   // 2,3,5,7로 탐색 시작, 일의 자리 시작이므로 자릿수는 1
 * DFS(2, 1)
 * DFS(3, 1)
 * DFS(5, 1)
 * DFS(7, 1)
 *
 * // DFS 구현하기
 * DFS(숫자, 자릿수) {
 *     if (자릿수 == N) {
 *         if (소수) 수 출력하기
 *         탐색 종료
 *     }
 *
 *     for (1 ~ 9 반복하기) {
 *        if (뒤에 붙은 수가 홀수이면서 소수일 때) {
 *            DFS(현재 수 * 10 + i, 자릿수 + 1)   // 자릿수 1씩 늘리면서 DFS 실행하기
 *        }
 *     }
 * }
 *
 * // 소수 구하기 함수
 * for ('2 ~ 현재 수 / 2' 반복하기) {
 *     if (나머지 0이면) return 소수가 아님
 * }
 * **/
public class BOJ2023 {

    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        DFS(2,1 );
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);
    }

    static private void DFS(int number, int jarisu) {
        if (jarisu == N) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            return;
        }
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (isPrime(number * 10 + i)) {
                DFS(number * 10 + i, jarisu + 1);
            }
        }
    }


    static private boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
