package CodeTest;

/* 구구단 출력하기
- JAVA 다중 반복문과 format함수를 이용
 */

public class Quiz01 {
    public static void main(String[] args) {
        System.out.println("[구구단 출력]");

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(String.format("%02d x  %02d = %02d     ", j, i, j * i));
                if(j==9){
                    System.out.println();
                }
            }
        }
    }
}
