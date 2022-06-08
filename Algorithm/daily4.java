package Algorithm;

import java.util.stream.Stream;

public class daily4 {

    public static String insertDash(String str) {
        if(str.isEmpty()){
            return null;
        }
        String result = "";

        int[] arrNum = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < arrNum.length-1; i++) {
            if(arrNum[i] %2 !=0 && arrNum[i+1] %2 !=0){
                result += Integer.toString(arrNum[i]) + "-";
                continue;
            }
            result += Integer.toString(arrNum[i]);
        }
        return result + Integer.toString(arrNum[arrNum.length-1]);
    }

    public static void main(String[] args) {
//        String output = insertDash("454793");
        String output = insertDash("6734611997679419173"); // --> 67-3461-1-9-9-767-941-9-1-7-3
        System.out.println(output); // --> 4547-9-3
    }
}
