package CodeTest;

/*
    문제 설명
    ---
    자바의 String 자료형에는 많은 연산자 기능들이 있다.

    프로그래밍의 기본기를 익히기 위해 일부 연산자들을 제한하고 다음의 기능을 구현하려 한다.
    - String 의 replace 기능 구현
    - String의 replace, indexOf, contains를 사용하지 않고 구현한다.


    입출력 예시
    ---
                    |입력 문자열|                    from|   to  | 출력|
    |---|---|---|---|
    |"Hello Java, Nice to meet you! Java is fun!"|"Java"|"자바"|"Hello 자바, Nice to meet you! 자바 is fun!"|
                        |POP|                        P|    W|           WOW|

 */

public class P01_03 {
    public static String solution(char[] str, char[] find, char[] to) {
        int idx = 0;
        String replaceStr = ""; //최종 변경된 데이터
        char [] replaceBucket = str.clone(); // 변경하면서 임시로 사용할 배열

        do {
            idx = findIndex(replaceBucket, find);

            if(idx != 1){
                for (int i = 0; i < idx; i++) {
                    replaceStr += replaceBucket[i];
                }
                for (int i = 0; i < to.length; i++) {
                    replaceStr += to[i];
                }
                for (int i = idx + find.length; i < replaceBucket.length; i++) {
                    replaceStr += replaceBucket[i]; // 남은 데이터들의 문자들
                }
                replaceBucket = replaceStr.toCharArray();
                replaceStr = "";
            }
        }while (idx != -1);
        replaceStr = new String(replaceBucket);
        return replaceStr;
    }

    public static int findIndex(char[] str, char[] find){
        int idx = -1; //초기화
        boolean isMatch = false;

        for (int i = 0; i < str.length; i++) {
            if(str[i] == find[0] && str.length -i >= find.length){ //찾을려고 하는 첫 글자와 같은지, 원래 문자열 길이가 찾으려는 글자 길이보다 작은지
                isMatch = true;
                for (int j = 1; j < find.length; j++) {
                    if(str[i + j] != find[j]){
                        isMatch = false;
                        break;
                    }
                }
            }
            if(isMatch){ // 찾았다면 위치 저장
                idx = i;
                break;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        // Test code
        String str = "Hello Java, Nice to meet you! Java is fun!";
        String find = "Java";
        String to = "자바";

        // 기존 String replace
        System.out.println(str.replace(find, to));

        // 자체 구현 replace
        char[] strExArr = str.toCharArray();
        char[] findArr = find.toCharArray();
        char[] toArr = to.toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));

        strExArr = "POP".toCharArray();
        findArr = "P".toCharArray();
        toArr = "W".toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));
    }
}
