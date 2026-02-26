package bbs.silver5;

import java.util.Scanner;

public class BOJ1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] S = sc.next().toCharArray();

        boolean change_S = true;
        int count = 0;
        for (int i = 1; i < S.length; i++) {
            if (S[i-1] != S[i]) {
                S[i] = S[i-1];
                if (change_S) {
                    count++;
                    change_S = false;
                }
            }else {
                change_S = true;
            }
        }

        System.out.println(count);
    }
}
