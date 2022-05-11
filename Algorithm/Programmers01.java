package Algorithm;

/*  입력     출력
    x	n	answer
    2	5	[2,4,6,8,10]
    4	3	[4,8,12]
-   4	2	[-4, -8]
 */

import java.util.Arrays;

public class Programmers01 {

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;

        for (int i = 1; i < n; i++) {
            answer[i] = answer[i-1]+x;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(-4,2)));
    }
}
