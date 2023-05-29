package level1.collatzguess;

public class CollatzGuess {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.print(s.solution(2));
    }
}

class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        if (num == 1) {
            return answer;
        } else if (num != 1) {
            while (answer == 0) {
                cnt++;
                if (num % 2 == 0) {
                    num /= 2;
                } else if (num % 2 == 1) {
                    num = num * 3 + 1;
                }
                if (num == 1) {
                    answer = cnt;
                }

                if (cnt == 500) {
                    answer = -1;
                }
            }
        }
        return answer;


    }

}
