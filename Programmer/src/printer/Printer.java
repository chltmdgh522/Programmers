package printer;

import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 3};
        int location = 3;
        Solution s = new Solution();
        System.out.println(s.solution(priorities, location));

    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int num = priorities[location];
        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }
        while (true) {
            answer++;
            if (num == pq.poll()) {
                break;
            }
        }
        return answer;
    }
}
