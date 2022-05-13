package Algorithm;

public class Programmers04 {
    public static boolean solution(int x) {
        boolean answer = true;
        int result = 0;

        String reStr =Integer.toString(x);
        for (int i = 0; i < reStr.length(); i++) {
            result += Character.getNumericValue(reStr.charAt(i));
        }
        if(x % result != 0){
            return answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
