package Math;

/*  조합(Combination)
    서로 다른 n개중에 r개를 선택하는 경우의 수 (순서x, 중복x)
    - 예시) 서로 다른 4명 중 주번 2명 뽑는 방법
    nCr = n!/(n-r)!r! = nPr/r!  4C2 = 4!/2!x2! = 6

    중복 조합
    서로 다른 n개중에 r개를 선택하는 경우의 수 (순서x, 중복O)
    - 예시) 후보2명, 유권자 3명일 때 무기명 투표 방법
    nHr = n+r - 1Cr  = 2+3-1C3  = 4C3 =  4!/(4-3)!3! = 4
 */

public class Combination {

    static int getCombination(int n, int r){
        int pResult = 1;
        for (int i = n; i >= n -r +1 ; i--) {
            pResult *= i;
        }

        int rResult = 1;
        for (int i = 1; i <= r; i++) {
            rResult *= i;
        }
        return pResult/rResult;
    }

    public static void main(String[] args) {
        //      1. 조합
        System.out.println("== 조합 ==");
        //서로 다른 4명 중 주변 2명 뽑는 경우의 수

        int n = 4;
        int r = 2;
        int pResult = 1;

        for (int i = n; i >= n -r +1 ; i--) {
            pResult *= i;
        }

        int rResult = 1;
        for (int i = 1; i <= r; i++) {
            rResult *= i;
        }
        System.out.println("결과 : " + pResult/rResult);

//      2. 중복 조합
        System.out.println("== 중복 조합 ==");
        //후보 2명 유권자 3명일 때 무기명 투표 경우의 수
        n = 2;
        r = 3;

        System.out.println("결과 :" + getCombination(n + r -1, r));

    }
}
