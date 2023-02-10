package marathon;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Marathon {
    public static void main(String[] args) {
        String[] participant = {"choi", "kim", "kim"};
        String[] completion = {"kim", "choi"};
        Solution2 s = new Solution2();
        System.out.println(s.solution(participant, completion));
    }
}

class Solution2 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hs = new HashMap<>();
        for (String a : participant) {
            hs.put(a, hs.getOrDefault(a, 0) + 1);
        }

        for (String c : completion) {
            if (!hs.containsKey(c)) {
                return c;
            }
            int value = hs.get(c);
            hs.replace(c, value - 1);
        }
        for (String key : hs.keySet()) {
            if (hs.get(key) > 0) {
                return key;
            }
        }


        return answer;
    }
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hashMap1 = new HashMap<>();
        Map<String, Integer> hashMap2 = new HashMap<>();

        for (String a : participant) {
            hashMap1.put(a, hashMap1.getOrDefault(a, 0) + 1);
        }

        for (String b : completion) {
            hashMap2.put(b, hashMap2.getOrDefault(b, 0) + 1);
        }

        for (String key : hashMap1.keySet())
            if (!hashMap2.containsKey(key)) {
                answer = key;
                break;

            } else if (hashMap2.containsKey(key)) {

                for (String key2 : hashMap2.keySet()) {
                    if (Objects.equals(key, key2)) {

                        if (hashMap1.get(key) != hashMap2.get(key2)) {
                            answer = key;
                            break;
                        }
                    }
                }
            }
        return answer;
    }
}
