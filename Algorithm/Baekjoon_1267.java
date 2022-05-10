package Algorithm;

import java.util.Scanner;

public class Baekjoon_1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //영식 요금제 30초 마다 10원씩  29초 10원 30초~ 59초 부터 20원
        //민식 요금제 60초 마다 15원식  59초 이하는 15원  60~ 119초 30원

        int yprice = 0;
        int mprice = 0;

        int phone_count = sc.nextInt();
        int [] phone_time = new int[phone_count];

        for (int i = 0; i < phone_count; i++) {
            phone_time[i] += sc.nextInt();

            yprice += ((phone_time[i] / 30) +1) * 10;
            mprice += ((phone_time[i] / 60) +1) * 15;
        }
        if(yprice > mprice){
            System.out.println("M "+ mprice);
        }else if(yprice < mprice){
            System.out.println("Y "+yprice);
        }else{
            System.out.println("Y M "+yprice);
        }
    }
}
