package bracket;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bracket {
    public static void main(String[] args) {
        String s = "((((((()";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));

    }
}
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int a=0,b=0;
        Queue<String> queue=new LinkedList<>();
        for(int i=0; i<s.length(); i++){
            queue.add(s.substring(i,i+1));
            if(queue.remove().equals("(")){
                a++;
            } else{
                b++;
                if(a==0){
                    break;
                }
            }
        }
        if(a==b){
            answer=true;
        }

        return answer;
    }
}
