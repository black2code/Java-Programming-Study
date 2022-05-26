package Algorithm;

/*
새로운 페이지 접속은 알파벳 대문자로 표기합니다.
뒤로 가기 버튼을 누른 행동은 "-1"로 표기합니다.
앞으로 가기 버튼을 누른 행동은 "1"로 표기합니다.
다음 방문할 페이지는 항상 현재 페이지와 다른 페이지로 접속합니다.
방문한 페이지의 개수는 100개 이하입니다.
반환되는 출력값 ArrayList의 첫 번째 요소 prev 스택, 두번째 요소 current 스택, 세 번째 요소 next 스택을 사용해야 합니다.

 */
import java.util.ArrayList;
import java.util.Stack;

public class Browser {
        public static ArrayList<Stack> browserStack(String[] actions, String start) {
            Stack<String> prevStack = new Stack<>();
            Stack<String> nextStack = new Stack<>();
            Stack<String> current = new Stack<>();
            ArrayList<Stack> result = new ArrayList<>();

            current.push(start);

            for (String ac :actions) {
                if(ac.matches("[A-Z]")){
                    nextStack.clear();
                    prevStack.push(current.pop());
                    current.push(ac);
                }else if(ac.equals("-1")){
                    if (prevStack.isEmpty()){
                        continue;
                    }
                    nextStack.push(current.pop());
                    current.push(prevStack.pop());
                }else if(ac.equals("1")){
                    if(nextStack.isEmpty()){
                        continue;
                    }
                    prevStack.push(current.pop());
                    current.push(nextStack.pop());
                }
            }
            result.add(prevStack);
            result.add(current);
            result.add(nextStack);
            return result;
            //

            // if(Integer.parseInt(start) < 65 || Integer.parseInt(start) > 90) return false;
            // current =   A B C   B  D    A`        D    A`     D.    B
            // prevStack = 0 A A,B A  A,B  A,B,D    A,B  A,B,D  A,B    A
            // nextStack = 0 0 0   C  0    0.        A`   0      A`    A`D
    }

    public static void main(String[] args) {
        String[] actions = new String[]{"B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"};
        String start = "A";
        ArrayList<Stack> output = browserStack(actions, start);

        System.out.println(output); // [["A"], "B", ["A", "D"]]
    }
}
