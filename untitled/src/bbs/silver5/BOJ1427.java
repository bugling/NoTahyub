package bbs.silver5;

import java.util.Scanner;

public class BOJ1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[10];

        while (num > 0) {
            arr[num % 10]++;
            num /= 10;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=9; i>=0; i--) {
            if (arr[i] != 0) {
                for (int j = 0; j < arr[i]; j++) {
                    sb.append(i);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
