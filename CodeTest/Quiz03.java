package CodeTest;

/*  놀이동산 입장권 계산 프로그램
    - Scanner의 입력함수와 다중 조건문을 통한 입장권 계산 로직 작성
    - 3세 미만이면 무료 입장
    - 복지카드와 국가유공자의 경우 일반 할인 적용
    - 13세미만이면 특별 할인 적용
    - 17시이후에 입장하면 특별 할인 적용

    - 기본 입장료 : 10,000원
    - 특별 할인의 경우 : 4,000원
    - 일반 할인의 경우 : 8,000원
 */

import java.util.Scanner;

public class Quiz03 {
    public static void main(String[] args) {
        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요. (숫자):");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.print("입장시간을 입력해 주세요. (숫자입력):");
        int time = sc.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요. (y/n):");
        char national_Merit = sc.next().charAt(0);
        System.out.print("복지카드 여부를 입력해 주세요. (y/n):");
        char card = sc.next().charAt(0);

        int admission_Fee = 10000;

            if (age < 3) {
                admission_Fee = 0;

            } else if (age < 13 || time >= 17) {
                admission_Fee = 4000;

            } else if (national_Merit == 'y' || card == 'y') {
                admission_Fee = 8000;
            }

        System.out.printf("입장료 : " + admission_Fee);
    }
}
