package bbs.self.bronze;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N == 1) {
            System.out.println(1);
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            queue.add(i+1);
        }

        while (true) {

            queue.remove();

            int temp = queue.peek();
            queue.remove();

            queue.add(temp);

            if (queue.size() == 1) {
                System.out.println(queue.peek());
                return;
            }
        }
    }
}
