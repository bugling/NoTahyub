package bbs.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            list1.add(st.nextToken());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            list2.add(st.nextToken());
        }

        Collections.sort(list1);
        Collections.sort(list2);

        int idx1 = 0, idx2 = 0;

        List<String> answer = new ArrayList<>();

        while (idx1 < list1.size() && idx2 < list2.size()) {

            String someone1 = list1.get(idx1);
            String someone2 = list2.get(idx2);

            int result = someone1.compareTo(someone2);

            if (result == 0) {
                answer.add(someone1);
                idx1++;
                idx2++;
            } else if (result < 0) {
                idx1++;
            } else {
                idx2++;
            }
        }

        System.out.println(answer.size());
        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }

    }
}
