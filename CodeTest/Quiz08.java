package CodeTest;

/*  연소득 과세금액 계산 프로그램
 */

import java.util.Scanner;

public class Quiz08 {
    public static void main(String[] args) {
        int taxRate1 = 0;
        int taxRate2 = 0;
        int taxRate3 = 0;
        int taxRate4 = 0;
        int taxRate5 = 0;
        int taxRate6 = 0;
        int taxRate7 = 0;
        int taxRate8 = 0;
        int taxResult = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("과세금액 계산 프로그램");
        System.out.print("연소득을 입력해 주세요.: ");
        int income = sc.nextInt();

        while (true) {
            taxRate1 = (int) (12000000 * 0.06);
            taxRate2 = (int) ((46000000 - 12000000) * 0.15);
            taxRate3 = (int) ((88000000 - 46000000) * 0.24);
            taxRate4 = (int) ((150000000 - 88000000) * 0.35);
            taxRate5 = (int) ((300000000 - 150000000) * 0.38);
            taxRate6 = (int) ((500000000 - 300000000) * 0.40);
            taxRate7 = (int) ((1000000000 - 500000000) * 0.42);

            if (income <= 12000000) {
                taxRate1 = (int) (income * 0.06);
                System.out.println(income + " * %6 = " + taxRate1);
                break;
            } else if (income > 12000000 && income <= 46000000) {
                taxRate2 = (int) ((income - 12000000) * 0.15);
                taxResult = taxRate2 + taxRate1;
                System.out.print("12000000 *  6% = ");
                System.out.printf("%14d\n", taxRate1);
                System.out.print(income - 12000000 + " * 15% = ");
                System.out.printf("%14d\n", taxRate2);
                break;
            } else if (income > 46000000 && income <= 88000000) {
                taxRate3 = (int) ((income - 46000000) * 0.24);
                taxResult = taxRate3 + taxRate2 + taxRate1;
                System.out.print("12000000 *  6% = ");
                System.out.printf("%14d\n", taxRate1);
                System.out.print(46000000 - 12000000 + " * 15% = ");
                System.out.printf("%14d\n", taxRate2);
                System.out.print(income - 46000000 + " * 24% = ");
                System.out.printf("%14d\n", taxRate3);
                break;
            }else if (income > 88000000 && income <= 150000000){
                taxRate4 = (int) ((income - 88000000) * 0.35);
                taxResult = taxRate4 + taxRate3 + taxRate2 + taxRate1;
                System.out.print("12000000 *  6% = ");
                System.out.printf("%14d\n", taxRate1);
                System.out.print(46000000 - 12000000 + " * 15% = ");
                System.out.printf("%14d\n", taxRate2);
                System.out.print(88000000 - 46000000 + " * 24% = ");
                System.out.printf("%14d\n", taxRate3);
                System.out.print(income - 88000000 + " * 35% = ");
                System.out.printf("%14d\n", taxRate4);
                break;
            }else if (income > 150000000 && income <= 300000000){
                taxRate5 = (int) ((income - 150000000) * 0.38);
                taxResult = taxRate5 + taxRate4 + taxRate3 + taxRate2 + taxRate1;
                System.out.print("12000000 *  6% = ");
                System.out.printf("%14d\n", taxRate1);
                System.out.print(46000000 - 12000000 + " * 15% = ");
                System.out.printf("%14d\n", taxRate2);
                System.out.print(88000000 - 46000000 + " * 24% = ");
                System.out.printf("%14d\n", taxRate3);
                System.out.print(150000000 - 88000000 + " * 35% = ");
                System.out.printf("%14d\n", taxRate4);
                System.out.print(income - 150000000 + " * 38% = ");
                System.out.printf("%14d\n", taxRate5);
                break;
            }else if (income > 300000000 && income <= 500000000){
                taxRate6 = (int) ((income - 300000000) * 0.40);
                taxResult = taxRate6 + taxRate5 + taxRate4 + taxRate3 + taxRate2 + taxRate1;
                System.out.print("12000000 *  6% = ");
                System.out.printf("%14d\n", taxRate1);
                System.out.print(46000000 - 12000000 + " * 15% = ");
                System.out.printf("%14d\n", taxRate2);
                System.out.print(88000000 - 46000000 + " * 24% = ");
                System.out.printf("%14d\n", taxRate3);
                System.out.print(150000000 - 88000000 + " * 35% = ");
                System.out.printf("%14d\n", taxRate4);
                System.out.print(300000000 - 150000000 + " * 38% = ");
                System.out.printf("%14d\n", taxRate5);
                System.out.print(income - 300000000 + " * 40% = ");
                System.out.printf("%14d\n", taxRate6);
                break;
            }else if (income > 500000000 && income <= 1000000000) {
                taxRate7 = (int) ((income - 500000000) * 0.42);
                taxResult = taxRate7 + taxRate6 + taxRate5 + taxRate4 + taxRate3 + taxRate2 + taxRate1;
                System.out.print("12000000 *  6% = ");
                System.out.printf("%14d\n", taxRate1);
                System.out.print(46000000 - 12000000 + " * 15% = ");
                System.out.printf("%14d\n", taxRate2);
                System.out.print(88000000 - 46000000 + " * 24% = ");
                System.out.printf("%14d\n", taxRate3);
                System.out.print(150000000 - 88000000 + " * 35% = ");
                System.out.printf("%14d\n", taxRate4);
                System.out.print(300000000 - 150000000 + " * 38% = ");
                System.out.printf("%14d\n", taxRate5);
                System.out.print(500000000 - 300000000 + " * 40% = ");
                System.out.printf("%14d\n", taxRate6);
                System.out.print(income - 500000000 + " * 42% = ");
                System.out.printf("%14d\n", taxRate7);
                break;
            }else if (income > 1000000000) {
                taxRate8 = (int) ((income - 1000000000) * 0.45);
                taxResult = taxRate8 + taxRate7 + taxRate6 + taxRate5 + taxRate4 + taxRate3 + taxRate2 + taxRate1;
                System.out.print("12000000 *  6% = ");
                System.out.printf("%14d\n", taxRate1);
                System.out.print(46000000 - 12000000 + " * 15% = ");
                System.out.printf("%14d\n", taxRate2);
                System.out.print(88000000 - 46000000 + " * 24% = ");
                System.out.printf("%14d\n", taxRate3);
                System.out.print(150000000 - 88000000 + " * 35% = ");
                System.out.printf("%14d\n", taxRate4);
                System.out.print(300000000 - 150000000 + " * 38% = ");
                System.out.printf("%14d\n", taxRate5);
                System.out.print(500000000 - 300000000 + " * 40% = ");
                System.out.printf("%14d\n", taxRate6);
                System.out.print(1000000000 - 500000000 + " * 42% = ");
                System.out.printf("%14d\n", taxRate7);
                System.out.print(income - 1000000000 + " * 45% = ");
                System.out.printf("%14d\n", taxRate8);
                break;
            }
        }
        System.out.println();
        System.out.printf("[세율에 의한 세금] : %14d\n",taxResult);
        System.out.printf("[누진공제 계산에 의한 세금] : %3d\n",taxResult);
    }
}
