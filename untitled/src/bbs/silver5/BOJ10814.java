package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        List<Map> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Map<String, String> memberMap = new HashMap<>();
            String member = br.readLine();
            String[] memberInfo = member.split(" ");
            memberMap.put("age", memberInfo[0]);
            memberMap.put("name", memberInfo[1]);
            memberMap.put("index", String.valueOf(i));
            list.add(memberMap);
        }

        Collections.sort(list, new Comparator<Map>() {
            @Override
            public int compare(Map o1, Map o2) {
                if (o1.get("age").equals(o2.get("age"))) {
                    return Integer.parseInt(o1.get("index").toString()) - Integer.parseInt(o2.get("index").toString());
                }
                return Integer.parseInt(o1.get("age").toString()) - Integer.parseInt(o2.get("age").toString());
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).get("age") + " " + list.get(i).get("name"));
        }
    }
}
