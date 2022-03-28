package Study;

/* 추상 메소드(Abstract Method)
    - 자식 클래스에서 반드시 오버라이딩 해야하는 메소드
    - 선언만 하고 구현 내용은 없음
    ex) abstract void print();

   추상 클래스(Abstract Class)
    - 하나 이상의 추상 메소드를 포함하는 클래스
    - 반드시 구현해야 하는 부분에 대해 명시적으로 표현
    - 추상 클래스 자체는 객체 생성 불가
    ex) abstract class 클래스명{
        abstract void print();
    }
 */

// 추상 클래스 Person
abstract class Person2{
    abstract void printInfo();
}


// 추상 클래스 상속
class Student3 extends Person2{
    public void printInfo(){  // 추상 클래스를 상속 받으면, 자식 클래스에서 메소드를 오버라이딩 해야 함
        System.out.println("Student3.printInfo");
    }
}


public class Study_Abstract {
    public static void main(String[] args) {
        //        추상 클래스의 사용
        // 1. 상속 받아서 만들기 , 2. 익명 클래스 사용
//        Person2 p1 = new Person2(); 추상클래스 객체 생성 불가
        Student3 s1 = new Student3();
        s1.printInfo();

        Person2 p2 = new Person2() { // 추상 클래스를 통해서, 익명 클래스?
            @Override
            void printInfo() {
                System.out.println("Study_Abstract.printInfo");
            }
        };
        p2.printInfo();

    }
}
