package bbs.basic.sort;

import java.util.Scanner;

public class Partition {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void partition(int[] a) {
        int n = a.length;
        int pl = 0;
        int pr = n - 1;
        int x = a[n / 2];       // 피벗

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;

            if (pl <= pr)
                swap(a, pl++, pr--);
        } while (pl < pr);

        System.out.println("피벗의 값은 " + x + "입니다.");

        System.out.println("피벗 이하의 그룹");
        for (int i = 0; i < pl - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        if (pl > pr + 1) {
            System.out.println("피벗과 일치하는 그룹");

            // pr은 왼쪽으로 넘어가 버렸고, pl은 오른쪽으로 넘어가 버렸으니
            // 그 사이 공간인 pr + 1부터 pl - 1까지가 "피벗과 똑같은 값들이 모인 중앙 지대"가 됨.
            for (int i = pr + 1; i < pl - 1; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        System.out.println("피벗 이상의 그룹");
        for (int i = pr + 1; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("배열을 나눕니다.");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }
        partition(x);
    }
}
