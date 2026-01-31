package bbs.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Problem> list = new ArrayList<>();

        // 입력
        for (int i = 0; i < 8; i++) {
            int score = Integer.parseInt(br.readLine());
            list.add(new Problem(i + 1, score));
        }

        Collections.sort(list, new Comparator<Problem>() {
            @Override
            public int compare(Problem o1, Problem o2) {
                return o2.score - o1.score;
            }
        });

        int sum = 0;
        List<Integer> selected = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            sum += list.get(i).score;
            selected.add(list.get(i).index);
        }

        Collections.sort(selected);

        System.out.println(sum);
        for (int n : selected) {
            System.out.print(n + " ");
        }

    }

    static class Problem {
        int index;
        int score;

        Problem(int index, int score) {
            this.index = index;
            this.score = score;
        }
    }
}
