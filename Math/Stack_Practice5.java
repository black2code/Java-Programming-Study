package Math;

// 후위표기법 연산
// 참고 설명) 전위/중위/후위 표기법

// 입출력 예시)
// 입력: "2 2 +"
// 출력: 4

// 입력: "2 2 -"
// 출력: 0


import java.util.Stack;

public class Stack_Practice5 {
    public static double calculate(String string) {
        Stack<Double> stack = new Stack();

        for (String str: string.split(" ")) { // 공백 기준으로
            if(str.equals("+")){
                stack.push(stack.pop() + stack.pop()); // object로 반환되기 때문에 , (double)형변환 하거나 <> 이용
            }else if(str.equals("-")){
                stack.push(-stack.pop() + stack.pop());
            }else if(str.equals("*")){
                stack.push(-stack.pop() * stack.pop());
            }else if(str.equals("/")){
                stack.push(1/stack.pop() * stack.pop());   // 먼저 나온 숫자로 나눠야 하니
            }else{
                stack.push(Double.parseDouble(str));  // String 타입 Double로
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(calculate("2 2 +"));    // 4
        System.out.println(calculate("2 2 -"));    // 0
        System.out.println(calculate("2 2 *"));    // 4
        System.out.println(calculate("2 2 /"));    // 1

        System.out.println(calculate("1 1 + 2 * 3 * 2 / 5 -"));    // 1
        System.out.println(calculate("5 2 * 3 - 8 * 4 /"));        // 14
    }
}
