package Algorithm;

/*
문제
소수란 자기 자신과 1만을 약수로 가지는 자연수를 말한다. 예를 들어, 2, 3, 5는 소수이지만, 1, 4, 6은 소수가 아니다.
n보다 작은 소수의 개수를 출력하는 프로그램을 작성하시오.

입력설명
0 < n <= 100

출력설명
n보다 작은 모든 소수의 개수를 정수로 반환

매개변수 형식
n = 15

반환값 형식
6

예시 입출력 설명
15보다 작은 소수는 다음과 같다.

2, 3, 5, 7, 11, 13 => 총 6개
 */
public class test1 {
    public static int solution(int n) {
        int answer = 0;

        if (n < 2){
            return answer;
        }

        for (int i = 2; i < n; i++) {
            for (int j = 2; j <= i; j++) {
                if(i%j == 0){
                    if (i == j){
                        answer++;
                    }else{
                        break;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
