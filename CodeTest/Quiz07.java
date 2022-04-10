package CodeTest;

/*  로또 당첨 프로그램
    - 소개 : 로또는 1-45개의 숫자 사이의 값중 6개를 맞추면 당첨되는 복권
    로또의 개수를 구매하고(구매수량 입력), 당첨번호를 생성한다. 이후, 구매한 로또의 당첨번호를 판단하는 프로그램 작성
 */

import java.util.*;
import java.util.stream.Stream;

public class Quiz07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        HashSet lottoset = new HashSet();
        HashSet jackpotset = new HashSet();
        LinkedList list3 = new LinkedList();
        LinkedList list4 = new LinkedList();
        int count = 0;

        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};

        System.out.println("[로또 당첨 프로그램]\n");
        System.out.print("로또 개수를 입력해주세요.(숫자 1 ~ 10):");
        int lcount = sc.nextInt();

        for (int i = 0; i < lcount; i++) {
            System.out.print(alphabet[i] + "\t");
            for (int j = 0; lottoset.size() < 6; j++) {
                int lnum = random.nextInt(45) + 1;
                lottoset.add(lnum);
            }
            LinkedList list = new LinkedList(lottoset);
            Collections.sort(list);
            list3.addLast(list);
            Stream stream = list.stream();
            stream.forEach(n -> System.out.printf("%02d ", n));
            System.out.println();
            lottoset.clear();
        }

        System.out.println();
        System.out.println("[로또 발표]");
        for (int i = 0; jackpotset.size() < 6; i++) {
            int jnum = random.nextInt(45) + 1;
            jackpotset.add(jnum);
        }
        System.out.print("\t");
        LinkedList list2 = new LinkedList(jackpotset);
        Stream stream2 = list2.stream();
        stream2.forEach(n -> System.out.printf("%02d ", n));
        System.out.println();

        System.out.println();
        System.out.println("[내 로또 결과]");

        for (int i = 0; i < lcount; i++) {
            System.out.print(alphabet[i] + "\t");
            list4 = (LinkedList) list3.get(i);
            Stream stream3 = list4.stream();
            stream3.forEach(n -> System.out.printf("%02d ", n));

            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < 6; k++) {
                    if (list2.get(j) == list4.get(k)){
                        count += 1;
                    }
                }
            }
            System.out.println("=>" + count +" 개 일치");
            count = 0;
        }
    }
}
