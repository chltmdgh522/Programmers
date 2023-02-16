package nonum;

import java.util.Queue;
import java.util.Stack;

public class NoNum {
    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};
        Solution s = new Solution();
        int[] answer;
        answer = s.solution(arr);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> s = new Stack();
        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
            if (i != 0) {
                if (arr[i] == arr[i - 1]) {
                    s.pop();
                }
            }
        }

        int[] answer= new int[s.size()];
        for(int i=answer.length-1; i>=0; i--){
            answer[i]=s.peek();
            s.pop();
        }
        return answer;
    }
}