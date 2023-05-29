package level2.truck;

import java.util.*;

public class Truck {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        Solution s = new Solution();
        System.out.println(s.solution(bridge_length, weight, truck_weights));
    }
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridge = new LinkedList<>();
        int index = 0;
        int currentWeight=0;
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        while (index<truck_weights.length) {

            currentWeight -= bridge.poll();
            answer++;
            if (currentWeight + truck_weights[index] <= weight) {
                bridge.offer(truck_weights[index]);
                currentWeight += truck_weights[index];
                index++;
            } else {
                bridge.offer(0);
            }
        }
        return answer+bridge_length;
    }
}