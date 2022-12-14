package Algorithm;

import java.util.Scanner;

public class daily19 {

    public static String solution(String str) {
        String answer = "YES";
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverse)) return answer;
        else return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}

// gooG YES