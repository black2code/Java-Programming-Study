package Algorithm;

import java.util.Arrays;

public class Programmers06 {
    public static int[] solution(int[] arr) {
        if(arr.length == 1){
            int [] answer = new int[]{-1};
            return answer;
        }
        int min = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[min] > arr[i]) {
                min = i;
            }
        }
        int [] answer = new int[arr.length-1];
        int cnt = 0;
        for(int i=0; i<arr.length; i++) {
            if(i == min) continue;
            answer[cnt++] = arr[i];
        }
        return answer;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{4,3,2,1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
