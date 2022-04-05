package Study;

/*  예외(Exception)
    정상적이지 않은 Case
    - 0으로 나누기
    - 배열의 인덱스 초과
    - 없는 파일 열기

    throw, throws
    throw : 예외를 발생 시킴
    throws : 예외를 전가 시킴

    함수이름 (){
        throw new Exception();
    }

    함수 이름() throws Exception{}
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


// 기존의 예외 말고 사용자가 정의한 예외 사용
class NotTenException extends RuntimeException {}

public class Study_Exception {
    public static boolean checkTen(int ten) {
        if (ten != 10) {
            return false;
        }

        return true;
    }

    public static boolean checkTenWithException(int ten) {
        try {
            if (ten != 10) {
                throw new NotTenException();
            }
        }catch (NotTenException e){
            System.out.println("e = " + e);
            return false;
        }
        return true;
    }

    public static boolean checkTenWithThrows(int ten) throws NotTenException{ //내부에서 처리하지 않고 호출하는쪽에서 처리
        if(ten != 10){
            throw new NotTenException();
        }


        return true;
    }

    public static void main(String[] args) throws IOException {
        //      1. 예외
//      1-1. 0으로 나누기
        System.out.println("== 0으로 나누기 ==");

        try {
            int a = 5 / 0;
        }catch (ArithmeticException e){
            System.out.println("0으로 나누기 예외 발생");
            System.out.println("e = " + e);
        }finally {
            System.out.println("1-1 연습 종료");
            System.out.println();
        }


//      1-2. 배열 인덱스 초과
        System.out.println("== 배열 인덱스 초과 ==");
        int[] b = new int[4];

        try {
            b[4] = 1;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 인덱스 초과 예외 발생");
            System.out.println("e = " + e);
        }
        System.out.println();


//      1-3. 없는 파일 열기
        System.out.println("== 없는 파일 열기 ==");

        try {
            BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        }catch (FileNotFoundException e){
            System.out.println("파일 읽기 예외 발생");
            System.out.println("e = " + e);
        }
        System.out.println();



//      2. throw, throws
        System.out.println("== checkTen ==");
        boolean checkResult = Study_Exception.checkTen(10);
        System.out.println("checkResult = " + checkResult);
        System.out.println();


        System.out.println("== checkTenWithException ==");
        checkResult = Study_Exception.checkTenWithException(9);
        System.out.println("checkResult = " + checkResult);
        System.out.println();


        System.out.println("== checkTenWithThrows ==");
        try {
            checkResult = checkTenWithThrows(5);  // 호출하는쪽에서 직접 예외 처리
        }catch (NotTenException e){
            System.out.println("e = " + e);
        }
        System.out.println("checkResult = " + checkResult);
    }
}
