package bbs.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ25206 {
    public static void main(String[] args) throws IOException {
        Map<String, Double> subjectMap = new HashMap<>();
        subjectMap.put("A+", 4.5);
        subjectMap.put("A0", 4.0);
        subjectMap.put("B+", 3.5);
        subjectMap.put("B0", 3.0);
        subjectMap.put("C+", 2.5);
        subjectMap.put("C0", 2.0);
        subjectMap.put("D+", 1.5);
        subjectMap.put("D0", 1.0);
        subjectMap.put("F", 0.0);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        Double totalGradePoint = 0.0;
        Double sum = 0.0;
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            Double point = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if (!"P".equals(grade)){
                Double gradePoint = subjectMap.get(grade);
                totalGradePoint += gradePoint * point;
                sum += point;
            }
        }

        System.out.println(totalGradePoint / sum);
    }
}
