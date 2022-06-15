package Algorithm;

public class daily9 {
    public static Integer modulo(int num1, int num2) {
        Integer result = num1;

        if(num2 == 0){
            return null;
        }
        if(num1 == num2){
            return 0;
        }
        while (result > num2){
            result -= num2;
        }
        return result;
    }

    public static void main(String[] args) {
        Integer output = modulo(25, 4);
        System.out.println(output); // --> 1

        output = modulo(25, 0);
        System.out.println(output); // --> null

    }
}
