package lotto;

import java.util.Arrays;
import java.util.Collections;

public class Lotto {
    public static void main(String[] args) {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        Solution s = new Solution();
        int[] answer=s.solution(lottos,win_nums);
        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i]);
        }
    }
}

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] lottoEx = new int[6];
        int[] answer = new int[2];
        int min = 0;
        int max=0;
        for (int i = 0; i < win_nums.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[j] == win_nums[i]) {
                    lottoEx[i] += lottos[j];
                    min++;
                }
            }
        }
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0){
                max++;
            }
        }
        max+=min;
        //Arrays.sort(lottoEx);

        switch(max){
            case 6:
                answer[0]=1;
                break;
            case 5:
                answer[0]=2;
                break;
            case 4:
                answer[0]=3;
                break;
            case 3:
                answer[0]=4;
                break;
            case 2:
                answer[0]=5;
                break;
            case 1,0:
                answer[0]=6;
                break;
        }
        switch(min){
            case 6:
                answer[1]=1;
                break;
            case 5:
                answer[1]=2;
                break;
            case 4:
                answer[1]=3;
                break;
            case 3:
                answer[1]=4;
                break;
            case 2:
                answer[1]=5;
                break;
            case 1,0:
                answer[1]=6;
                break;
        }


        return answer;
    }
}
