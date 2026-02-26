package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1439_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();

        int groupCnt0 = 0;
        int groupCnt1 = 0;

        if (chars[0] == '0') groupCnt0++;
        else groupCnt1++;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i-1]) {
                if (chars[i] == '0') groupCnt0++;
                else groupCnt1++;
            }
        }

        System.out.println(Math.min(groupCnt0, groupCnt1));
    }
}
