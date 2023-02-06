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
        int answer = 1;
        Map<String, Integer> hashMap = new HashMap<>();
        for (String[] s : clothes) {
            String cloth = s[1];
            hashMap.put(s[1], hashMap.getOrDefault(s[1], 0) + 1);
        }

        Iterator<Integer> ir = hashMap.values().iterator();
        while (ir.hasNext()) {
            answer *= ir.next().intValue() + 1;
        }


        return answer - 1;
    }
}