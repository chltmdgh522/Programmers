import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        map.put(1,0);
        map.put(2,0);
        map.put(3,0);

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == a[i%a.length]) map.put(1, map.get(1)+1);
            if(answers[i] == b[i%b.length]) map.put(2, map.get(2)+1);
            if(answers[i] == c[i%c.length]) map.put(3, map.get(3)+1);
        }

        System.out.println(map.get(2));
    }
}
