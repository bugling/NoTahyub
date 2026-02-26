package bbs.basic.bruteForce;

import java.util.Scanner;

public class KmpMatch {

    static int kmpMatch(String text, String pattern) {

        int pt = 1;
        int pp = 0;
        int[] skip = new int[pattern.length() + 1];

        // 건너뛰기 표를 만듭니다.
        skip[pt] = 0;
        while (pt != pattern.length()) {
            if (pattern.charAt(pt) == pattern.charAt(pp)) {
                skip[++pt] = ++pp;
            } else if (pp == 0) {
                skip[++pt] = pp;
            } else {
                pp = skip[pp];
            }
        }

        pt = pt = 0;
        while (pt != text.length() && pp != pattern.length()) {
            if (text.charAt(pt) == pattern.charAt(pp)) {
                pt++;
                pp++;
            } else if (pp == 0) {
                pt++;
            } else {
                pp = skip[pp];
            }
        }

        if (pp == pattern.length()) {
            return pt - pp;
        }
    
        // 검색 실패
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("텍스트 : ");
        String s1 = stdIn.next();

        System.out.print("패턴 : ");
        String s2 = stdIn.next();

        int idx = kmpMatch(s1, s2);

        if (idx == -1) {
            System.out.println("텍스트에 패턴이 없습니다.");
        } else {
            // 일치하는 문자 바로 앞까지의 길이를 구합니다.
            int len = 0;
            for (int i = 0; i < idx; i++) {
                len += s1.substring(i, i + 1).getBytes().length;
            }
            len += s2.length();

            System.out.println((idx + 1) + "번째 문자부터 일치합니다.");
            System.out.println("텍스트 : " + s1);
            System.out.printf(String.format("패턴 : %%%ds\n", len), s2);
        }
    }
}
