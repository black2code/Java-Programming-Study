package Study;

/*  Lambda 표현식
        - 메소드 대신 하나의 식으로 표현
        - 익명 함수(Anonymous function)
            (int x, int y) -> { return x + y;};
    람다식 장점
        - 일반적으로 코드가 간결해짐
        - 코드의 가독성이 높아짐
        - 생산성이 높아짐
    람다식 단점
        - 재사용이 불가능(익명)
        - 디버깅이 어려움
        - 재귀함수로는 맞지 않음
 */


interface ComputeTool {
    public abstract int compute(int x, int y);

    public abstract int compute2(int x, int y);
}


public class Study_Lambda {
    public static void main(String[] args) {

        ComputeTool cTool1 = new ComputeTool() {
            @Override
            public int compute(int x, int y) {
                return x + y;
            }

            public int compute2(int x, int y) {
                return x - y;
            }

        };
        System.out.println(cTool1.compute(1,2));

        // 람다식 
//        ComputeTool cTool2 = (x, y) -> {return x + y;}; 인터페이스 메소드가 2개 이상이면 사용 불가
//        System.out.println(cTool2.compute(1,2));
    }
}
