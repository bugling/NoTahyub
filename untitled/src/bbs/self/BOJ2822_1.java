package bbs.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BOJ2822_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Problem> list = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            list.add(new Problem(i + 1, Integer.parseInt(br.readLine())));
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
        for (int i = 0; i < selected.size(); i++) {
            System.out.print(selected.get(i) + " ");
        }
    }

    static class Problem {
        int index;
        int score;

        public Problem(int index, int score) {
            this.index = index;
            this.score = score;
        }
    }
}
