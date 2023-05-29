package level1.physicalcloth;

import java.util.ArrayList;
import java.util.List;

public class PhysicalCloth {
    public static void main(String[] args) {
        int n = 7;
        int[] lost = {1, 2, 3, 4, 5,7};
        int[] reserve = {2, 3, 4,5};
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
                if (reserve[i] + 1 == list.get(j) || reserve[i] - 1 == list.get(j)) {
                    answer++;
                    list.remove(j);
                    break;
                }
            }
        }

        answer += n - lost.length;
        return answer;

    }
}
/*

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class PhysicalCloth {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1,3,5};
        Solution s = new Solution();
        System.out.println(s.solution(n, lost, reserve));
    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        // 빌려줄수 있는 학생의 번호
        ArrayList<Integer> reservelist = new ArrayList<>();
        ArrayList<Integer> lostlist = new ArrayList<>();

        int i = 0;
        while(reserve.length > i) {
            reservelist.add(reserve[i]);
            i++;
        }

        i = 0;
        while(lost.length > i) {
            lostlist.add(lost[i]);
            i++;
        }

        Collections.sort(lostlist);
        Collections.sort(reservelist);


         for(i = 0; i<reservelist.size(); i++) {
            loop: for(int j=0; j<lostlist.size(); j++) {
                if(reservelist.get(i) == lostlist.get(j)) {
                    lostlist.remove(j);
                    reservelist.remove(i);
                    i = -1;
                    answer ++;
                    break loop;
                }
            }
        }

        for(i=0; i<lostlist.size(); i++) {

            loop: for(int j=0; j<reservelist.size(); j++) {

                int k = -1;
                while(k<=1) {
                    if(lostlist.get(i) == reservelist.get(j) + k) {
                        reservelist.remove(j);
                        lostlist.remove(i);
                        i = -1;
                        answer ++;

                        if(reservelist.size() == 0 || lostlist.size() == 0) {
                            return answer;
                        }
                        break loop;
                    }

                    k++;
                }
            }
        }


        return answer;
    }
}
 */