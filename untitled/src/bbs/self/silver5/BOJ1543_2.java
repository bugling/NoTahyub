package bbs.self.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1543_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String document = br.readLine();
        String word = br.readLine();

        int count = 0;
        int index = 0;
        while (index < document.length() - word.length()) {
            if (document.startsWith(word, index)) {
                count++;
                index = index + word.length();
            } else {
                index++;
            }
        }

        System.out.println(count);
    }
}
