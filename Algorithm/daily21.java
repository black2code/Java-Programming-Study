package Algorithm;

import java.util.Scanner;

public class daily21 {

    public static int solution(String str) {
        String answer = "";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) answer += arr[i];
        }
        Integer number = Integer.valueOf(answer);
        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
//문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
// g0en2T0s8eSoft           208
