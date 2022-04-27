package Math;

// 기초 수학 - 지수와 로그
/*  제곱
    - 같은 수를 두번 곱함
    - 거듭 제곱 : 같은 수를 거듭하여 곱함
    제곱근(=root)
    - a를 제곱하여 b가 될 때 a를 b의 제곱근이라고 함
    로그(loga^b)
    - a가 b가 되기 위해 제곱해야 하는 수
 */

public class exponentiation {
    public static void main(String[] args) {
        //      1. 제곱, 제곱근, 지수
        System.out.println("== 제곱 ==");
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(2,-3));  // 1/2^3  = 0.125
        System.out.println(Math.pow(-2,-3)); // 1/-2^3 = 1/-8  = -0.125

        System.out.println(Math.pow(2,30));
        System.out.printf("%.0f\n", Math.pow(2,30));

        System.out.println("== 제곱근 ==");
        System.out.println(Math.sqrt(16));
        System.out.println(Math.pow(16,1.0/2));   // 16^2분의1 = 4^2^2분의1 = 4
        System.out.println(Math.pow(16,1.0/4));   // 2^4^4분의1 = 2


//      참고) 절대 값
        System.out.println("== 절대 값 ==");
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5));


//      2. 로그
        System.out.println("== 로그 ==");
        System.out.println(Math.E); //2.718281828459045
        System.out.println(Math.log(2.718281828459045)); // 1.0
        System.out.println(Math.log10(1000)); // 3.0
        System.out.println(Math.log(4)/ Math.log(2)); //2.0

    }
}
