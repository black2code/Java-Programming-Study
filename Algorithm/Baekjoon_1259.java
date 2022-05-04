package Algorithm;

import java.util.Scanner;

public class Baekjoon_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            boolean answer = true;
            if (str.equals("0")) {
                break;
            }
            for (int i = 0; i < str.length()/2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                    answer = false;
                }
            }
            if (answer) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

//        String to = Integer.toString(number);
//        StringBuffer sb = new StringBuffer(to);
//        String reverse = sb.reverse().toString();
//
//        if(number == 0){
//            System.exit(0);
//        }
//        else if(to.equals(reverse)){
//            System.out.println("yes");
//        }else{
//            System.out.println("no");
//        }
