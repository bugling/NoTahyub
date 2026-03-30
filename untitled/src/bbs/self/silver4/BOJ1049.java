package bbs.self.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int stringCnt = Integer.parseInt(st.nextToken());
        int brandCnt = Integer.parseInt(st.nextToken());
        int cost = 0;

        int[] setAmountArr = new int[brandCnt];
        int[] unitAmountArr = new int[brandCnt];

        for (int i = 0; i < brandCnt; i++) {
            st = new StringTokenizer(br.readLine());
            setAmountArr[i] = Integer.parseInt(st.nextToken());
            unitAmountArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(setAmountArr);
        Arrays.sort(unitAmountArr);

        int minSetAmount = setAmountArr[0];
        int minUnitAmount = unitAmountArr[0];

        int minValue = Math.min(minSetAmount, minUnitAmount*6);
        int remainCnt = stringCnt % 6;
        cost = stringCnt / 6 * minValue;
        minValue = Math.min(minSetAmount, remainCnt * minUnitAmount);
        cost += minValue;

        System.out.println(cost);
    }
}
