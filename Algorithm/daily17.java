package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class daily17 {

    public static StringBuilder solution(String str) {
        StringBuilder answer = new StringBuilder();
        char [] s = str.toCharArray();

        ArrayList<Character> arrayList = new ArrayList<Character>();
        for (int i = 0; i < s.length; i++) {
            if (arrayList.contains(s[i])){
                continue;
            }
            arrayList.add(s[i]);
            answer.append(s[i]);
        }
        answer.toString();
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}

// ksekkset kset
