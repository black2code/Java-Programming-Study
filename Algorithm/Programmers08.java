package Algorithm;

public class Programmers08 {
    public static long solution(long n) {

        if(Math.sqrt(n)%1 < 1 && Math.sqrt(n)%1 !=0){
            return -1;
        }
        double result = Math.sqrt(n)+1;
        long answer = (long)Math.pow(result, 2);
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(121));
    }
}
