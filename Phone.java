public class Phone {
    public static void main(String[] args) {
        Phone pt = new Phone();
        System.out.print(pt.solution("01033715386"));
    }
    public String solution(String phoneNumber){
        String answer="";
        for(int i=0; i<phoneNumber.length()-4; i++ ){
            answer+="*";
        }
        answer+=phoneNumber.substring(7);
        return answer;

    }
}

