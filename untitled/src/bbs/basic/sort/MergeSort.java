package bbs.basic.sort;

import java.util.Scanner;

public class MergeSort {

    static int[] buff;

    static void __mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int i;
            int center = (left + right) / 2;
            int p = 0;      // buff에 담긴 요소의 개수(인덱스 아님)
            int j = 0;      // buff 배열의 인덱스(포인터)
            int k = left;   // a 배열의 인덱스

            __mergeSort(a, left, center);                // 배열의 앞부분을 병합 정렬합니다.
            __mergeSort(a, center + 1, right);      // 배열의 뒷부분을 병합 정렬합니다.

            // 왼쪽 절반을 buff에 넣는다
            for (i = left; i <= center; i++) {
                buff[p++] = a[i];
            }

            // 더 작은 값을 a에 쌓는다.
            while (i <= right && j < p) {
                a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
            }

            while (j < p) {
                // 잔류 처리(Clean up)
                a[k++] = buff[j++];
            }
        }
    }

    static void mergeSort(int[] a, int n) {
        buff = new int[n];

        __mergeSort(a, 0, n - 1);

        buff = null;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("병합 정렬");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x [" + i + "] = ");
            x[i] = stdIn.nextInt();
        }

        mergeSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

}
