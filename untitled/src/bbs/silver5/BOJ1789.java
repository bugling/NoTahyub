package bbs.silver5;

import java.util.Scanner;

// 자연수 N개를 중복되지 않게 더하여 S를 만들려고 한다. N의 최대값을 구하여라. (S최대값: 4,294,967,295)
public class BOJ1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();

        long sum = 0L;
        int N = 0;
        while (true) {
            N++;
            sum += N;

//            N++;  <-- 이 위치가 틀린 이유: sum이 S를 초과한 상태에서 +1이 됨. 만약 이렇게 할거면 N-2를 출력해야함

            // 만약 sum이 S를 초과했다면
            if (sum > S) {
                System.out.println(N-1);    // N개 보다 1개 적은 수를 더해야 S를 만들 수 있음.
                break;
            }
        }


    }
}
