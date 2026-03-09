package bbs.basic.sort;

import java.util.Scanner;

public class HeapSort {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void downHeap(int[] a, int left, int right) {
        int temp = a[left];     // 내려갈 기준이 되는 '부모 노드'의 값을 잠시 보관
        int child;              // 자식 노드 중 큰 값을 가진 인덱스를 저장할 변수
        int parent;             // 현재 조사 중인 부모 노드의 인덱스

        // 배열 a에서 a[left] ~ a[right]를 힙으로 만듦
        // parent < (right + 1) / 2 : 자식이 있는 노드들만 아래로 내려보내기 위함
        // (자식이 존재할 수 있는 마지막 부모의 인덱스 범위)
        for (parent = left; parent < (right + 1) / 2; parent = child) {
            int cl = parent * 2 + 1;                            // 왼쪽 자식
            int cr = cl + 1;                                    // 오른쪽 자식
            // cr <= right 조건이 존재하는 이유: cr이 존재하지 않을 수 있음.(자식이 cl 하나인 경우) 그런 경우에는 무조건 cl이 child가 되게 함
            child = (cr <= right && a[cr] > a[cl]) ? cr : cl;   // 큰 값을 가진 노드를 자식에 대입

            // 부모가 더 크면 종료
            if (temp > a[child]) {
                break;
            }
            // 자식 값을 위로 올림
            a[parent] = a[child];
        }
        a[parent] = temp;       // 보관했던 값을 적절한 위치에 삽입
    }

    static void heapSort(int[] a, int n) {
        for (int i = (n - 1) / 2; i >= 0; i--) {       // a[i] ~ a[n-1]를 힙으로 만들기
            downHeap(a, i, n-1);
        }

        for (int i = n-1; i > 0; i--) {
            swap(a, 0, i);                       // 가장 큰 요소와 아직 정렬되지 않은 부분의 마지막 요소를 교환
            downHeap(a, 0, i - 1);         // a[0] ~ a[i-1]을 힙으로 만듭니다.
        }
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("힙 정렬");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]");
            x[i] = stdIn.nextInt();
        }

        heapSort(x, nx);
    }
}
