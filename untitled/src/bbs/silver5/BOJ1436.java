package bbs.silver5;

import java.util.Scanner;

public class BOJ1436 {
    // 666이 포함된 수 중 N번 숫자
    // 1 -> 666
    // 2 -> 1666
    // 3 -> 2666 (오름차순)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int index = 666;    // 최초값 666
        int count = 0;      // 0부터 시작하는 이유: N이 1이 들어오면 while문 한 번 만 돌고 count=1이 된다음에 바로 끝나도록 -> '666'은 count가 1이됨

        while (count < N) {
            // 문자로 바꿨을 때 666포함하면 count++해줌. count는 N과 비교하는 변수로 사용하여 "몇 번째" 큰 수라는 뜻으로 활용
            if (String.valueOf(index).contains("666")) {
                count++;
            }
            index++;
        }

        System.out.println(index - 1);
        // -1 해주는 이유: while문이 끝나는 조건이 count==N이 되는 시점인데 그 때도 index++해주기 때문에 -1해줌 
    }

}
