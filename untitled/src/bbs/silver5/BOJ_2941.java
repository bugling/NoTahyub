package bbs.silver5;

import java.util.Scanner;

public class BOJ_2941 {
    public static void main(String[] args) {
        String check1 = "dz=";
        String[] check2 = {"c=", "c-", "d-", "lj", "nj", "s=", "z="};
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int count = 0;

        for (int i = 0; i < text.length()-1;) {
            if (i < text.length() - 2 && check1.equals(text.substring(i, i + 3))) {
                count += 2;
                i += 3;
            } else {
                boolean match = false;
                String now = text.substring(i, i + 2);
                for (int j = 0; j < check2.length; j++) {
                    if(check2[j].equals(now)) {
                        count++;
                        i += 2;
                        match = true;
                        break;
                    }
                }

                if (!match) {
                    i++;
                }
            }
        }

        System.out.println(text.length() - count);
    }
}
