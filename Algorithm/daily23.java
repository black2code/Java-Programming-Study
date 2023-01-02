package Algorithm;

import java.util.Scanner;

public class daily23 {

    public static String solution(String s) {
        String answer = "";
        s += " ";
        int count = 1;

        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                count++;
            }
            else {
                answer += s.charAt(i);
                if (count > 1) answer += count;
                count = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }
}

// KKHSSSSSSSE          K2HS7E
