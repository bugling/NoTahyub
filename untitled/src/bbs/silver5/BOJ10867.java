package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> mySet = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            mySet.add(temp);
        }
        ArrayList<Integer> myList = new ArrayList<>(mySet);
        Collections.sort(myList);
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
    }
}
