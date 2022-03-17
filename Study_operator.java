public class Study_operator {
    public static void main(String[] args) {
        //삼항 연산자
        System.out.println("====삼함 연산자 ====");
        int a = 100;
        String aResult = (a==100) ? "yes":"no"; //a=100이면 yes, 아니면 no
        System.out.println("aResult = " + aResult);

        //비트 이동 연산자
        System.out.println("====비트 이동 연산자 ====");

        // << 연산자
        int numA = 3;
        int result = 0;

        result = numA << 1; //왼쪽으로 비트 이동
        System.out.println("result = " + result); //결과가 2배로 된것을 확인
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(result)));

        //>> 연산자
        result = numA >> 1;  //오른쪽으로 비트 이동
        System.out.println("result = " + result);
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(numA)));
        System.out.printf("%04d\n",Integer.parseInt(Integer.toBinaryString(result)));

        // >>> 연산자
        numA = -5;
        result = numA >> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numA));
        System.out.printf("%s\n", Integer.toBinaryString(result));

        result = numA >>> 1;
        System.out.printf("%s\n", Integer.toBinaryString(numA));
        System.out.printf("%s\n", Integer.toBinaryString(result));
//        출력 결과
//        앞에는 부호 비트 111111.....
//        11111111111111111111111111111011
//        11111111111111111111111111111101
//        11111111111111111111111111111011
//        1111111111111111111111111111101  // 가장 앞에 빈비트가 0으로 됨, 출력결과는 생략
    }
}
