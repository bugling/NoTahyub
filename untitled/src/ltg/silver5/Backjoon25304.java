package ltg.silver5;

import java.util.Scanner;

public class Backjoon25304 {
    public static void main(String[] args) {
        // 구매한 물건의 가격과 개수로 계싼한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사
        Scanner sc = new Scanner(System.in);

        // 첫째 줄에는 영수증에 적힌 총 금액 X
        int totalPrice = sc.nextInt();

        // 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N
        int cnt = sc.nextInt();

        // 이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.

        int calculatedPrice = 0;

        for(int i = 0; i < cnt; i++){
            calculatedPrice = calculatedPrice + sc.nextInt() * sc.nextInt();
        }

        if(totalPrice == calculatedPrice){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
