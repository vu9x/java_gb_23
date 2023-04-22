import java.util.HashMap;

import javax.print.DocFlavor.CHAR_ARRAY;
import javax.print.attribute.HashAttributeSet;

public class s5_2 {
    public static void main(String[] args) {
        String a_1 = "foo";
        String a_2 = "bar";
        String b_1 = "paper";
        String b_2 = "title";

        System.out.println(isIsomorf(a_1, a_2));
        System.out.println(isIsomorf(b_1, b_2));
    }

    public static boolean isIsomorf(String first, String second) {
        if(first.length() != second.length()){
            return false;
        }
        
        char[] c_first = first.toCharArray();
        char[] c_second = second.toCharArray();

        HashMap<Character, Character> result = new HashMap<Character, Character>();
        for (int i = 0; i < first.length(); i++) {
            if(!result.containsKey(c_first[i])){
                result.put(c_first[i], c_second[i]);
            } else if(result.get(c_first[i]) != c_second[i]){
                return false;
            }
        }
        return true;
    }
}
