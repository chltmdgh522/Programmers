package level1.minrectangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinRectangle {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        Solution s = new Solution();
        System.out.println(s.solution(sizes));
    }
}


class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int num = 0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < sizes.length; i++) {
            list1.add(sizes[i][0]);
            list2.add(sizes[i][1]);
        }
        list1.sort(Comparator.reverseOrder());
        list2.sort(Comparator.reverseOrder());
        if (list1.get(0) > list2.get(0)) {

        }
        System.out.println(list1.get(0));
        return answer;
    }
}