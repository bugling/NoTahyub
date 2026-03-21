package bbs.self.silver4;

import java.util.*;

public class BOJ11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String temp = str.substring(i, str.length());
            list.add(temp);
        }

        Collections.sort(list);

        for (String word : list) {
            System.out.println(word);
        }
    }
}
