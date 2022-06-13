package Algorithm;

import java.util.Arrays;

public class daily6 {
    public static int[] reverseArr(int[] arr){
        if(arr.length==0){
            return new int[]{};
        }
        /*
         * Recursive Case : 그렇지 않은 경우
         * 문제를 더 이상 쪼갤 수 없는 경우
         * head: 배열의 첫 요소
         * tail: 배열의 첫 요소만 제거된 배열
         */
        int[] head = Arrays.copyOfRange(arr, arr.length-1, arr.length);
        int[] tail = reverseArr(Arrays.copyOfRange(arr, 0, arr.length-1));
        int[] dest = new int[head.length + tail.length];

        System.arraycopy(head, 0, dest, 0, head.length);
        System.arraycopy(tail, 0, dest, head.length, tail.length);

        return dest;
    }

    public static void main(String[] args) {
        int[] output = reverseArr(new int []{1,2,3});
        System.out.println(Arrays.toString(output)); // --> [3, 2, 1]
    }
}
