package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int totalNationCount = Integer.parseInt(st.nextToken());
        int targetNationNumber = Integer.parseInt(st.nextToken());

        List<Country> list = new ArrayList<>();
        for (int i = 0; i < totalNationCount; i++) {
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            int goldCount = Integer.parseInt(st.nextToken());
            int silverCount = Integer.parseInt(st.nextToken());
            int bronzCount = Integer.parseInt(st.nextToken());

            list.add(new Country(number, goldCount, silverCount, bronzCount));
        }

        Collections.sort(list, new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                if (o1.goldCount != o2.goldCount) {
                    return o2.goldCount - o1.goldCount;
                }else {
                    if (o1.silverCount != o2.silverCount) {
                        return o2.silverCount - o1.silverCount;
                    }else {
                        return o2.bronzCount - o1.bronzCount;
                    }
                }
            }
        });

        int currentRank = 1;            // 현재 위치 기준 등수 후보
        int prevRank = 1;               // 이전 국가의 등수
        Country prev = list.get(0);     // 이전 나라
        prev.rank = 1;

        // prev.number에 최초로 들어간 값 1이 target이면 1등 출력 후 로직 종료
        if (prev.number == targetNationNumber) {
            System.out.println(1);
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            Country cur = list.get(i);

            currentRank = i + 1;

            if (cur.goldCount == prev.goldCount
                    && cur.silverCount == prev.silverCount
                    && cur.bronzCount == prev.bronzCount) {
                cur.rank = prevRank;        // 금은동 개수가 모두 동일하면 이전 등수를 현재 등수로 셋팅함
            } else {
                cur.rank = currentRank;
                prevRank = currentRank;
                prev = cur;
            }

            if (cur.number == targetNationNumber) { 
                System.out.println(cur.rank);
                return;
            }

        }
    }

    static class Country {
        int number;
        int goldCount;
        int silverCount;
        int bronzCount;
        int rank;

        public Country(int number, int goldCount, int silverCount, int bronzCount) {
            this.number = number;
            this.goldCount = goldCount;
            this.silverCount = silverCount;
            this.bronzCount = bronzCount;
        }
    }
}
