package maxnum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxNum {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        Solution s= new Solution();
        System.out.println(s.solution(numbers));

    }
}

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<String> list=new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            list.add(String.valueOf(numbers[i]));
        }
        list.sort(Comparator.reverseOrder());

        System.out.println(list);

        return answer;
    }
}
