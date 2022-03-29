package Study;

/* 인터페이스
    - 다중 상속처럼 사용할 수 있는 기능
    - 추상메서드와 상수(final)만을 멤버로 가질 수 있다.
    - 인스턴스를 생성할 수 없고, 클래스 작성에 도움을 줄 목적으로 사용된다.

    ex) 접근제어자 interface 인터페이스이름{}
    class 클래스이름 implements 인터페이스이름{}

    - 동시 사용으로 다중 상속과 같은 효과
    ex) class 클래스이름 extends 클래스이름 implements 인터페이스이름 {}
 */

// School 인터페이스
interface School {
    public static final int MAX_CLASS = 20;
    public static final int MAX_PERSON_PER_CLASS = 40;
    public abstract void printSchool();
}

// Student 클래스 - School 인터페이스 이용
class Student_1 implements School{
    public void printSchool() {
        System.out.println("00 University");
    }
}


// Person 클래스
class Person3 {
    public String name;

    public void printName() {
        System.out.println("Name: " + name);
    }
}


// Student2 클래스 - Person 상속, School 인터페이스 이용
class Student_2 extends Person3 implements School{
    Student_2(String name){
        super.name = name;
    }
    public void printSchool() {
        System.out.println("11 University");
    }
}


public class Study_Interface {
    public static void main(String[] args) {
        //      1. 인터페이스 기본 사용
        System.out.println("== 기본 인터페이스 ==");
        Student_1 s1 = new Student_1();
        s1.printSchool();
        System.out.println(s1.MAX_CLASS);
        System.out.println(s1.MAX_PERSON_PER_CLASS);


//      2. 다중 상속처럼 사용하기
        System.out.println("== Like 다중 상속 ==");
        Student_2 s2 = new Student_2("A");
        s2.printSchool();
        s2.printName();

    }
}
