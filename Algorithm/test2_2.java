package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class test2_2 {

    public static int[] solution(int[] a, int[] b) {
        int[] test = {0, 0, 0, 0, 0};
        List<Integer> intList = new ArrayList<>();

        // 11 3 1 8 10
        // {1, 1, 3, 1, 9, 0}

        for (int i = 0; i < a.length; i++) {
            test[i] = a[i] + b[i];
            if (test[i] >= 10) {
                if (i >= 2) {
                    intList.set(i, test[i - 1] + 1);
                    intList.add(i + 1, test[i] % 10);
                    break;
                }
                intList.add(i, test[i] / 10);
                intList.add(i + 1, test[i] % 10);
            } else {
                intList.add(i + 1, test[i]);
            }
        }
        int[] answer = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i).intValue();
        }
        return answer;
    }

    public static void main(String[] args) {
        int [] a = {5, 2, 1, 4, 6};
        int [] b = {6, 1, 0, 4, 4};

        System.out.println(solution(a,b));
    }
}

//  매개변수 형식
//  a = {5, 2, 1, 4, 6}
//  b = {6, 1, 0, 4, 4}
//
//  반환값 형식
//  {1, 1, 3, 1, 9, 0}