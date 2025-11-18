package ltg.silver5;

import java.util.Scanner;

public class Backjoon2480 {
    public static void main(String[] args) {
        // 3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성하시오
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result;

        if (a==b && a==c) {
            result = a * 1000 + 10000;
        } else if (a==b || a==c) {
            result = a * 100 + 1000;
        } else if (b==c) {
            result = b * 100 + 1000;
        } else {
            result = Math.max(c, Math.max(a,b)) * 100;
        }

        System.out.println(result);
    }

}
