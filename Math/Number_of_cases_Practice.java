package Math;

// Practice
// 약수 구하기, 두 수의 최대공약수와 최소공배수 구하기
// 활용) 1~10의 수 중 A의 약수 또는 B의 약수인 경우의 수
// 활용) 1~10의 수 중 A의 약수이면서 B의 약수인 경우의 수


import java.util.ArrayList;

public class Number_of_cases_Practice {

    //  약수
    public ArrayList getDivisor(int num) {
        ArrayList result = new ArrayList();
        for (int i = 1; i <= (int)num/2; i++) { // num의 절반까지, 나누어 지는것만 result에 추가
            if(num % i == 0){
                result.add(i);
            }
        }
        result.add(num); // 마지막 자기 자신도 추가
        return result;
    }

    //  최대 공약수
//  GCD: the Greatest Common Denominator
    public int getGCD(int numA, int numB) {
        int gcd = -1;
        ArrayList divisorA = this.getDivisor(numA); //약수 구함
        ArrayList divisorB = this.getDivisor(numB); // 약수 구함

        for (int itemA : (ArrayList<Integer>)divisorA) {
            for (int itemB : (ArrayList<Integer>)divisorB) {
                if(itemA == itemB){ //약수들 끼리 같은 수가 발견되면
                    if(itemA > gcd){  //약수가 gcd값보다 크다면
                        gcd = itemA; //계속해서 큰 공약수로 바꿔줌
                    }
                }
            }
        }
        return gcd;
    }

    //  최소 공배수
//  LCM: the Lowest Common Multiple
    public int getLCM(int numA, int numB) {
        int lcm = -1;

        int gcd = this.getGCD(numA,numB); //최대 공약수

        if(gcd != -1){ //만약 num이 0이면 최대 공약수가 없으니, -1이 나오는걸 방지
            lcm = numA * numB / gcd;    // 최소 공배수 = numA * numB / 최대 공약수
        }

        return lcm;
    }

    public static void main(String[] args) {
        //      Test code
        int number1 = 10;
        int number2 = 6;

        Number_of_cases_Practice p = new Number_of_cases_Practice();
        ArrayList l1 = p.getDivisor(number1);   // 10: 1, 2, 5, 10
        ArrayList l2 = p.getDivisor(number2);   // 6: 1, 2, 3, 6
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        System.out.println("최대 공약수: " + p.getGCD(number1, number2));
        System.out.println("최대 공배수: " + p.getLCM(number1, number2));
    }
}
