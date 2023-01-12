package Algorithm;


import java.util.Scanner;

public class daily24 {

    public static String solution(int num, String s) {
        String answer = "";
        String binary1 = s.replaceAll("#", "1");
        String binary2 = binary1.replaceAll("\\*","0");

        for (int i = 0; i < num; i++) {
            answer += Character.toString((char)Integer.parseInt(binary2.substring(i*7,(i+1)*7),2));
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = sc.next();
        System.out.println(solution(num, s));
    }
}

/*
1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.

2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.

3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.

참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.
 */

// 4
//#****###**#####**#####**##**           COOL