public class PlusMinusSum {

    public static void main(String[] args) {
        PlusMinusSum pm = new PlusMinusSum();
        int[] absolutes = {1, 2, 3};
        boolean[] signs = {true, false, true};
        System.out.println(pm.solution(absolutes, signs));

    }

    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                sum += absolutes[i];
            } else {
                sum -= absolutes[i];
            }

        }
        return sum;
    }
}
