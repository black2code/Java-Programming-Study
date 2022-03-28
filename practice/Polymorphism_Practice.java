package practice;

// Practice
// 아래의 클래스와 상속 관계에서 다형성을 이용하여
// Car 객체를 통해 아래와 같이 출력될 수 있도록 Test code 부분을 구현해보세요.
// 빵빵!
// 위이잉!
// 삐뽀삐뽀!

class Car1 {
    Car1(){}
    public void horn() {
        System.out.println("빵빵!");
    }
}

class FireTruck1 extends Car1 {
    public void horn() {
        System.out.println("위이잉!");
    }
}

class Ambulance1 extends Car1 {
    public void horn() {
        System.out.println("삐뽀삐뽀!");
    }
}

public class Polymorphism_Practice {
    public static void main(String[] args) {
        Car1 car = new Car1();
        car.horn();

        car = new FireTruck1();
        car.horn();

        car = new Ambulance1();
        car.horn();


        Car1 car2[] = {new Car1(), new FireTruck1(), new Ambulance1()}; //다형성 이용

        for (Car1 item: car2){
            item.horn();
        }
    }
}
