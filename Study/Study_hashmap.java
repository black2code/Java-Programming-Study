package Study;

import java.util.HashMap;

public class Study_hashmap {
    public static HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        //TODO.

        HashMap<String, Integer> out = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(hashMap.containsKey(arr[i])){
                out.put(arr[i],hashMap.get(arr[i]));
            }
        }
        return out;
    }
    public static void main(String[] args) {
        String[] arr = {"a", "c", "e"};
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>(){{
            put("a", 1);
            put("b", 2);
            put("c", 3);
        }};
        HashMap<String, Integer> output = select(arr, hashMap);
        System.out.println(output); // --> { "a"=1, "c"=3 }
    }
}
