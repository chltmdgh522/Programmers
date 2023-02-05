package spy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SPY {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        Solution s = new Solution();
        System.out.println(s.solution(clothes));

    }
}

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> hashMap = new HashMap<>();
        for (String[] s : clothes) {
            String type = s[1];
            hashMap.put(type, hashMap.getOrDefault(type, 0) + 1);
        }


        System.out.println(hashMap);
        return answer;
    }
}