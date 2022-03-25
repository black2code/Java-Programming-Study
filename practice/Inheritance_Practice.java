package practice;

// Practice1
// 아래의 클래스 및 상속 관계에서 Test code를 수정하지 않고
// Cat 클래스 내에서 super 또는 super()를 이용하여
// "고양이 입니다." 가 출력될 수 있도록 변경해보세요.

class Animal1 {
    String desc;

    Animal1() {
        this.desc = "동물 클래스 입니다.";
    }

    Animal1(String desc) {

        this.desc = desc;
    }

    public void printInfo() {

        System.out.println(this.desc);
    }
}

class Cat extends Animal1 {
    String desc;
    Cat() {
//        this.desc = "고양이 입니다.";
//        super.desc = "고양이 입니다."; super를 사용하여, 부모 즉 Animal1 클래스의 desc 초기화
        super("고양이 입니다."); // 부모 클래스의 생성자 호출 Animal1(desc) 초기화
    }
}

public class Inheritance_Practice {
    public static void main(String[] args) {
        // Test code
        Cat cat = new Cat();
        cat.printInfo();

    }
}
