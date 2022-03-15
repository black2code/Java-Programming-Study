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
//        int A = Integer.valueOf(arr[0]);
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
    }
}
