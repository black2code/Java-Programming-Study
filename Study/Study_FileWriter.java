package Study;

// Java 프로그래밍 - 입출력_2

import java.io.*;

public class Study_FileWriter {
    public static void main(String[] args) throws IOException {
//      1. 파일 쓰기
//      FileWriter
        FileWriter fw = new FileWriter("./memo.txt"); // memo.txt 파일 생성
        String memo = "헤드 라인 \n"; //내용 입력
        fw.write(memo); //memo 데이터 넣음

        memo = "연습용 작성\n";
        fw.write(memo);

        fw.close(); //파일 쓰기가 완료 되면 항상 close

//      PrintWriter
        PrintWriter pw = new PrintWriter("./memo2.txt"); // memo2.txt 파일 생성
        memo = "헤드 라인2";
        pw.println(memo); // pw는 println 이 있다.

        memo = "연습용 작성 2";
        pw.println(memo);

        pw.close(); //마찬가지로 항상 close


//      파일 이어 쓰기
        FileWriter fw2 = new FileWriter("./memo.txt",true); // 이어서 작성 true 입력
        memo = "추가 작성 1\n";
        fw2.write(memo);
        fw2.close();

        //PrintWriter는 FileWriter를 이용하여 이어쓰기 가능
        PrintWriter pw2 = new PrintWriter(new FileWriter("./memo.txt",true));
        memo = "pw으로 이어쓰기";
        pw2.println(memo);

        pw2.close();

//      2. 파일 입력
        BufferedReader br = new BufferedReader(new FileReader("./memo.txt")); //파일 읽기


        //여러줄 읽기
        while(true){
            String line = br.readLine(); // 파일로부터 데이터를 한줄씩 읽어들임

            if (line == null){ //line이 더이상 읽을게 없다면
                break;
            }
            System.out.println(line);
        }
        br.close();
    }
}
