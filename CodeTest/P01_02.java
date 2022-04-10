package CodeTest;

/*
문제 설명
---
아스키 코드는 미국정보교환표준부호를 의미한다.

영어로 American Standard Code for Information Interchange 이며, 줄여서 ASCII 라고 한다.

문자를 사용하는 대부분의 장치에서 사용하며 문자 인코딩 방식에 아스키를 기초로 두고 있다.

다음은 아스키의 특징이다.
- 7비트로 구성
- 총 128개의 문자로 구성 (출력 불가능한 제어문자 33개, 출력 가능한 문자 95개)
- 출력 가능한 문자들은 52개의 영문 알파벳 대소문자와, 10개의 숫자, 32개의 특수 문자, 1개의 공백 문자로 이루어진다.

이번 문제에서는 아스키 코드 중 알파벳에 대해서,
사용자가 입력한 알파벳의 대소문자를 변경하는 프로그램을 작성하시오.


    입출력 예시
    ---
    |입력|결과|
    |---|---|
    |a|A|
    |b|B|
    |C|c|
    |D|d|
 */

import java.util.Scanner;

public class P01_02 {
    public static void solution() {
        Scanner sc = new Scanner(System.in);
        System.out.println("알파벳 입력:");
        char input = sc.nextLine().charAt(0);
        int output = 0;

        int step = (int)'a' - (int)'A';

        if(input >= 'a' && input <= 'z'){
            output = (int)input - step;
            System.out.println("대문자 변환 : " + (char)output);
        }else if(input >='A' && input <='Z'){
            output = (int)input + step;
            System.out.println("소문자 변환 : " + (char)output);
        }else {
            System.out.println("입력한 값이 알파벳이 아닙니다.");
        }

    }

    public static void reference() {
        int a = (int)'a';
        System.out.println("a = " + a);
        int z = (int)'z';
        System.out.println("z = " + z);
        int A = (int)'A';
        System.out.println("A = " + A);
        int Z = (int)'Z';
        System.out.println("Z = " + Z);
        int etc = (int)'%';
        System.out.println("etc = " + etc);
    }

    public static void main(String[] args) {
        reference();    // 아스키 코드 참고
        solution();
    }
}
