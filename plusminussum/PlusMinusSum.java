package plusminussum;

public class PlusMinusSum {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] absolutes = {1, 2, 3};
        boolean[] signs = {true, false, true};

        System.out.println(s.solution(absolutes, signs));

    }
}
class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }

        }
        return answer;

    }
}
