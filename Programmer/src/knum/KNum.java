package knum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class KNum {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Solution s = new Solution();
        int[] answer = new int[commands.length];
        answer = s.solution(array, commands);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < commands.length; i++) {
            for (int j = 0; j < 1; j++) {
                a = commands[i][j];
                b = commands[i][j + 1];
                c = commands[i][j + 2];

            }

            for (int k = a - 1; k < b; k++) {
                list.add(array[k]);
            }
            list.sort(Comparator.naturalOrder());
            answer[i] = list.get(c - 1);
            list.removeAll(list);
        }
        return answer;
    }
}