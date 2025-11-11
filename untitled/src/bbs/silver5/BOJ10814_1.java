package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ10814_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        List<Member> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            String[] memberInfo = br.readLine().split(" ");
            list.add(new Member(i, memberInfo[1], Integer.parseInt(memberInfo[0])));
        }

        list.sort((a, b) -> {
            if (a.getAge() == b.getAge()) {
                return a.getIndex() - b.getIndex();
            }
            return a.getAge() - b.getAge();
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getAge() + " " + list.get(i).getName());
        }

    }

    static class Member {
        private int index;
        private String name;
        private int age;

        public Member(int index, String name, int age) {
            this.index = index;
            this.name = name;
            this.age = age;
        }

        public int getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
