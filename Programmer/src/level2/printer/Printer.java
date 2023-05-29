package level2.printer;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
    public static void main(String[] args) {
        int[] priorities = {2, 3, 2, 4, 1, 5};
        int location = 2;
        Solution s = new Solution();
        System.out.println(s.solution(priorities, location));

    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }

        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {
                    if (i == location) {
                        answer++;
                        return answer;
                    }
                    pq.poll();
                    answer++;
                }
            }
        }
        return answer;
    }
}
