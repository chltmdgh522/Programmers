package newid;

public class NewId {
    public static void main(String[] args) {
        String new_id = "123_.def";
        Solution s = new Solution();
        System.out.println(s.solution(new_id));
    }
}

class Solution {
    public String solution(String new_id) {
        String answer = "";
        Solution s1 = new Solution();
        new_id = new_id.toLowerCase();
        new_id = s1.twoSolution(new_id);
        new_id = s1.threeFourSolution(new_id);
        new_id = s1.fiveSolution(new_id);
        new_id = s1.sixSolution(new_id);
        new_id = s1.finalSolution(new_id);
        return new_id;
    }

    String twoSolution(String new_id) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < new_id.length(); i++) {
            char a = new_id.charAt(i);
            if (a == '-' || a == '_' || a == '.' || a >= 48 && a <= 57 || a >= 97 && a <= 122) {
                answer.append(a);
            }
        }
        return answer.toString();
    }

    String threeFourSolution(String new_id) {
        while (new_id.contains("..")) {
            new_id = new_id.replace("..", ".");
        }

        if (new_id.length() > 0) {
            if (new_id.charAt(0) == '.') {
                new_id = new_id.substring(1);
            }
        }

        if (new_id.length() > 0) {
            if (new_id.charAt(new_id.length() - 1) == '.') {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }

        return new_id;
    }

    String fiveSolution(String new_id) {
        if (new_id.equals("")) {
            new_id = "a";
        }
        return new_id;
    }

    String sixSolution(String new_id) {

        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            for (int i = 0; i < new_id.length(); i++) {
                if (new_id.charAt(new_id.length() - 1) == '.') {
                    new_id = new_id.substring(0, new_id.length() - 1);
                }
            }
        }
        return new_id;
    }

    String finalSolution(String new_id) {
        if (new_id.length() <= 2) {
            StringBuilder new_idBuilder = new StringBuilder(new_id);
            while (new_idBuilder.length() < 3) {
                new_idBuilder.append(new_idBuilder.charAt(new_idBuilder.length() - 1));
            }
            new_id = new_idBuilder.toString();
        }
        return new_id;
    }


}
