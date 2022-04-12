package Math;

// ArrayList를 사용한 집합 구현 실습 (집합 관련 연산 사용 X)

import java.util.ArrayList;

class MySet {
    // ArrayList
    ArrayList<Integer> list;

    // 생성자1
    MySet() {
        this.list = new ArrayList<Integer>();
    }

    // 생성자 2
    MySet(int[] arr) {
        this.list = new ArrayList<Integer>();

        for (int item : arr) {
            this.list.add(item);
        }
    }

    // 원소 추가 (중복 X)
    public void add(int x) {
        for (int item : this.list) { //for문이 도는 동안 같은 값이 나오면 추가하지 않음
            if (item == x) {
                return;
            }
        }
        this.list.add(x);
    }

    // 교집합
    public MySet retainAll(MySet b) {
        MySet result = new MySet();
        for (int itemA : this.list) {
            for (int itemB : this.list) {
                if(itemA == itemB){
                    result.add(itemA);
                }
            }
        }
        return result;
    }

// 합집합
    public MySet addAll(MySet b){
        MySet result = new MySet();
        for (int itemA : this.list) {
            result.add(itemA); //만든 add 사용 중복 없이 추가 가능
        }

        for(int itemB : b.list){
            result.add(itemB);
        }
        return result;
    }


// 차집합
    public MySet removeAll(MySet b){
        MySet result = new MySet();
        for(int itemA : this.list){
            boolean containFlag = false; //원소가 있는지 없는지 구분하기 위해
            for (int itemB : b.list) {
                containFlag = true;
                break;
            }
            if(!containFlag){ // 일치하지 않으면 , add
                result.add(itemA);
            }
        }
        return result;
    }

}


public class Set_Practice {
    public static void main(String[] args) {
        //      Test code
        MySet a = new MySet();

        a.add(1);
        a.add(1);
        a.add(1);
        System.out.println(a.list);
        a.add(2);
        a.add(3);
        System.out.println(a.list);

        a = new MySet(new int[]{1, 2, 3, 4, 5});
        MySet b = new MySet(new int[]{2, 4, 6, 8, 10});
        System.out.println("a: " + a.list);
        System.out.println("b: " + b.list);

        MySet result = a.retainAll(b);
        System.out.println("교집합: " + result.list);

        result = a.addAll(b);
        System.out.println("합집합: " + result.list);

        result = a.removeAll(b);
        System.out.println("차집합: " + result.list);

    }
}
