package Algorithm;

public class daily8 {
    public static boolean superIncreasing(int[] arr) {
        int result = 0;
        for(int i = 0; i < arr.length-1; i++){
            result += arr[i];
            if(result < arr[i+1]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        boolean output = superIncreasing(new int[]{1, 3, 6, 13, 54});
//        System.out.println(output); // --> true
//        boolean output = superIncreasing(new int[]{979, 1737, -2146, -337, 1316});
//        System.out.println(output); // --> false
        boolean output = superIncreasing(new int[]{-2123, 843, -733, 1156, -919});
        System.out.println(output); // --> false
    }
}
