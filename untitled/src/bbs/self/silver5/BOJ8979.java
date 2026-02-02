package bbs.self.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ8979 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int totalCountryCount = Integer.parseInt(st.nextToken());
        int targetCountryNumber = Integer.parseInt(st.nextToken());

        List<Country> list = new ArrayList<>();
        for (int i = 0; i < totalCountryCount; i++) {
            st = new StringTokenizer(br.readLine());
            int countryNumber = Integer.parseInt(st.nextToken());
            int goldCount = Integer.parseInt(st.nextToken());
            int silverCount = Integer.parseInt(st.nextToken());
            int bronzeCount = Integer.parseInt(st.nextToken());
            list.add(new Country(countryNumber, goldCount, silverCount, bronzeCount));
        }

        Collections.sort(list, new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                if (o2.goldCount != o1.goldCount) {
                    return o2.goldCount - o1.goldCount;
                } else {
                    if (o2.silverCount != o1.silverCount) {
                        return o2.silverCount - o1.silverCount;
                    } else {
                        return o2.bronzeCount - o1.bronzeCount;
                    }
                }
            }
        });

        Country prevCountry = list.get(0);

        if (targetCountryNumber == prevCountry.number) {
            System.out.println(1);
            return;
        }

        for (int i = 1; i < list.size(); i++) {
            Country currentCountry = list.get(i);

            if (prevCountry.goldCount == currentCountry.goldCount &&
                    prevCountry.silverCount == currentCountry.silverCount &&
                    prevCountry.bronzeCount == currentCountry.bronzeCount) {
                // 동점이면 이전 국가의 등수와 동일
                currentCountry.rank = prevCountry.rank;
            }else {
                // 동점이 아니면 index + 1 -> 등수
                currentCountry.rank = i + 1;
            }

            prevCountry = currentCountry;

            if (targetCountryNumber == currentCountry.number) {
                System.out.println(currentCountry.rank);
                return;
            }
        }

    }

    static class Country {
        int number;
        int goldCount;
        int silverCount;
        int bronzeCount;
        int rank;

        public Country(int number, int goldCount, int silverCount, int bronzeCount) {
            this.number = number;
            this.goldCount = goldCount;
            this.silverCount = silverCount;
            this.bronzeCount = bronzeCount;
        }
    }
}
