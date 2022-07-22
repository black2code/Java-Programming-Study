package Algorithm;

/*
암호화된 문자열과 암호화 키를 입력받아 복호화된 문자열을 리턴해야 합니다.
카이사르 암호(Caesar cipher)는 평문(plaintext)을 암호키 secret개만큼 (오른쪽으로) 평행이동시켜 암호화 합니다.

String output = decryptCaesarCipher("khoor", 3);
System.out.println(output); // --> hello

output = decryptCaesarCipher("zruog", 3);
System.out.println(output); // --> world

 */

import java.util.Arrays;
import java.util.List;

public class daily13 {
    public static String decryptCaesarCipher(String str, int secret) {

        List<String> alpabet = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            if(String.valueOf(str.charAt(i)).equals(" ")){
                result += " ";
            }
            for (int j = 0; j < alpabet.size(); j++) {
                if(String.valueOf(str.charAt(i)).equals(alpabet.get(j))){
                    if(secret > j){
                        result += alpabet.get(alpabet.size() - (secret -j));
                    }
                    else{
                        result += alpabet.get(j-secret);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String output = decryptCaesarCipher("khoor", 3);
        System.out.println(output); // --> hello

        String output2 = decryptCaesarCipher("khoor zruog", 3);
        System.out.println(output2); // --> hello world

        String output3 = decryptCaesarCipher("mnv xnt zqd qdzcx sn lnud sn hlldqrhud bntqrd", 25);
        System.out.println(output3); // --> now you are ready to move to immersive course
    }
}
