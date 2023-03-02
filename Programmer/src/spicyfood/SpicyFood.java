package spicyfood;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Stream;

public class SpicyFood {
    public static void main(String[] args) {
        int[] scoville = {1, 2};
        int k = 7;
        Solution s = new Solution();
        System.out.println(s.solution(scoville, k));
    }

}

class Solution {
    public int solution(int[] scoville, int k) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }
        while (queue.peek() < k) {
            if (queue.size() == 1) { // -나오게 할려고 
                return -1;
            }
            queue.add(queue.poll() + queue.poll() * 2);
            answer++;
        }

        return answer;
    }
}









/*int answer = 0;
        int i = 0;
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < scoville.length; j++) {
            list.add(scoville[j]);
        }
        while(true){
        Collections.sort(list);
            if(list.get(0)>=k){
                break;
            }
        i = (int) list.get(0) + (int) list.get(1) * 2;
        list.remove(0);
        list.remove(0);
        list.add(i);
        answer++;
        }
        System.out.println(list);
        return answer;
        */