package CodeTest;

/* 결제 금액 캐시백 계산 프로그램
- Scanner 입력 함수와 조건문을 통한 캐시백 계산
- 결제 금액의 10% 적립
- 캐시포인트 단위는 백원 단위
- 한건의 캐시백 포인트 단위는 최대 300원을 넘을 수 없다.

 */

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요 (금액) : ");
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int save = price / 10;
        if (save > 300) {
            save = 300;
        }else{
            save = (save/100)*100;
        }
            System.out.printf("결제 금액은 " + price + "원이고, 캐시백은 %d원 입니다.", save);
    }
}
