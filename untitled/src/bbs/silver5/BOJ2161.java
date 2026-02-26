package bbs.silver5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");

            if (queue.size() > 1) {
                int first = queue.poll();
                queue.offer(first);
            }
        }
    }
}
