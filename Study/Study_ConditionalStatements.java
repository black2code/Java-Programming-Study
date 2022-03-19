package Study;

public class Study_ConditionalStatements {
    public static void main(String[] args) {

//        1.조건문 - if
        System.out.println("== if ==");
        int waterTemperature = 99;

        if(waterTemperature >= 100){
            System.out.println("물이 끓었습니다.");
        }else{
            System.out.println("물을 끓이는 중입니다.");
        }

        int score = 90;
        char grade = 0;

        if (score >= 90){
            grade = 'A';
        }else if (score >= 80){
            grade = 'B';
        }else if (score >= 70){
            grade = 'C';
        }else {
            grade = 'F';
        }
        System.out.println("grade = " + grade);


//        2. 조건문 - switch
        System.out.println("== switch == ");
        String fruit = "apple";

        switch(fruit){
            case "apple":
                System.out.println(fruit + "은 5000원 입니다.");
                break;
            case "blueberry":
                System.out.println(fruit + "은 10000원 입니다.");
                break;
            default:
                System.out.println("해당 과일이 없습니다.");
                break;
        }

//        Q1. number값이 홀수인지 짝수인지 판단하는 코드를 작성하시오.
        int number = 5;

        if (number%2==0){
            System.out.println("number는 짝수입니다. " + number);
        }else{
            System.out.println("number는 홀수입니다. " + number);
        }

        //      Q2. 아래 주석은 위의 실습에서 진행한 score에 따라 grade를 출력하는 코드이다.
//        이를 switch 조건문 기반으로 바꿔보세요.

//        int score2 = 90;
//        char grade2 = 0;

//        if (score2 >= 90) {
//            grade2 = 'A';
//        } else if (score2 >= 80) {
//            grade2 = 'B';
//        } else if (score2 >= 70) {
//            grade2 = 'C';
//        } else {
//            grade2 = 'F';
//        }
//        System.out.println("grade = " + grade2);
        int score2 = 85;
        char grade2 = 0;

        switch (score2){   //문제점 : score가 85점이라면 grade 'F'가 나옴
            case 90:
                grade2 = 'A';
                break;
            case 80:
                grade2 = 'B';
                break;
            case 70:
                grade2 = 'C';
                break;
            default:
                grade2 = 'F';
                break;
        }
        System.out.println("grade2 = " + grade2);

        switch (score2/10){   //문제점을 해결하기 위해 /10을 하면 몫으로만 계산
            case 10:  // case 10이 되면 break문이 없기 때문에 자동으로 case 9로 넘어감
            case 9:
                grade2 = 'A';
                break;
            case 8:
                grade2 = 'B';
                break;
            case 7:
                grade2 = 'C';
                break;
            default:
                grade2 = 'F';
                break;
        }
        System.out.println("grade2 = " + grade2);
    }
}
