package Algorithm;

public class Programmers07 {
    public static String solution(int num) {
        String answer = "Even";

        if(num == 0){
            return answer;
        }else if(num %2 == 0){
            return answer;
        }else{
            return "Odd";
        }
    }
    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
