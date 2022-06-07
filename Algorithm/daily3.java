package Algorithm;

public class daily3 {
    public static boolean ABCheck(String str) {
        // TODO:
        if(str.length() == 0) {
            return false;
        }
        str = str.toLowerCase();

        for(int i = 4; i < str.length(); i++) {
            if((str.charAt(i) == 'a' && str.charAt(i - 4) == 'b') || (str.charAt(i) == 'b' && str.charAt(i - 4) == 'a')) {
                return true;
            }
        }

        return false;
//        String []len = str.split("");
//        int count = 0;
//
//        for (int i = 0; i < len.length; i++) {
//            if(i==len.length-4){
//                return false;
//            }
//            if (len[i].equals("a") || len[i].equals("A")) {
//                for (int j = 0; j < 5; j++) {
//                    count++;
//                    if (count == 5 && (len[i + j].equals("b") || len[i + j].equals("B"))) {
//                        return true;
//                    } else if (count == 5) {
//                        count = 0;
//                        break;
//                    }
//                }
//            }else if(len[i].equals("b") || len[i].equals("B")){
//                for (int j = 0; j < 5; j++) {
//                    count++;
//                    if (count == 5 && (len[i + j].equals("a") || len[i + j].equals("A"))) {
//                        return true;
//                    } else if (count == 5) {
//                        count = 0;
//                        break;
//                    }
//                }
//            }
//        }
//        return false;
    }

    public static void main(String[] args) {
//        boolean output = ABCheck("lane Borrowed");
//        System.out.println(output); // --> true
//        boolean output = ABCheck("TgDrnjAz6kAbdEaxFkrKIsa");
//        System.out.println(output); // --> false
//        boolean output = ABCheck("HK9J6YjrAcMbq8qKrbS3EaPRT");
//        System.out.println(output); // --> true
        //        boolean output = ABCheck("TgDrnjAz6kAbdEaxFkrKIsa");
//        System.out.println(output); // --> false
        boolean output = ABCheck("vsZYkn LOfgbAabbHYw4tO1O");
        System.out.println(output); // --> false
    }
}
