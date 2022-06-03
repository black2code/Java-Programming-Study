package Algorithm;

public class Gready2 {
    public static int partTimeJob(int k) {

        int [] money = new int[]{500, 100, 50, 10, 5, 1};
        int result = 0;
        int idx = 0;

        while (idx != money.length){
            result += k/money[idx];
            int sum = k/money[idx];
            k = k - sum*money[idx];

            if(k/money[idx]==0){
                idx++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
// 4972원을 받았을 때 500원짜리 동전 9개, 100원짜리 동전 4개, 50원짜리 동전 1개, 10원짜리 동전 2개, 1원짜리 동전 2개, 총 18개를 반환합니다.
        int output2 = partTimeJob(4972);
        System.out.println(output2); // --> 18
    }
}
