package Algorithm;

import java.util.Scanner;

public class daily20 {

    public static String solution(String str) {
        String answer = "YES";
        String original = "";
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            if (Character.isAlphabetic(str.charAt(i)))
                reverse += str.charAt(i);
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i)))
                original += str.charAt(i);
        }
        if (original.equalsIgnoreCase(reverse)) return answer;
        else return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
//단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
// found7, time: study; Yduts; emit, 7Dnuof     YES
