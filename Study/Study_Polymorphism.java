package Study;

// Java 프로그래밍 - 다형성

class Person1 {
    public void print() {
        System.out.println("Person.print");
    }
}

class Student1 extends Person1 {
    public void print() {
        System.out.println("Student.print");
    }

    public void print2() {
        System.out.println("Student.print2");
    }
}

class CollegeStudent extends Person1 {
    public void print() {
        System.out.println("CollegeStudent.print");
    }
}


public class Study_Polymorphism {
    public static void main(String[] args) {
        //      1. 다형성
        System.out.println("== 다형성 ==");
        Person1 p1 = new Person1();
        Student1 s1 = new Student1();

        Person1 p2 = new Student1(); //다형성 자식이 객체인데 부모 타입으로 만든 것
//        Student1 s2 = new Person1(); 반대로 안됨

        p1.print();
        s1.print();
        s1.print2();
        p2.print();
//        p2.print2(); Person1의 print() 오버라이딩된 부분만 인식하고 print2()는 없는 것으로 인식

        Person1 p3 = new CollegeStudent();
//        CollegeStudent c1 = new Student1(); 자식 클래스끼리 같은 부모를 상속받았다고 하더라도 다형성은 되지 않음
        p3.print();



//      2. 타입 변환
        System.out.println("== 타입 변환 ==");
        Person1 pp1 = null;
        Student1 ss1 = null;

        Person1 pp2 = new Person1();
        Student1 ss2 = new Student1();
        Person1 pp3 = new Student1(); // 다형성, 업캐스팅이라고 한다. 자식 클래스의 객체가 부모타입으로 되는

        pp1 = pp2;
        pp1 = ss2;

        ss1 = ss2;
//        ss1 = pp2; 자식이 부모쪽 x
        ss1 = (Student1)pp3; //다운캐스팅 , Student1이 부모타입으로 업캐스팅 되었던걸 다시 자신의 클래스로 타입 변환 해주는 것

        CollegeStudent cc1;
        CollegeStudent cc2 = new CollegeStudent();
//        ss1 = (Student1) cc2;  같은 부모를 상속 받아도, 자식 클래스끼리 형변환 안돰
//        cc1 = (CollegeStudent)ss2; 마찬가지


//      3. instanceof
        System.out.println("== instanceof =="); // 해당 객체에 인스턴스가 맞는지 체크
        Person1 pe1 = new Person1();
        Student1 st1 = new Student1();
        Person1 pe2 = new Student1();
        Person1 pe3 = new CollegeStudent();

        System.out.println(pe1 instanceof Person1);
        System.out.println(pe1 instanceof Student1);

        System.out.println(st1 instanceof Student1);
        System.out.println(st1 instanceof Person1); //Person 부모 클래스 상속받아 만든 객체 true

        System.out.println(pe2 instanceof Person1);
        System.out.println(pe2 instanceof Student1);

        System.out.println(pe3 instanceof Person1);
        System.out.println(pe3 instanceof CollegeStudent);

        // 이런식으로 사용 가능
        if (pe1 instanceof Student1){
            Student1 stu1 = (Student1) pe1;
        }

        if (st1 instanceof Person1){
            Person1 per1 = (Person1) st1;
        }
    }
}
