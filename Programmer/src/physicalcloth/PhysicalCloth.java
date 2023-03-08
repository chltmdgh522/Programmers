package physicalcloth;

import java.util.ArrayList;
import java.util.List;

public class PhysicalCloth {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};
        Solution s = new Solution();
        System.out.println(s.solution(n, lost, reserve));
    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> list = new ArrayList<>();
        for (int k = 0; k < lost.length; k++) {
            list.add(lost[k]);
        }

        int answer = 0;
        for (int i = 0; i < reserve.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (reserve[i] + 1 == list.get(j)) {
                    answer++;
                    list.remove(j);
                    break;
                } else if (reserve[i] - 1 == list.get(j)) {
                    answer++;
                    list.remove(j);
                    break;
                }
            }
        }
        answer += reserve.length;

        return answer;

    }
}