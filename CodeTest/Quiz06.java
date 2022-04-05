package CodeTest;

/*  가상 대선 당선 시뮬레이션 프로그램
    - 기호 1번 이재명, 기호 2번 윤석열, 기호3번 심상정, 기호4번 안철수 순으로
    - 총 투표수 10,000건
    - 각 투표수의 결과는 4명의 대선주자들이 동일한 비율로 랜덤하게 발생(단, 당선자는 동율이 안됨)
    - 임의번호는 Random함수의 nextInt()함수를 통해서 생성
 */

import java.util.*;

public class Quiz06 {
    public static void main(String[] args) {

        int lee = 0;
        int youn = 0;
        int sim = 0;
        int ahn = 0;
        double resultcount = 0;
        double votes = 10000;
        double turnout = 0;

        Random random = new Random();

        String [] candidate = {"이재명","윤석열","심상정","안철수"};

        for (int i = 1; i < votes+1; i++) {
            String person = candidate[random.nextInt(candidate.length)];

            switch(person) {
                case "이재명":
                    lee = lee + 1;
                    break;
                case "윤석열":
                    youn = youn + 1;
                    break;
                case "심상정":
                    sim = sim + 1;
                    break;
                case "안철수":
                    ahn = ahn + 1;
                    break;
            }

            resultcount = lee + youn + sim + ahn;
            turnout = (resultcount/votes)*100;
            double leeturnout = (lee/resultcount)*100;
            double younturnout = (youn/resultcount)*100;
            double simturnout = (sim/resultcount)*100;
            double ahnturnout = (ahn/resultcount)*100;

            System.out.printf("[투표진행율]: %.2f%%, ",turnout);
            System.out.println(i + "명 투표 => " + person);
            System.out.printf("[기호:1] 이재명: %4.2f%%,", leeturnout);
            System.out.println("(투표수 :"+ lee +")");
            System.out.printf("[기호:2] 윤석열: %4.2f%%,", younturnout);
            System.out.println("(투표수 :"+ youn +")");
            System.out.printf("[기호:3] 심상정: %4.2f%%,", simturnout);
            System.out.println("(투표수 :"+ sim +")");
            System.out.printf("[기호:4] 안철수: %4.2f%%,", ahnturnout);
            System.out.println("(투표수 :"+ ahn +")");
            System.out.println();
        }

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(lee,youn,sim,ahn));
        int max = Collections.max(list);

        int [] numberlist = {lee,youn,sim,ahn};

        for (int i = 0; i < 4; i++) {
            if(max == numberlist[i]){
                System.out.print("[투표결과] 당선인: " + candidate[i]);
            }
        }
    }
}
