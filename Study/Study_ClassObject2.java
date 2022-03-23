package Study;

        /*
        오버로딩(Overloading)
        - 한 클래스 내에서 같은 이름의 메소드를 여러개 정의
        오버로딩의 조건
        - 메소드의 이름 같아야 함
        - 매개변수의 개수 또는 타입이 달라야 함 (리턴 타입의 차이로는 오버로딩이 되지 않음)

        접근 제어자
        - 클래스의 변수나 메소드의 접근에 제한을 두는 키워드
        접근 제어자 종류
        - private : 해당 클래스에서만 접근 가능
        - public : 어디서든 접근 가능
        - default : 해당 패키지 내에서만 접근 가능
        - protected : 해당 패키지 및 상속받은 클래스에서 접근 가능

        static
        - 변수나 메소드의 특성을 바꾸는 키워드
        static 특징
        - 메모리 한번만 할당됨
        - 즉, static 변수나 메소드는 공유되는 특성을 가짐
        static 클래스 변수
        - 해당 클래스의 각 객체들이 값을 공유
        static 클래스 메소드
        - 객체를 생성 하지 않아도 호출 가능
         */

import car.Car2;

class Car{
        String name;
        String type;

        Car(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public void printCarInfo() {
            System.out.println("=== Car Info ===");
            System.out.println("name: " + name);
            System.out.println("type: " + type);
        }

        // 오버로딩 구현
        public void printCarInfo(String date){
            this.printCarInfo(); //위에 있는 메소드
            System.out.println("date = " + date);
        }

        public void printCarInfo(int number){
            this.printCarInfo();
            System.out.println("number = " + number);
        }

        public void printCarInfo(String date, int number){
            this.printCarInfo();
            System.out.println("date = " + date);
            System.out.println("number = " + number);
        }
}


class Car3 {
        // 스태틱 변수
        static String name = "None";  //static 선언
        String type;

        Car3(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public void printCarInfo() {
            System.out.println("=== Car Info ===");
            System.out.println("name: " + name);
            System.out.println("type: " + type);
        }

        // 스태틱 메소드
        public static void getName() {
            System.out.println("Car Name " + name); // 안에서 사용하는 변수 name 도 static으로 선언되야 함
        }

}

public class Study_ClassObject2 {
    public static void main(String[] args) {
        Car myCar1 = new Car("a", "sedan");
        myCar1.printCarInfo();

//      1. 오버로딩 사용
        System.out.println("=== 오버로딩 사용 ===");
        myCar1.printCarInfo("2022");
        myCar1.printCarInfo(1234);
        myCar1.printCarInfo("2022",1234);



//      2. 접근 제어자
        System.out.println("=== 접근 제어자 ===");
        Car2 myCar2 = new Car2("a", "b", "c","d");  // import car.Car2;
        System.out.println(myCar2.name1);
//        System.out.println(myCar2.name2);
//        System.out.println(myCar2.name3);
//        System.out.println(myCar2.name4);


//      3. Static
        System.out.println("=== Static ===");
        Car3.getName();  // 객체를 생성하지 않아도, static 선언 후 사용 가능
        Car3 myCar3_1 = new Car3("a", "sedan");
        Car3 myCar3_2 = new Car3("b", "suv");
        Car3 myCar3_3 = new Car3("c", "rv"); //변수가 static으로 선언되어 있으면 객체끼리 공유 하기 때문에 마지막 "c"로 선언되어 출력값이 "c"로 동일
        myCar3_1.printCarInfo();
        myCar3_2.printCarInfo();
        myCar3_3.printCarInfo();
    }
}
