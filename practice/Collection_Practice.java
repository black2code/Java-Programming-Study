package practice;

//로또 번호 만들기

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Collection_Practice {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random() *45) + 1;
            set.add(num); // 만약에 중복값이 나오면 set.size가 늘어나지 않으니까 다시 반복문이 돌아감
        }

        LinkedList list = new LinkedList(set);
        Collections.sort(list); //리스트 정렬
        System.out.println("로또 번호 : " + list);
    }
}
