package level2.functionaldevelopment;

import java.util.*;

public class FunctionalDevelopment {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] answers;
        Solution s = new Solution();
        answers = s.solution(progresses, speeds);
        for (int i = 0; i < answers.length; i++) {
            System.out.println(answers[i]);
        }
    }

}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int num = 0;
        int a = 0;
        Queue<Integer> q = new LinkedList<>();

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < progresses.length; i++) {
            progresses[i] = 100 - progresses[i];
        }
        for (int i = 0; i < progresses.length; i++) {
            num = progresses[i] / speeds[i];
            if (progresses[i] % speeds[i] != 0) {
                num++;
            }
            q.add(num);
        }

        List<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) {
            a = q.remove();
            int c = 1;
            while (!q.isEmpty() && a >= q.peek()) {
                c++;
                q.remove();
            }
            list.add(c);

        }
        int[] answers = new int[list.size()];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = list.get(i);
        }

        return answers;
    }

}