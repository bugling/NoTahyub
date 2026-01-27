package bbs.self;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1543_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] dictionary = br.readLine().toCharArray();
        char[] text = br.readLine().toCharArray();

        int index = 0;
        int cnt = 0;
        for (int i = 0; i < dictionary.length && index < dictionary.length;) {

            index = i;
            boolean matched = true;

            for (int j = 0; j < text.length;) {

                if (dictionary[index] != text[j]) {
                    j = 0;
                    i++;
                    matched = false;
                    break;
                } else {
                    j++;
                    index++;
                }

                // 내부 비교용 인덱스가 전체 범위 밖으로 넘어가면 text내부 반복문 종료(ArrayIndexOutOfBoundsException 방지)
                if (index == dictionary.length && j < text.length) {
                    matched = false;
                    break;
                }
            }

            if (matched == true) {
                cnt++;
                i = index;
            }
        }

        System.out.println(cnt);
    }
}
