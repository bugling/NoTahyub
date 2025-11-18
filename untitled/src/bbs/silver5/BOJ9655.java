package bbs.silver5;

import java.util.Scanner;

//돌 게임은 두 명이서 즐기는 재밌는 게임이다.
//탁자 위에 돌 N개가 있다. 상근이와 창영이는 턴을 번갈아가면서 돌을 가져가며, 돌은 1개 또는 3개 가져갈 수 있다. 마지막 돌을 가져가는 사람이 게임을 이기게 된다.
//두 사람이 완벽하게 게임을 했을 때, 이기는 사람을 구하는 프로그램을 작성하시오. 게임은 상근이가 먼저 시작한다.
public class BOJ9655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
//        int count = 0;
//        while (N > 0) {
//            if (N >= 3) {
//                N -= 3;
//            }else {
//                N -= 1;
//            }
//
//            count++;
//        }
//
//        if (count % 2 == 1) {
//            System.out.println("SK");
//        }else {
//            System.out.println("CY");
//        }

        // SK 입장에서는 상대방에게 짝수개를 남기면 무조건 이기는 게임.
        // 애초에 홀수개가 있으면 무조건 이김.
        if (N % 2 == 1) System.out.println("SK");
        else System.out.println("CY");

    }
}
