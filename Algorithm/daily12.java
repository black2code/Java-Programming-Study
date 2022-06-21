package Algorithm;

/*
    int 타입을 리턴해야 합니다 (0 이상의 정수)
    문자열을 입력받아 문자열에서 숫자를 모두 찾아 더한 뒤에 해당 값을
    (숫자와 공백을 제외한 나머지) 문자열의 길이로 나눈 값을 정수로 반올림하여 리턴해야 합니다.
 */

public class daily12 {

    public static int numberSearch(String str) {
        if(str.length() == 0){
            return 0;
        }
        String [] strsp = new String[str.length()];
        double number = 0;
        double strlen = 0;

        for (int i = 0; i < str.length(); i++) {
            strsp[i] = String.valueOf(str.charAt(i));
            if(strsp[i].matches("[0-9]")){
                number += Integer.parseInt(strsp[i]);
            }else if(strsp[i].equals(" ")){
                continue;
            }else{
                strlen ++;
            }
        }
        if(number < strlen){
            return 0;
        }

        double result = number/strlen;
        return (int)Math.round(result);
    }

    public static void main(String[] args) {
//        int output = numberSearch("Hello6 ");
//        System.out.println(output); // --> 1

//        int output = numberSearch("Hello6 9World 2,");
//        System.out.println(output); // --> 2

//        output = numberSearch("Hello6 9World 2, Nic8e D7ay!");
//        System.out.println(output); // --> 2

//        int output = numberSearch("Fwe eAF 1FLOM d EEYdNWNWNPfN HGVcFWAXwzfEy hHpzF5OhAvuNqhbdY8xViTV cZzJOYpqXNSIkWO7G");
//        System.out.println(output); // --> 0

        int output = numberSearch("YlQO uT9");
        System.out.println(output); // --> 2

    }
}
