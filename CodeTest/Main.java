package CodeTest;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1001 ~ 1008 [기초-출력] 출력하기
//        System.out.println("Hello"); 1001
//        System.out.println("Hello World"); 1002
//        System.out.print("Hello\nWorld"); 1003
//        System.out.println("\'Hello\'"); 1004
//        System.out.println("\"Hello World\""); 1005
//        System.out.println("\"!@#$%^&*()\""); 1006
//        System.out.println("\"C:\\Download\\hello.cpp\""); 1007
//        System.out.println("\u250c\u252c\u2510\n\u251c\u253c\u2524\n\u2514\u2534\u2518"); 1008

        // 1010 ~ 1014 [기초-입출력]
//        int n = sc.nextInt();
//        System.out.println(n);    1010

//        char x = sc.next().charAt(0);
//        System.out.println(x);    1011

//        float x = sc.nextFloat();
//        System.out.println(String.format("%.6f",x));  1012

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.print(a + " " + b);    1013

//        Scanner sc = new Scanner(System.in);
//        char ch1 = sc.next().charAt(0), ch2 = sc.next().charAt(0);
//        System.out.println(ch2 + " " + ch1);  1014

        // 1015 ~ 1018 [기초-입출력]
//        float x = sc.nextFloat();
//        System.out.println(String.format("%.2f",x)); 1015

//        int n = sc.nextInt();
//        System.out.println(n + " "+ n + " " + n); 1017
//
//        String time = sc.nextLine();
//        System.out.println(time); 1018

//        String a = sc.next();
//        String[] arr = a.split("\\.");
//        int A = Integer.valueOf(arr[0]);// Integer.vlueOf() 문자열의 값을 정수형으로 변환한 다음 Integer 객체로 만들어서 반환합니다. 즉 new Integer(Integer.parseInt(s)) 값이 리턴됩니다.
//        int B = Integer.valueOf(arr[1]);
//        int C = Integer.valueOf(arr[2]);
//        System.out.printf("%04d.%02d.%02d", A, B, C);  1019
        /*
        \\. 사용 이유
        split의 인자로 들어가는 String 토큰이 regex 정규식이기 때문이다.
        정규식에서 .은 무작위의 한 글자를 의미한다. 그러면 모든 문자가 토큰이 되기 때문에 배열에 남는 게 없게 되는 것이다.
        그렇기 때문에 이스케이프 문자를 앞에 붙여 줘야 한다. 그런데 String 안에 이스케이프 문자인 \를 써 주려면 \\라고 써 줘야 한다.
        그래서 \\.이라고 쓰면 정규식 쪽에서는 \.라고 인식을 하고 실제 .을 찾게 되는 것이다.
        */

//        String Resident_Registration_Number = sc.next();
//        Resident_Registration_Number = Resident_Registration_Number.replace("-", "");
//        System.out.println(Resident_Registration_Number); 1020
//        replace를 이용하여 "-" 문자를 "" 로

//        String data = sc.next(); 공백을 기준으로 입력을 받는다. 즉, 띄어쓰기(=\\s)을 기준으로 입력을 받는다.
//        System.out.println(data); 1021

//        String data = sc.nextLine();  // 한 라인을 기준으로 입력을 받는다. 즉, 개행문자(=줄넘김)(=\n)을 기준으로 입력을 받는다.
//        System.out.println(data); 1022

//        String a = sc.next();
//        String[] arr = a.split("\\.");
//        int intValue = Integer.valueOf(arr[0]); //문자열의 값을 정수형으로 변환한 다음 Integer 객체로 만들어서 반환합니다. 즉 new Integer(Integer.parseInt(s)) 값이 리턴됩니다.
//        int floatValue = Integer.valueOf(arr[1]);
//        System.out.println(intValue);
//        System.out.println(floatValue); 1023

//        String a = sc.next();
//        int len = a.length();
//        for(int i =0;i<len;i++) {
//            System.out.printf("\'%c\'\n", a.charAt(i)); 1024 // 단어 1개 입력받아 나누어 출력
//        }

        //1025 정수 1개 입력받아 나누어 출력하기
//        String a = sc.next();
//        char [] arr = a.toCharArray();
//        for(int i=0; i<arr.length; i++) {
//            System.out.print("[" + arr[i]);
//            for(int j=arr.length-1; j>i; j--) {
//                System.out.print("0");
//            }
//            System.out.println("]");
//        }

        //1025 다른 풀이, Math.pow(밑,지수) 제곱 구하기
        //Character.getNumericValue  char to int형으로 변환
        //toCharArray() 메소드는 문자열을 char형 배열로 바꿔준다.
//        String a = sc.next();
//        char[] arr = a.toCharArray();
//        for(int i=0; i<arr.length; i++) {
//            System.out.println("["+Character.getNumericValue(arr[i]) * (int)Math.pow(10,arr.length-1-i)+"]");
//        }

        //1026 입력되는 시:분:초 에서 분만 출력
//        String a = sc.next();
//        String[] arr = a.split(":");
//
//        if(Integer.valueOf(arr[1])==00){
//            System.out.println(0);
//        }else {
//            System.out.println(Integer.valueOf(arr[1]));
//        }

        //1027 년월일 입력 받아 형식 바꿔 출력하기 2022.03.18 -> 18-03-2022
//        String a = sc.next();
//        String[] arr = a.split("\\.");
//        System.out.println(arr[2]+"-"+arr[1]+"-"+arr[0]);

        //1028 정수 1개 입력받아 그대로 출력하기2
        // (단, 입력되는 정수의 범위는 0 ~ 4,294,967,295 이다.)

//        long n = sc.nextLong();
//        System.out.println(n);

        //1029 실수 1개를 입력받아 그대로 출력해보자.
        //(단, 입력되는 실수의 범위는 +- 1.7*10-308 ~ +- 1.7*10308 이다.)

//        double n = sc.nextDouble();
//        System.out.printf("%.11f", n);

        //1030 정수 1개를 입력받아 그대로 출력해보자.
        //단, 입력되는 정수의 범위는
        //-9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807 이다.

//        long n = sc.nextLong();
//        System.out.println(n);

        //1031 10진수를 입력받아 8진수(octal)로 출력해보자.
//        int n = sc.nextInt();
//        System.out.printf("%o",n);

        //1032 10진수를 입력받아 16진수(hexadecimal)로 출력해보자.
//        int n = sc.nextInt();
//        System.out.printf("%x",n);

        //1033  10진수를 입력받아 16진수(hexadecimal)로 출력해보자.
        //대문자로
//        int n = sc.nextInt();
//        System.out.printf("%X",n);

        //1034 8진 정수 1개 입력받아 10진수로 출력하기
        //parseInt(String s, int radix)
//        String n = sc.next();
//        int decimal = Integer.parseInt(n,8); // String n 을 변환할 진수(radix)로 읽어서 int로 반환
//        System.out.print(decimal);

        //1035 6진 정수 1개 입력받아 8진수로 출력하기
//        String number = sc.next();
//        int hexaToDecimal = Integer.parseInt(number,16);
//        System.out.printf("%o",hexaToDecimal);

        //1036 영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력
//        String code = sc.next();
//        int num = (int)code.charAt(0);
//        System.out.println(num);

        //1037  10진 정수 1개를 입력받아 아스키 문자로 출력
//        int num = sc.nextInt();
//        char ch = (char)num;
//        System.out.println(ch);
    }
}
