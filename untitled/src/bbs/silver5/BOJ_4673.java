package bbs.silver5;

public class BOJ_4673 {
    public static void main(String[] args) {
        boolean check[] = new boolean[10001];
        for (int i = 1; i < 10000; i++) {
            int s = i;
            int temp = s;
            while (temp > 0) {
                s += temp % 10;
                temp = temp / 10;
            }
//            char[] temp = String.valueOf(i).toCharArray();
//            for (int j = 0; j < temp.length; j++) {
//                s += Integer.parseInt(String.valueOf(temp[j]));
//            }

            if (s <= 10000) {
                check[s] = true;
            }
        }

        for (int i = 1; i <= 10000; i++) {
            if (!check[i]) System.out.println(i);
        }
    }
}
