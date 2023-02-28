package spicyfood;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class SpicyFood {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 10;
        Solution s = new Solution();
        System.out.println(s.solution(scoville, k));
    }

}

class Solution {
    public int solution(int[] scoville, int k) {
        int answer=0;
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