package level1.phone;

public class Phone {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.print(s.solution("01033715386"));
    }

}

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length()-4);
        return answer;

    }
}


