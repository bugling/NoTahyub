package bbs.self;

public class BOJ_4673 {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];

        for (int i = 1; i <= 10000; i++) {
            int s = i;
            int temp = i;
            while (temp > 0) {
                s += temp % 10;
                temp = temp / 10;
            }

            if (s <= 10000) {
                check[s] = true;
            }
        }

        for (int i=1; i<=10000; i++) {
            if (!check[i]) System.out.println(i);
        }
    }
}
