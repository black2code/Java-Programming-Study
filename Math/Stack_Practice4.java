package Math;

// 괄호 짝 검사

// 입출력 예시)
// 입력: "("
// 출력: Fail

// 입력: ")"
// 출력: Fail

// 입력: "()"
// 출력: Pass

import java.util.Stack;

public class Stack_Practice4 {
    public static void checkParenthesis(String str) {
        Stack stack = new Stack();
        boolean checkFlag = true;

        for (String s: str.split("")) {
            if(s.equals("(")){
                stack.push(s);
            }else{
                if (stack.isEmpty()){  // ( 없다면
                    checkFlag = false;
                    break;
                }else{
                    stack.pop();
                }
            }
        }
        if(checkFlag && stack.isEmpty()){ //checkFlag가 true이고 스택 공간이 다 비여있다면
            System.out.println("PASS!");
        }else{
            System.out.println("FAIL!");
        }
    }

    public static void main(String[] args) {
        // Test code
        checkParenthesis("(");          // FAIL!
        checkParenthesis(")");          // FAIL!
        checkParenthesis("()");         // PASS!
        checkParenthesis("()()()");     // PASS!
        checkParenthesis("(())()");     // PASS!
        checkParenthesis("(((()))");    // FAIL!

    }
}
