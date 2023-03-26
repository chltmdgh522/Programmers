package truck;

import java.util.*;

public class Truck {
    public static void main(String[] args) {
        int bridge_length=2;
        int weight=10;
        int[] truck_weights={7,4,5,6};
        Solution s= new Solution();
        System.out.println(s.solution(bridge_length,weight,truck_weights));
    }
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue= new LinkedList<>();

        for(int i=0; i< truck_weights.length; i++) {
            if (queue.size() < bridge_length) {
                queue.add(truck_weights[i]);
            }
        }

        return answer;
    }
}