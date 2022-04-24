package Algorithm;

/*
연속된 숫자가 무작위 순서로 배치된 배열 numbers를 입력받았다.
이 배열에는 최소한 하나 이상 비어있는 숫자가 있으며, 배열에서 가장 작은 숫자는 알려져 있지 않다.
배열에서 비어있는 숫자 중, 가장 작은 숫자를 출력하는 프로그램을 작성하시오.

입력
numbers = {9, 4, 2, 3, 7, 5}
출력
6

배열에서 가장 작은 숫자는 2이고, 3, 4, 5가 배열에 있고 6은 없으므로, 가장 작은 비어있는 숫자는 6이다.

 */
import java.util.Arrays;

public class test2_1 {
    public int solution(int[] numbers) {
        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {
//        int[] numbers = {9, 4, 2, 3, 7, 5};
        int[] numbers = {26, 62, 34, 52, 15, 17, 16, 20, 19, 18};
        int test = 0;
        Arrays.sort(numbers);
        for (int item:numbers) {
            System.out.println(item);
        }
        for (int i = 0; i < numbers.length-1; i++) {
            int result = numbers[i+1] - numbers[i];
            if(result >= 2){
                test = numbers[i] + 1;
                break;
            }
        }
        System.out.println("test =" + test);
    }
}

/*
입력값 〉
[26, 62, 34, 52, 15, 17, 16, 20, 19, 18]
기댓값 〉
21
 */