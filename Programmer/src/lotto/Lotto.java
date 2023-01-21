package lotto;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        Solution s = new Solution();
        System.out.println(s.solution(lottos, win_nums));
    }
}

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] lottoEx = new int[6];
        int[] answer = {};
        int cnt = 0;
        int cnte=0;
        for (int i = 0; i < win_nums.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[j] == win_nums[i]) {
                    lottoEx[i] += lottos[j];
                    cnt++;
                }
            }
        }
        Arrays.stream(lottoEx).sorted();
        for (int i = 0; i < win_nums.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[j] == 0) {
                    if (win_nums[i] != lottoEx[j]) {
                        lottos[j] = win_nums[j];
                        cnte++;
                    }
                }
            }
        }
        cnte+=cnt;
        for (int i = 0; i < lottos.length; i++) {
            System.out.println(lottos[i]);
        }

        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }

        switch(cnt){
            case 6: answer[0]=1;
            case 5: answer[0]=2;
            case 4: answer[0]=3;
            case 3: answer[0]=4;
            case 2: answer[0]=5;
            case 1: answer[0]=6;
            case 0: answer[0]=6;
        }
        switch(cnte){
            case 6: answer[1]=1;
            case 5: answer[1]=2;
            case 4: answer[1]=3;
            case 3: answer[1]=4;
            case 2: answer[1]=5;
            case 1: answer[1]=6;
            case 0: answer[1]=6;
        }

        return answer;
    }
}
