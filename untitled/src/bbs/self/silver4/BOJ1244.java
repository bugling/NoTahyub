package bbs.self.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int switchCnt = Integer.parseInt(br.readLine());
        int[] switches = new int[switchCnt+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= switchCnt; i++) {
            switches[i] = Integer.parseInt(st.nextToken());
        }

        int studentCnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < studentCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());

            if (s == 1) {   // 남자
                for (int j = 1; j <= switchCnt; j++) {
                    if (j % index == 0) {
                        if (switches[j] == 0) switches[j] = 1;
                        else switches[j] = 0;
                    }
                }
            } else {        // 여자

                int left = index, right = index;

                while (left-1 >= 1 && right+1 <= switchCnt && switches[left-1] == switches[right+1]) {
                    left--;
                    right++;
                }

                for (int j = left; j <= right; j++) {
                    if (switches[j] == 0) switches[j] = 1;
                    else switches[j] = 0;
                }
            }
        }

        for (int i = 1; i <= switchCnt; i++) {
            System.out.print(switches[i] + " ");
            if (i % 20 == 0) System.out.println();
        }
    }
}
