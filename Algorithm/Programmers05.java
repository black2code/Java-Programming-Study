package Algorithm;

import java.util.Arrays;

public class Programmers05 {
    public static int[] solution(int n, int m) {
        int[] answer = new int [2];

        int multiply = m*n;

        if(m%n == 0) {
            answer[0] = n;
        }else if(n <= 1){
            answer[0] = n;
        }else{
            while(m%n>0){
                int temp = n;
                n = m%n;
                m = temp;
            }
            answer[0] = n;
        }
        answer[1] = multiply / answer[0];
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2,5)));
    }
}
