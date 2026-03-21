package bbs.self.silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> keepass = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String id = st.nextToken();
            String pw = st.nextToken();

            keepass.put(id, pw);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String id = br.readLine().trim();
            sb.append(keepass.get(id)).append("\n");
        }

        System.out.println(sb);

//        List<String>[] keepass = new ArrayList[26];
//        for (int i = 0; i < 26; i++) {
//            keepass[i] = new ArrayList<>();
//        }
//
//        for (int i = 0; i < N; i++) {
//            st = new StringTokenizer(br.readLine());
//            String id = st.nextToken();
//            String pw = st.nextToken();
//            char firstCharacter = id.toCharArray()[0];
//            keepass[(int)(firstCharacter - 'a')].add(id+"/"+pw);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < M; i++) {
//            String findId = br.readLine();
//            char firstCharacter = findId.toCharArray()[0];
//            List<String> list = keepass[(int)(firstCharacter - 'a')];
//            for (int j = 0; j < list.size(); j++) {
//                String idPw = list.get(j);
//                int index = idPw.indexOf("/");
//                String id = idPw.substring(0, index);
//                if (id.equals(findId)) {
//                    sb.append(idPw.substring(index+1));
//                    sb.append("\n");
//                }
//            }
//        }
//
//        System.out.println(sb);
    }
}
