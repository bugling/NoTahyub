package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ori = br.readLine().toCharArray();
        char[] m = br.readLine().toCharArray();
        int cnt = 0;
        int index = 0;      // 내부를 탐색하는 인덱스(ori와 m의 각 요소 비교를 위한 ori 내부의 인덱스)
        // i: ori 내에서 m과 비교하는 시작 인덱스
        for (int i = 0; i < ori.length && index < ori.length;) {
            index = i;        // 내부에 같은 문자열이 있는지 비교할 때 쓰는 index
            boolean match = true;

            for (int j = 0; j < m.length;) {        // 현재 위치에서 시작해서 단어가 매칭되는지
                if (ori[index] != m[j]) {     // 같은 문자열이 아닌 경우
                    i++;
                    j = 0;
                    match = false;
                    break;
                } else {
                    index++;
                    j++;
                }

                // 탐색 범위를 넘어서면 탐색 종료하고 match = false처리함
                if (index == ori.length) {
                    match = false;
                    break;
                }
            }

            if (match) {
                cnt++;
                i = index;
            }
        }
        System.out.println(cnt);
    }
}