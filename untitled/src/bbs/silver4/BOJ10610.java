package bbs.silver4;

import java.util.*;

public class BOJ10610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        boolean hasZero = false;

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int num = chars[i] - '0';
            list.add(num);
            sum += num;
            if (num == 0) hasZero = true;
        }

        if (!hasZero || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }
        
        // 내림 차순 정렬 -> 가장 큰 수 만들기 목적
        Collections.sort(list, Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (int n : list) {
            sb.append(n);
        }

        System.out.println(sb);
    }
}
