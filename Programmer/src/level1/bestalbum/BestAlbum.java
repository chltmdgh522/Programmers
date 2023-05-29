package level1.bestalbum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BestAlbum {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        Solution s = new Solution();
        int[] answer = s.solution(genres, plays);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            hashMap.put(genres[i], hashMap.getOrDefault(genres[i], 0) + plays[i]);
        }
        ArrayList<String> genre = new ArrayList<>();
        for (String key : hashMap.keySet()) {
            genre.add(key);
        }


        System.out.println(genre);

        return answer;
    }
}