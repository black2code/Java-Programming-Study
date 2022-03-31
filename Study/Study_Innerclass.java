package Study;

/* 내부 클래스 (Inner class)
- 클래스 안에 선언한 클래스

    특징
- 내부 클래스에서 외부 클래스 멤버에 접근가능
- 외부에서는 내부 클래스에 접근 불가

    종류
- 인스턴스 클래스
- 정적 클래스 - 내부 클래스에 static 키워드가 붙어서 메모리에 바로 상주하는 것
- 지역 클래스
- 익명 클래스 - 이름을 가지지 않는 클래스, 선언과 동시에 객체가 생성, 일회용 클래스
(ex) 클래스이름 참조변수이름 = new 클래스이름(){}

 */

// 내부 클래스 구조
class Outer{
    public void print(){
        System.out.println("Outer.print");
    }

    class Inner{
        public void innerPrint(){
            Outer.this.print(); //내부 클래스에서 외부 클래스 접근 가능
        }
    }

    static class InnerStaticClass{
        void innerPrint(){
//            Outer.this.print(); static은 바로 메모리에 적재, Outer는 그렇지 않기 때문에 사용 불가
        }
    }
}

abstract class Person4{
    public abstract void printInfo();
}

class Student4 extends Person4{
    public void printInfo(){
        System.out.println("Student.printInfo");
    }
}


public class Study_Innerclass {
    public static void main(String[] args) {
        //      외부 클래스
        Outer o1 = new Outer();

//      내부 클래스 - 인스턴스
        Outer.Inner i1 = new Outer().new Inner(); //외부 객체를 만들고, 내부 객체를 만들어야 함

//      내부 클래스 - 정적
        Outer.InnerStaticClass is1 = new Outer.InnerStaticClass(); //Outer의 객체 생성은 하지 않고 클래스 이름으로 접근

//      익명 클래스
        Person4 p1 = new Person4() {
            @Override
            public void printInfo() {
                System.out.println("Main.printInfo");
            }
        };
    }
}
