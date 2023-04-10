package PracticeExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeExam {
    public static void main(String[] args) {

        int[] answers = {1, 2, 3, 4, 5};

        Solution s = new Solution();
        System.out.println(s.solution(answers));
    }


}

class Solution {
    public int solution(int[] answers) {
        //문제점 학생크기
        //배열넘기기
        //학생 답과 정답 비교
        int cnt = 0;
        int[] m1 = {1, 2, 3, 4, 5};
        int[] m2 = {1, 2, 3, 4, 5};
        int[] m3 = {3, 3, 1, 1, 2};
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < answers.length; i++) {
                if (answers[i] == m1[i]) {
                    cnt++;
                }
            }
            list.add(cnt);
            cnt = 0;
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        answer.add(list.get(0));
        for (int i = 0; i < 2; i++) {
            if (list.get(i) == list.get(i + 1)) {
                answer.add(list.get(i + 1));
            }
        }
        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
        return 0;
    }
}
