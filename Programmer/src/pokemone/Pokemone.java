package pokemone;

import java.util.HashSet;
import java.util.Set;

public class Pokemone {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 2};
        Solution s = new Solution();

        System.out.println(s.solution(nums));
    }
}

class Solution {
    public int solution(int[] nums) {

        Set<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            hashSet.add(num);
        }
        int size = nums.length / 2;

        return Math.min(size, hashSet.size());
    }
}
