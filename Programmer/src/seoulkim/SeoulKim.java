package seoulkim;

public class SeoulKim {
    public static void main(String[] args) {
        String[] seoul = {"ㅇ","Park", "Kim"};
        Solution st = new Solution();
        System.out.println(st.solution(seoul));
    }
}
class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다.";
            }
        }
        return answer;
    }
}