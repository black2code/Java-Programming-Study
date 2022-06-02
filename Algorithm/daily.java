package Algorithm;

import java.util.HashMap;

public class daily {
    public static HashMap<String, String> convertListToHashMap(String[][] arr) {
        // TODO:
        HashMap<String,String> map = new HashMap<>();
        if(arr.length == 0){
            HashMap<String,String> map1 = new HashMap<>();
            return map1;
        }
        if(arr[0].length == 0){
            HashMap<String,String> map2 = new HashMap<>();
            return map2;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length-1; j++) {
                if(map.containsKey(arr[i][j])){
                    break;
                }
                map.put(arr[i][j],arr[i][j+1]);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"},
        };

        HashMap<String, String> output = convertListToHashMap(arr);
        System.out.println(output); // --
//        {
//            "make" = "Ford"
//            "model" = "Mustang",
//            "year" = "1964"
//        }
    }
}
