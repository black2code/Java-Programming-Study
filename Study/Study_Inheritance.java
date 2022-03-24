package Study;

/*
    상속(Inheritance)
     기존 클래스에 기능 추가 및 재정의하여 새로운 클래스를 정의
    - 부모 클래스 : 상속 대상이 되는 기존 클래스 = 상위 클래스, 기초 클래스
    - 자식 클래스 : 기존 클래스를 상속하는 클래스 = 하위 클래스, 파생 클래스
     부모 클래스의 필드와 메소드가 상속됨  // 생성자, 초기화 블록은 상속 되지 않음
     다중 상속은 불가능 (여러 부모로 부터)
     private, default 멤버는 자식 클래스에서 접근 불가 (default의 경우, 내부 패키지의 자식 클래스는 가능)
     ex) class 자식 클래스명 extends 부모 클래스명

     super, super()
      super - 부모 클래스와 자식 클래스의 멤버 이름이 같을 때 구분하는 키워드 // 부모쪽 가르킬때
      super() - 부모 클래스의 생성자 호출

     오버라이딩(Overriding)
     - 부모 클래스의 메소드를 자식 클래스에서 재정의
     오버라이딩 조건
     - 메소드 선언부는 부모 클래스의 메소드와 동일해야 함
     - 반환 타입에 한해,
      부모 클래스의 반환 타입으로 변환할 수 있는 타입으로 변경 가능
     - 부모 클래스의 메소드보다 접근제어를 더 좁은 범위로 변경 불가
     - 부모 클래스의 메소드보다 더 큰 범위의 예외 선언 불가
 */

class Person {
    String name;
    int age;
    public int a1;
    private int a2;

    Person() {}
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Person.printInfo");
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}

// Student 클래스 - Person 상속, 접근제어자 확인
class Student extends Person{
    Student(){
        a1 = 1;
        // a2 = 1;  상속은 받았지만 접근제어자 private는 다른 클래스에서 사용 불가
    }
}

// Student 클래스 - Person 상속, super 사용, 오버라이딩
class Student2 extends Person{
    String name;
    int stdId;

    Student2(String name, int age, int stdId){
        this.name = name; // Student2 클래스의 name
//        super.name = name; // super를 사용하여, 부모 즉 Person 클래스의 name
//        super(name, age); // 부모 클래스의 생성자 호출 Person(String name, int age)
        this.age = age; //Student2 클래스에 age가 없으므로 Person 클래스의 age
        this.stdId = stdId; //Student2 클래스의 stdId
    }

    public void printInfo(){
        System.out.println("Student2.printInfo");
        System.out.println("name: " + name); // 자기 객체의 name을 사용함 , super(name,age) 사용하면 부모쪽으로 초기화 하여 사용, 즉 Student2 객체는 비여있어 null 값 출력
        System.out.println("age: " + age);
        System.out.println("stdId: " + stdId);
    }
}


public class Study_Inheritance {
    public static void main(String[] args) {

//      Test code
//      1. 상속
        System.out.println("=============");
        Student s1 = new Student();
        s1.name = "a";
        s1.age = 25;
        s1.printInfo();


//      2. super, super(), 오버라이딩
        System.out.println("=============");
        Student2 s2 = new Student2("b",32, 1);
        s2.printInfo();

    }
}
