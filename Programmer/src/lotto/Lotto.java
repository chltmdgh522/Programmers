package lotto;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int[] lottos = {1, 2, 0, 4, 5, 0};
        int[] win_nums = {11, 4, 7, 8, 2, 10};
        Solution s = new Solution();
        System.out.println(s.solution(lottos, win_nums));
    }
}

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] lottoEx = new int[6];
        int[] answer={};
        int cnt = 0;
        for (int i = 0; i < win_nums.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[j] == win_nums[i]) {
                    lottoEx[i] += lottos[j];
                    cnt++;
                }
            }
        }
        Arrays.stream(lottoEx).sorted();
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                for(int j=0; j<lottoEx.length; j++){
                    for(int k=0; k<win_nums.length; k++){
                        if(lottoEx[j]!=win_nums[k]){
                            lottos[i]=win_nums[k];
                            break;
                        }

                    }
                }
            }
        }
        for(int i=0; i<lottos.length; i++){
            System.out.println(lottos[i]);
        }
        return answer;
    }
}
