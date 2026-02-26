package bbs.silver4;

import java.util.Scanner;

public class BOJ1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int answer = 0;

        for (int i = 1; i <= N; i++) {
            int[] arr = new int[String.valueOf(i).length()];
            int idx = 0;
            int num = i;
            while (num > 0) {
                arr[idx++] = num % 10;
                num = num / 10;
            }

            if (arr.length <= 2) {
                answer++;
                continue;
            }

            boolean flag = true;
            for (int j = 0; j < arr.length - 2; j++) {
                if (arr[j] - arr[j + 1] != arr[j + 1] - arr[j + 2]) {
                    flag = false;
                    break;
                }
            }
            if (flag) answer++;

        }

        System.out.println(answer);

    }
}
