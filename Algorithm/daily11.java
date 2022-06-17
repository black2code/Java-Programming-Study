package Algorithm;

/*
    Math.sqrt 사용은 금지
    String 타입을 리턴해야 합니다.
    최대 소수점 둘째 짜리까지 구한 수를 문자열로 변환하여 출력합니다. (소수점 셋째 자리에서 반올림)

 */
public class daily11 {
    // 바빌로니아 법
    public static String computeSquareRoot(int num) {
        double result = 1;
        String re = "";
        for(int i = 0; i < 10; i++){
            result = (result +(num / result)) / 2;
        }
        return String.format("%.2f",result);
    }

    public static void main(String[] args) {
        String output = computeSquareRoot(9);
        System.out.println(output); // --> "3.00"

        output = computeSquareRoot(6);
        System.out.println(output); // --> "2.45"

    }
}
