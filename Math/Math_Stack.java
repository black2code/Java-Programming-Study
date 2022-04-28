package Math;

/*  스택(Stack)
    후입 선출(Last In First Out; LIFO) 자료구조
    - 마지막에 들어온 데이터가 먼저 나가는 구조
    데이터가 입력된 순서의 역순으로 처리되어야 할 때 사용
    - ex) 함수 콜 스택, 수식 계산, 인터럽트 처리 등

 */

import java.util.Stack;

public class Math_Stack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack); // [1,2,3,4,5]

        System.out.println(stack.pop()); // 5삭제
        System.out.println(stack); // [1,2,3,4]

        System.out.println(stack.pop()); // 4삭제
        System.out.println(stack); // [1,2,3]

        System.out.println(stack.peek()); // 데이터를 삭제하지 않고, 3반환
        System.out.println(stack); // [1,2,3]

        System.out.println(stack.contains(1)); // stack 안에 1이 있는지 // true
        System.out.println(stack.size());
        System.out.println(stack.empty()); // stack이 비여있는지 // false

        stack.clear();
        System.out.println(stack);
        stack.pop(); // 예외 발생
    }
}
