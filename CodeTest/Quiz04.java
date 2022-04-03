package CodeTest;

import java.util.Random;
import java.util.Scanner;

/*  주민등록번호 생성 프로그램
    - Scanner의 입력함수와 조건문 및 Random 클래스를 통한 주민번호 생성 로직 작성
    - 입력값은 생년, 월, 일, 성별과 임의의 번호를 통해서 생성
    - 임의번호는 Random함수의 nextInt()함수를 통해서 생성
    1 2  3 4  5 6  7   8 9 10 11 12 13
    생년   월   일  성별      임의 번호
 */
public class Quiz04 {
    public static void main(String[] args) {
        String man = "";
        String woman = "";
        int numbers = 0;
        String sran = "";
        String resultnumber = "";

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요(yyyy):");
        String year = sc.next();
        System.out.print("출생월을 입력해 주세요(mm):");
        String month = sc.next();
        System.out.print("출생일을 입력해 주세요(dd):");
        String day = sc.next();
        System.out.print("성별을 입력해 주세요(m/f):");
        String sex = sc.next();

        for (int i = 0; i < 6; i++) {
            numbers = random.nextInt(9);
            sran = Integer.toString(numbers);
            resultnumber += sran;
        }
        if(sex.equals("m")){
            man = "3";
            System.out.println(year + month + day + "-" + man + resultnumber);
        }else{
            woman = "4";
            System.out.println(year + month + day + "-" + woman + resultnumber);
        }
    }
}
