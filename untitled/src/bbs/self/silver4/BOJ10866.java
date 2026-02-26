package bbs.self.silver4;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<String> deque = new ArrayDeque<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            String str = st.nextToken();
            if (str.contains("push_front")) {
                deque.offerFirst(st.nextToken());
            } else if(str.contains("push_back")) {
                deque.offerLast(st.nextToken());
            } else if (str.equals("front")) {
                if (deque.isEmpty()) {
                    bw.write("-1" + "\n");
                } else {
                    bw.write(deque.getFirst() + "\n");
                }
            } else if (str.equals("back")) {

                if (deque.isEmpty()) {
                    bw.write("-1" + "\n");
                } else {
                    bw.write(deque.getLast()+ "\n");
                }
            } else if (str.equals("pop_front")) {

                if (deque.isEmpty()) {
                    bw.write("-1" + "\n");
                } else {
                    bw.write(deque.pollFirst()+ "\n");
                }
            } else if (str.equals("pop_back")) {

                if (deque.isEmpty()) {
                    bw.write("-1" + "\n");
                } else {
                    bw.write(deque.pollLast()+ "\n");
                }
            } else if (str.equals("size")) {
                bw.write(deque.size()+ "\n");
            } else if (str.equals("empty")) {

                bw.write(deque.isEmpty() == true ? "1" + "\n" : "0" + "\n");
            }

        }

        bw.flush();
        bw.close();
    }
}
