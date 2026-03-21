package bbs.self.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> sellMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String bookName = br.readLine();
            sellMap.put(bookName, sellMap.get(bookName) == null ? 1 : sellMap.get(bookName) + 1);
        }

        String bestSeller = sellMap.entrySet().stream().sorted((o1, o2) -> {
            if (!o1.getValue().equals(o2.getValue())) {
                return o2.getValue() - o1.getValue();
            }
            return o1.getKey().compareTo(o2.getKey());
        }).findFirst().get().getKey();

        System.out.println(bestSeller);
    }
}
