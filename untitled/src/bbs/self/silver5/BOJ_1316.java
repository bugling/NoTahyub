package bbs.self.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i=0; i<N; i++) {
            char[] check = new char[26];
            char[] text = br.readLine().toCharArray();

            char before = text[0];
            check[(int) (before - 'a')] = 1;
            for (int j=1; j<text.length; j++) {
                char now = text[j];
                boolean group = true;
                // 바로 직전에 나온 단어 말고 그 전에 나온 단어와 같으면 그룹이 아님
                if (before != now && check[(int)(now-'a')] == 1) {
                    group = false;
                    break;
                }
                check[(int)(now-'a')] = 1;
                before = now;

                if (group) count++;
            }
        }

        System.out.println(count);
    }
}
