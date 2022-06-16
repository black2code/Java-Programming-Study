package Algorithm;

public class daily10 {
    public static boolean isIsogram(String str) {
        String result = str.toLowerCase();

        for (int i = 0; i < str.length()-1; i++) {
            for(int j = i+1; j < str.length(); j++){
                if(result.charAt(i) == result.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean output = isIsogram("aba");
        System.out.println(output); // false

        output = isIsogram("Dermatoglyphics");
        System.out.println(output); // true

        output = isIsogram("moOse");
        System.out.println(output); // false
    }
}
