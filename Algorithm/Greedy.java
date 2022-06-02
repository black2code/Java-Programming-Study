package Algorithm;

import java.util.Arrays;

public class Greedy {
    public static int movingStuff(int[] stuff, int limit) {

        int left = 0;
        int right = stuff.length-1;
        int two = 0;

        Arrays.sort(stuff); // {25, 42, 60, 73, 103, 167}

        while (left < right){
            if(stuff[left] + stuff[right] <= limit){
                two++;
                right--;
                left++;
            }else if(stuff[left] + stuff[right] > limit){
                right--;
            }
        }
        return stuff.length - two;
    }


    public static void main(String[] args) {
        int output = movingStuff(new int[]{42, 25, 60, 73, 103, 167}, 187);
        System.out.println(output); // 4
    }
}
