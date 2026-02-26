package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();

        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String commend = st.nextToken();
            int num = 0;
            if (!"all".equals(commend) && !"empty".equals(commend)) {
                num = Integer.parseInt(st.nextToken());
            }


            switch (commend) {
                case "add":
                    set.add(num);
                    break;
                case "remove":
                    set.remove(num);
                    break;
                case "check":
                    sb.append(set.contains(num) == true ? 1 : 0).append("\n");
                    break;
                case "toggle":
                    if(set.contains(num)) {
                        set.remove(num);
                    }else {
                        set.add(num);
                    }
                    break;
                case "all":
                    set.clear();
                    for (int j = 1; j <= 20; j++) {
                        set.add(j);
                    }
                    break;
                case "empty":
                    set.clear();
                    break;
            }

        }

        System.out.println(sb);
    }
}
