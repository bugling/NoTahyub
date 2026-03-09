package bbs.basic.sort;

import java.util.Scanner;
import java.util.Stack;

public class QuickSort2 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 퀵 정렬(비재귀적 버전)
    static void quickSort(int[] a, int left, int right) {
        Stack<Integer> lstack = new Stack<>();
        Stack<Integer> rstack = new Stack<>();

        lstack.push(left);
        rstack.push(right);

        while (!lstack.isEmpty()) {
            int pl = left = lstack.pop();       // 왼쪽 커서
            int pr = right = rstack.pop();      // 오른쪽 커서
            int x = a[(left + right) / 2];      // 피벗

            do {
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr--;

                if (pl <= pr) {
                   swap(a, pl++, pr--);
                }

            } while (pl <= pr);

            if (left < pr) {
                lstack.push(left);
                rstack.push(pr);
            }

            if (pl < right) {
                lstack.push(pl);
                rstack.push(right);
            }

        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("퀵 정렬");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x  = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = stdIn.nextInt();
        }

        quickSort(x, 0, nx - 1);

        System.out.println("오름차순으로 정렬합니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i +"] = " + x[i]);
        }
    }
}