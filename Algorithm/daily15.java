package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class daily15 {

    public static ArrayList<String> solution(String str) {
        ArrayList <String> arrayList = new ArrayList();

        for (int i = 0; i < str.length(); i++) {
            arrayList.add(Character.toString(str.charAt(i)));
        }
        for (int i = 0; i < arrayList.size()/2; i++) {
            if (Pattern.matches("^[a-zA-Z]*$", arrayList.get(i))){
                Collections.swap(arrayList,arrayList.indexOf(arrayList.get(i)),
                        arrayList.indexOf(arrayList.get(arrayList.size()-1-i)));
            }
        }

        return arrayList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (String n : solution(str)) {
            System.out.print(n);
        }
    }
}

// a#b!GE*T@S   S#T!EG*b@a
