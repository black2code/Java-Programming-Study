package Algorithm;

public class daily7 {
    public static String readVertically(String[] arr) {
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            len += arr[i].length();
        }
        System.out.println(len);
        String result = "";
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[j].length() > i){
                    result += arr[j].charAt(i);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        String[] input = new String[]{
//                "hello",
//                "wolrd",
//        };
//        String output = readVertically(input);
//        System.out.println(output); // --> "hweolllrod"
        String[] input = new String[]{
                "hi",
                "wolrd",
        };
        String output = readVertically(input);
        System.out.println(output); // --> "hwiolrd"
    }
}
