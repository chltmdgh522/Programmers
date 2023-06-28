package level2.carpet;

public class Carpet {
    public static void main(String[] args) {
        Solution s= new Solution();
        int[] answer=s.solution(10,2);
        System.out.println(answer);
    }
}

class Solution {
    public int[] solution(int brown, int yellow) {
        int sum=brown+yellow;
        for(int i=0; i<sum; i++){
            int j=sum/i;

            if(sum%i==0 && j>2){
                
            }
        }

        int[] answer = {};
        return answer;
    }
}