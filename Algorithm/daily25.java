package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class daily25 {

    public static ArrayList<Integer> solution(int num, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < num; i++) {
            if (arr[i] > arr[i-1]) answer.add(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int arr[] = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x :solution(num,arr)) {
            System.out.print(x + " ");
        }
    }
}

/*
N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램
자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
(첫 번째 수는 무조건 출력한다)

6
7 3 9 5 6 12

7 9 6 12

 */
