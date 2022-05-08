package Study;

import java.util.Arrays;

/*  int 타입의 배열을 입력 받아 짝수만을 요소로 갖는 배열을 리턴

    입력
        int[] output = getEvenNumbers(new int[]{1, 2, 3, 4});
    출력
        System.out.println(output); // --> [2, 4]

 */

public class getEvenNumbers {
    public static int[] getEvenNumbers(int[] arr) {
        // TODO:
        int[] result = new int[]{};
        if (arr.length == 0) {
            return new int[]{};
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result = Arrays.copyOf(result, result.length + 1);
                // +1 하게 되면 result[2,10,0] 0으로 초기화
                result[result.length - 1] = arr[i];
                // 배열의 맨끝에 짝수 추가
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int [] arr = getEvenNumbers(new int[]{3,2,10,5,8});
        for (int re: getEvenNumbers(arr)) {
            System.out.print(re);
        }
    }
}
