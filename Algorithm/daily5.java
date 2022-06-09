package Algorithm;

/* 가장 짧은 문자열과 가장 긴 문자열을 제거한 배열을 리턴
가장 짧은 문자열의 길이와 가장 긴 문자열의 길이가 같은 경우는 없습니다.
가장 짧은 문자열 또는 가장 긴 문자열이 다수일 경우, 나중에 위치한 문자열을 제거
공백을 입력받을 경우, null을 반환
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class daily5 {
    public static String[] removeExtremes(String[] arr) {
        if(arr.length == 0) return null;

        String[] result = new String[arr.length-2];
        int[] compare = new int[arr.length];
        int iMax = 0;
        int iMin = 9999999;

        for (int i = 0; i < arr.length; i++) {
            compare[i] += arr[i].length();
            iMax = Math.max(compare[i],iMax); // 7
            iMin = Math.min(compare[i],iMin); // 2
        }
        System.out.println(iMax); //3
        System.out.println(iMin); //1
        int count = 0;

        boolean flag = true;
        boolean flag2 = true;
        for (int i = arr.length-1; i >= 0; i--) {
            if (iMin == arr[i].length() && flag) {
                flag = false;
                continue;
            }
            if (iMax == arr[i].length() && flag2) {
                flag2 = false;
                continue;
            }
            result[count] = arr[i];
            count++;
        }
        List<String> lst1 = Arrays.asList(result);
        Collections.reverse(lst1);
        for (int i = 0; i < lst1.size(); i++) {
            result[i] = lst1.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] output = removeExtremes(new String[]{"a", "c", "def"}); // 5,2,3,7,4
        System.out.println(Arrays.toString(output)); // --> ["where", "the", "word"]
    }
}
