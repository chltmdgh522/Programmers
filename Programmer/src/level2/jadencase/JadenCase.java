package level2.jadencase;

public class JadenCase {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println((s.solution("3for the last week ")));
    }
}
class Solution {
    public String solution(String s) {
        String answer="";
        String[] sp=s.split(" ");
        for(int i=0; i<sp.length; i++){
            answer+=sp[i].substring(0,1).toUpperCase();
            answer+=sp[i].substring(1).toLowerCase();
            answer+=" ";
        }
        if(s.substring(s.length()-1,s.length()).equals(" ")) return answer;
        return answer.substring(0,answer.length()-1);
    }
}