import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
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
        System.out.println(myArray3[0]);

        //자료형
        System.out.println("====리스트====");
        ArrayList l1 = new ArrayList();

        //add
        l1.add(1);
        l1.add("hello");
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add("world!");
        System.out.println("l1 = " + l1);

        l1.add(0,1);  //앞의 0은 index
        System.out.println("l1 = " + l1);

        //get l1의 지정된 index 값을 불러옴
        System.out.println(l1.get(0));
        System.out.println(l1.get(3));

        //size l1의 원소 개수를 구함
        System.out.println(l1.size());

        //remove 데이터 삭제
        System.out.println(l1.remove(0)); // 0번째 인덱스 값 삭제
        System.out.println(l1);

        System.out.println(l1.remove(Integer.valueOf(2))); //index으로 지정하지 않고 값으로 지정하여 삭제, 출력 값은 true 반환
        System.out.println(l1);

        //clear 리스트에 있는 모든 값을 삭제
        l1.clear();
        System.out.println("l1 = " + l1); //결과 값 l1 = []

        //sort 내림차순, 오름차순 정렬
        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(3);
        l2.add(4);
        System.out.println("l2 = " + l2);
        l2.sort(Comparator.naturalOrder()); // 오름차순 정렬
        System.out.println("l2 = " + l2);
        l2.sort(Comparator.reverseOrder()); // 내림차순 정렬
        System.out.println("l2 = " + l2);

        //contains 리스트에 데이터가 들어있는지 확인
        System.out.println(l2.contains(1)); // 1이 있는지 확인 false
        System.out.println(l2.contains(3)); // true

        //Maps 데이터 쌍을 이루는
        HashMap map = new HashMap();

        //put  map에 데이터를 넣을 때 사용
        map.put("jang",9000);
        map.put("apple",10000);
        map.put("mango",12000);
        System.out.println("map = " + map); // 순서대로 출력되지 않음
        // 출력 결과 : map = {jang=9000, apple=10000, mango=12000}

        //get  데이터를 불러오는
        System.out.println(map.get("mandarine")); // 출력 결과 : null
        System.out.println(map.get("jang")); // 출력 결과 : 9000

        //size
        System.out.println(map.size());

        //remove
        System.out.println(map.remove("jang")); // key값 입력
        System.out.println(map.remove("mandarine")); // 출력 결과 : null
        System.out.println(map);

        //containsKey  해당 키값이 있는지 확인
        System.out.println(map.containsKey("apple")); //true
        System.out.println(map.containsKey("jang")); //false

        //Generics 자료형을 제한하는 기능
        System.out.println("====Generics=====");
        ArrayList l3 = new ArrayList();
        l3.add(3);
        l3.add("Hello");
        System.out.println("l3 = " + l3);

        ArrayList<String> l4 = new ArrayList<String>();
        //l4.add(1); String 타입이 아니라 안됨
        l4.add("World");
        System.out.println("l4 = " + l4);

        HashMap map1 = new HashMap();
        map1.put(123,"id");
        map1.put("apple",10000);
        System.out.println("map1 = " + map1);

        HashMap<String, Integer> map2 = new HashMap<>(); // <> 안에 생략하면 String, Integer로 인식
        //map2.put(123,"id"); // 문자열 , 숫자로 넣어야함
        map2.put("apple",10000);
        System.out.println("map2 = " + map2);
    }
}
