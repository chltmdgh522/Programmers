package level1.minrectangle;

import java.util.*;

public class MinRectangle {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        Solution s = new Solution();
        System.out.println(s.solution(sizes));
    }
}


class Solution {
    public int solution(int[][] sizes) {
        int Max_num = 0;
        int Min_num = 0;
        int h=0;
        int v=0;
        for (int i = 0; i < sizes.length; i++) {
            Max_num=Math.max(sizes[i][0],sizes[i][1]);
            Min_num=Math.min(sizes[i][0],sizes[i][1]);
            h=Math.max(Max_num,h);
            v=Math.max(Min_num,v);
        }
        return h*v;
    }
}