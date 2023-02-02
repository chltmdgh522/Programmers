package pokemone;

import java.util.HashMap;
import java.util.HashSet;

public class Pokemone {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 2};
        Solution s = new Solution();

        System.out.println(s.solution(nums));
    }
}

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet hashSet = new HashSet<>();

        for (int num : nums) {
            hashSet.add(num);
        }
        int size = nums.length / 2;

        if (size <= hashSet.size()) {
            answer = size;
        } else if (size > hashSet.size()) {
            answer = hashSet.size();
        }
        return answer;
    }
}
