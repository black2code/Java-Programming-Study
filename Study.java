import java.util.Locale;

public class Study {
    public static void main(String[] args) {
        //equals
        String s3 = "Hi";
        String s4 = "Hi";

        System.out.println(s3.equals(s4));   // s3와 s4는 같은 공간의 같은 값을 갖는다.
        System.out.println(s3 == s4);

        String s5 = new String("Hi"); // s5는 다른 공간의 값을 갖는다.
        System.out.println(s3.equals(s5)); // equals는 변수가 담겨져 있는 값을 비교
        System.out.println(s3 == s5); // ==는 객체를 비교

        // indexOf 인덱스 위치 출력
        String s6 = "Hello! World!";
        System.out.println(s6.indexOf("!")); // !의 위치 5가 출력됨
        System.out.println(s6.indexOf("!",s6.indexOf("!")+1)); // 찾고자 할 "!", 처음 찾은 위치 다음 +1

        //replace
        String s7 = s6.replace("Hello","bye");  // Hello 를 bye로 대체한다.
        System.out.println("s7 = " + s7);

        //substring
        System.out.println(s7.substring(0,3));  // 0부터 3전꺼 까지 0,1,2
        System.out.println(s7.substring(0,s7.indexOf("!")+1)); // 0부터 !+1 까지, "!" 포함하여 출력

        //toUpperCase
        System.out.println(s7.toUpperCase()); // s7의 값을 모두 대문자로 출력

        //StringBuffer
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("56789");
        System.out.println("sb1 = " + sb1);

        String a = "01234";
        String b = "56789";

        a += b;
        System.out.println(a);
        // sb1와 a 는 같은 값이 나오지만, 문자열이 자주변경되면 StringBuffer를 사용하면 더 좋다.
        // 이유는 객체를 새로 생성하지 않기 때문, 기존의 객체에 변경하면 되기 때문에
        // String같은 경우 객체를 새로 생성하여 거기에 넣기 때문에, 새로운 객체를 생성하면 메모리 생성이 여러번 되는 거고
        // 시스템적으로 딜레이가 발생할 수 있다.

        // 배열
        int [] myArray1 = {1,2,3,4};
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);

        char [] myArray2 = {'a','b','c','d','e'};
        System.out.println(myArray2[2]);

        String[] myArray3 = new String[3];
        myArray3[0] = "Hello";
        myArray3[1] = " ";
        myArray3[2] = "World!";
    }
}
