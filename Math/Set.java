package Math;

/*  집한(Set)
    - 특정 조건에 맞는 원소들의 모임
    - 집합 표현 방법
        - 원소 나열법
         A = {1,2,3,4,5}, B = {2,4,6,8,10}
        - 조건 제시법
         A = {A|A는 정수, 1<= A <=5}
         B = {2B|B는 정수, 1<= B <=5}
    교집합
    - 두 집합이 공통으로 포함하는 원소로 이루어진 집합
    합집합
    - 어느 하나에라도 속하는 원소들을 모두 모은 집합
    차집합
    - A(or B)에만 속하는 원소들의 집합
    여집합
    - 전체집합(U)중 A의 원소가 아닌 것들의 집합
 */

import java.util.Arrays;
import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        System.out.println("== HashSet ==");
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(1);
        set1.add(1);
        System.out.println("set1 = " + set1); //중복 저장 안됨
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1);
        set1.remove(1); //인덱스로 인식하지 않고 값으로 인식함
        System.out.println("set1 = " + set1); //[2,3] set은 중복값을 허용하지 않음
        System.out.println(set1.size());
        System.out.println(set1.contains(2)); //2가 있는지 true

//        집합 연산
        System.out.println();
        System.out.println("== 집합 연산 == ");

//        교집합
        HashSet a = new HashSet(Arrays.asList(1,2,3,4,5));
        HashSet b = new HashSet(Arrays.asList(2,4,6,8,10));
//        a.retainAll(b); // a에 교집합만 남게 된다.
//        System.out.println("교집합 : " + a);

//        합집합
//        a.addAll(b);
//        System.out.println("합집합 : " + a);


//        차집합
        a.removeAll(b);
        System.out.println("차집합 : " + a);


    }
}
