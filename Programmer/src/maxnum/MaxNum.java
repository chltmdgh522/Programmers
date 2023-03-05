package maxnum;

import java.util.*;

public class MaxNum {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        Solution s = new Solution();
        System.out.println(s.solution(numbers));

    }
}

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] num = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            num[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(num, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        if (num[0].equals("0"))
            return "0";
        for (String s : num) {
            answer += s;
        }
        return answer;
    }
}
