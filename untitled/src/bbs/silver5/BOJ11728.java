package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int lenA = Integer.parseInt(st.nextToken());
        int lenB = Integer.parseInt(st.nextToken());

        int[] A = new int[lenA];
        int[] B = new int[lenB];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < lenA; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < lenB; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int indexA = 0, indexB = 0;

        StringBuilder sb = new StringBuilder();
        while(indexA < lenA || indexB < lenB) {

            if (indexA > lenA-1){
                sb.append(B[indexB++] + " ");
                continue;
            }else if (indexB > lenB-1) {
                sb.append(A[indexA++] + " ");
                continue;
            }

            if (A[indexA] < B[indexB]) {
                sb.append(A[indexA++] + " ");
            }else {
                sb.append(B[indexB++] + " ");
            }
        }

        System.out.println(sb.toString());

    }
}
