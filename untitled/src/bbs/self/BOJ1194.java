package bbs.self;

import java.util.Scanner;

public class BOJ1194 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int sum = 64;
        int stick = 64;
        int count = 1;

        while (X < sum) {
            int half = stick / 2;

            if (sum - half >= X) {
                sum -= half;
            }else {
                count++;
            }

            stick /= 2;
        }

        System.out.println(count);
    }
}
