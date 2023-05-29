package level2.phonelist;

import java.util.*;

public class PhoneList {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "135524421"};
        Solution s = new Solution();
        System.out.println(s.solution(phone_book));
    }
}

class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();
        String a = phone_book[0];
        // 2. 모든 전화번호를 HashMap에 넣는다.
        for (int i = 0; i < phone_book.length; i++)
            map.put(phone_book[i], i);
        // 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
        for (String s : phone_book)
            for (int j = 0; j < s.length(); j++)
                if (map.containsKey(s.substring(0, j)))
                    return false;

        return true;
          /* int cnt = 0;
        String a = phone_book[0];

        for (int i = 0; i < phone_book.length; i++) {
            if (Objects.equals(a, phone_book[i].substring(0, a.length()))) {
                cnt++;
                if (cnt == 2) {
                    return false;

                }
            }
        }
        return true;
   */
    }
}
