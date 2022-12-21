package Algorithm;

import java.util.Scanner;

public class daily22 {

    public static int[] solution(String s, char t) {
//        char[] arr = s.toCharArray();
        int [] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                p = 0;
                answer[i] = p;
            }
            else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);
        for (int n : solution(s,t)) {
            System.out.print(n + " ");
        }
    }
}
// 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력
// teachermode e          1 0 1 2 1 0 1 2 2 1 0
