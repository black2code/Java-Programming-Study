package Study;

/* Collection
    List 인터페이스
     - 순서가 있는 데이터의 집합
     - 데이터 중복 허용
     - 대표 구현 클래스
        - ArrayList, LinkedList, Vector
    Set 인터페이스
     - 순서가 없는 데이터 집합
     - 데이터의 중복 허용 하지 않음
     - 대표 구현 클래스
       - HashSet, TreeSet
    Map 인터페이스
     - 키와 값의 쌍으로 이루어진 데이터 집합
     - 순서를 유지 하지 않음
     - 대표 구현 클래스
      - HashMap, TreeMap
 */


import java.util.*;

public class Study_Collection {
    public static void main(String[] args) {

//      1. List
//        1-1. ArrayList
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("list1 = " + list1); //[1,2,3]
        list1.remove(Integer.valueOf(2));
        System.out.println("list1 = " + list1); //[1,3]
        list1.add(0, 10);
        System.out.println("list1 = " + list1); //[10,1,3]
        System.out.println("list1.size() = " + list1.size()); //list1의 사이즈 3
        System.out.println("list1.contains(1) = " + list1.contains(1)); //데이터가 있는지 확인 true
        System.out.println("list1.indexOf(10) = " + list1.indexOf(10)); //10의 인데스 위치 확인 0

//      1-2. LinkedList
        System.out.println();
        System.out.println("== LinkedList ==");
        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("list2 = " + list2); // [1,2,3]
        list2.addFirst(10); //가장 첫번째 데이터 추가
        list2.addLast(20); // 마지막 데이터 추가
        System.out.println("list2 = " + list2); //[10,1,2,3,20]
        list2.remove(Integer.valueOf(1));
        System.out.println("list2 = " + list2); //[10,2,3,20]
        list2.removeFirst();
        list2.removeLast();
        System.out.println("list2 = " + list2); //[2,3]
        System.out.println(list2.size()); //2

//      2. Set
//      2-1. HashSet
        System.out.println();
        System.out.println("== HashSet ==");
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1);
        set1.remove(1); //인덱스로 인식하지 않고 값으로 인식함
        System.out.println("set1 = " + set1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1); //[2,3] set은 중복값을 허용하지 않음
        System.out.println(set1.size());
        System.out.println(set1.contains(2));

//      2-2. TreeSet
        System.out.println();
        System.out.println("== TreeSet ==");
        TreeSet set2 = new TreeSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println("set2 = " + set2);
        set2.remove(2); // 값으로 인식함
        System.out.println("set2 = " + set2); // [1,3]
        set2.clear(); //모든 데이터가 지워짐
        System.out.println("set2 = " + set2);  // []
        set2.add(10);
        set2.add(5);
        set2.add(15);
        set2.add(15);
        System.out.println("set2 = " + set2); //[5,10,15] 중복 허용하지 않음
        System.out.println(set2.first());
        System.out.println(set2.last());
        System.out.println(set2.lower(10)); //10보다 작은 값 출력
        System.out.println(set2.higher(10)); //10보다 큰 값 출력


//      3. Map
//      3-1. HashMap
        System.out.println();
        System.out.println("== HashMap ==");
        HashMap map1 = new HashMap();
        map1.put(1, "kiwi");
        map1.put(2, "apple");
        map1.put(3, "mango");
        System.out.println("map1 = " + map1); // map1 = {1=kiwi, 2=apple, 3=mango}

        map1.remove(2);
        System.out.println("map1 = " + map1); //map1 = {1=kiwi, 3=mango}
        System.out.println("map1.get(1) = " + map1.get(1)); // map1.get(1) = kiwi


//      3-2. TreeMap
        System.out.println();
        System.out.println("== TreeMap ==");
        TreeMap map2 = new TreeMap();
        map2.put(10, "kiwi");
        map2.put(5, "apple");
        map2.put(15, "mango");
        System.out.println("map2 = " + map2); // map2 = {5=apple, 10=kiwi, 15=mango}

        System.out.println(map2.firstEntry());
        System.out.println(map2.firstKey());
        System.out.println(map2.lastEntry());
        System.out.println(map2.lastKey());
        System.out.println(map2.lowerEntry(10));
        System.out.println(map2.higherEntry(10));

    }
}
