package Algorithm;

public class daily2 {
    public static String convertDoubleSpaceToSingle(String str) {
        if(str.isEmpty()){
            return "";
        }
        str = str.replace("  ", " ");
        return str;
    }

    public static void main(String[] args) {
        String output = convertDoubleSpaceToSingle("string  with  double  spaces");
        System.out.println(output); // --> "string with double spaces"
    }
}
