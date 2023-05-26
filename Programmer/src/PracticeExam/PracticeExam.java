package PracticeExam;

import java.util.*;

public class PracticeExam {
    public static void main(String[] args) {

        int[] answers = {1, 2, 3, 4, 5};

        Solution s = new Solution();

        int[] answer;
        answer = s.solution(answers);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }


}

class Solution {
    public int[] solution(int[] answers) {
        int[][] suPoJa_answer = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < suPoJa_answer.length; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (suPoJa_answer[i][j] == answers[j]) {
                    cnt++;
                }
            }
            hashMap.put(i + 1, cnt);
            cnt = 0;
        }
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() != 0) {
                sortedEntries.add(entry);
            }
        }
        Collections.sort(sortedEntries, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (Map.Entry<Integer, Integer> entry : sortedEntries) {
            list.add(entry.getKey());
        }


      /*  for (int i = 0; i < suPoJa_answer.length; i++) {
            if(hashMap.get(i+1)!=0){
                list.add(i+1);
            }
        }
*/
        int[] suPoJa = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            suPoJa[i] = list.get(i);
        }


        return suPoJa;
        /*
        * public int[] solution(int[] answers) {
        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        HashMap<Integer, Integer> count = new HashMap<>();

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == answer1[i%5]) {
                count.put(1, count.getOrDefault(1, 0)+1);
            }

            if(answers[i] == answer2[i%8]) {
                count.put(2, count.getOrDefault(2, 0)+1);
            }

            if(answers[i] == answer3[i%10]) {
                count.put(3, count.getOrDefault(3, 0)+1);
            }
        }

        List<Integer> list = new ArrayList<>(count.keySet());
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return count.get(o2).compareTo(count.get(o1));
            }
        });

        int maxScore = count.get(list.get(0));

        list.removeIf(key -> maxScore != count.get(key));

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }*/
    }
}
