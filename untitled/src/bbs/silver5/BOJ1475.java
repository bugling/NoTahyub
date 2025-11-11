package bbs.silver5;

import java.util.Scanner;

public class BOJ1475 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        while (num > 0) {
            int idx = num % 10;
            if(idx == 6) nums[9]++;
            else nums[idx]++;
            num /= 10;
        }

        nums[9] = (nums[9] + 1) / 2;        // 올림처리

        int maxIndex = 0;
        for (int i = 1; i <10; i++) {
            if (nums[maxIndex] < nums[i]) maxIndex = i;
        }

        System.out.println(nums[maxIndex]);
    }
}
