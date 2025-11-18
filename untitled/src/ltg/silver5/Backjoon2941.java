package ltg.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * č	c=
 * ć	c-
 * dž	dz=
 * đ	d-
 * lj	lj
 * nj	nj
 * š	s=
 * ž	z=
 *
 * 위 목록에 없는 알파벳은 한 글자씩 센다.
 * 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
 *
 * c=, dz=, s=, z=
 * c- d-
 * lj nj
 * */
public class Backjoon2941 {
    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 빠른 출력
        StringBuilder sb = new StringBuilder();

        sb.append(br.readLine());

        String[] arr = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String s = new String(sb);

        for(int i = 0; i < arr.length; i++){
            s = s.replaceAll(arr[i], "a");
        }

        System.out.println(s.length());
    }
}
