package Math;

// 최대공약수를 재귀함수로 구현하시오.
/*  gcd(8, 12)
    return gcd(12, 8)
    return gcd(8, 4)
    return gcd(4, 0)  최대 공약수 4
 */

public class Recurrence_Practice2 {

    static int gcd(int a, int b){
        if(a % b  == 0){
            return b;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
//              Test code
        System.out.println(gcd(3, 5));
        System.out.println(gcd(2, 6));
        System.out.println(gcd(8, 12));
    }
}
