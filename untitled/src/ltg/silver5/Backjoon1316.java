package ltg.silver5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 그룹 단어 체커
 * @문제
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,
 * kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 *
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 *
 * @입력
 * 첫째 줄에 단어의 개수 N이 들어온다.
 * N은 100보다 작거나 같은 자연수이다.
 * 둘째 줄부터 N개의 줄에 단어가 들어온다.
 * 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
 *
 * @출력
 * 첫째 줄에 그룹 단어의 개수를 출력한다.
 *
 * @예제
 * 예제 입력 1
 * 3
 * happy
 * new
 * year
 * 예제 출력 1
 * 3
 * 예제 입력 2
 * 4
 * aba
 * abab
 * abcabc
 * a
 * 예제 출력 2
 * 1
 * 예제 입력 3
 * 5
 * ab
 * aa
 * aca
 * ba
 * bb
 * 예제 출력 3
 * 4
 * 예제 입력 4
 * 2
 * yzyzy
 * zyzyz
 * 예제 출력 4
 * 0
 * 예제 입력 5
 * 1
 * z
 * 예제 출력 5
 * 1
 * 예제 입력 6
 * 9
 * aaa
 * aaazbz
 * babb
 * aazz
 * azbz
 * aabbaa
 * abacc
 * aba
 * zzaz
 * 예제 출력 6
 * 2
 * */
public class Backjoon1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 첫째 줄에는 단어의 개수
        int wordCnt = sc.nextInt();

        int out = 0;

        // 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N
        for(int i = 0; i < wordCnt; i++) {
            Boolean groupWord = false;
            String word = sc.next();

            // 문자열이 연속되어야 한다.

            // 1번 나온 문자열이
            // array에 단어를 넣는다.
            // 시작을 제외하고 앞의 단어와 다음단어가 다를 경우 array에 단어를 넣는다.
            // array에 넣을 단어가 있을 겨웅 groupWord는 false;
            // 없을 경우 groupWord는 true;
            ArrayList<Character> groupWordCheckArr = new ArrayList<Character>();
            for(int j = 0; j < word.length(); j++) {
                if(j == word.length() - 1) {
                    groupWord = true;
                }
                if(j == 0) {
                    groupWordCheckArr.add(word.charAt(j));
                } else {
                    if(word.charAt(j - 1) == word.charAt(j)) {
                        continue;
                    } else {
                        if(groupWordCheckArr.contains(word.charAt(j))) {
                            groupWord = false;
                            break;
                        }
                        groupWordCheckArr.add(word.charAt(j));
                    }
                }

            }

            // 확인한 문자열이 그룹단어이면 out++
            if(groupWord) {
                out++;
            }
        }

        System.out.println(out);

    }
}
