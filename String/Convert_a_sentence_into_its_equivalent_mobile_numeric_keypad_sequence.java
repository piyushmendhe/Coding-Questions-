package String;

import java.util.HashMap;
import java.util.Map;

public class Convert_a_sentence_into_its_equivalent_mobile_numeric_keypad_sequence {
    
    String printSequence(String S) 
    { 
        // code here
        Map<Character, String> keypadMapping = new HashMap<>();
        keypadMapping.put('A', "2");
        keypadMapping.put('B', "22");
        keypadMapping.put('C', "222");
        keypadMapping.put('D', "3");
        keypadMapping.put('E', "33");
        keypadMapping.put('F', "333");
        keypadMapping.put('G', "4");
        keypadMapping.put('H', "44");
        keypadMapping.put('I', "444");
        keypadMapping.put('J', "5");
        keypadMapping.put('K', "55");
        keypadMapping.put('L', "555");
        keypadMapping.put('M', "6");
        keypadMapping.put('N', "66");
        keypadMapping.put('O', "666");
        keypadMapping.put('P', "7");
        keypadMapping.put('Q', "77");
        keypadMapping.put('R', "777");
        keypadMapping.put('S', "7777");
        keypadMapping.put('T', "8");
        keypadMapping.put('U', "88");
        keypadMapping.put('V', "888");
        keypadMapping.put('W', "9");
        keypadMapping.put('X', "99");
        keypadMapping.put('Y', "999");
        keypadMapping.put('Z', "9999");

        String result = "";
        for (char c : S.toUpperCase().toCharArray()) {
            if (c == ' ') {
                result+="0";
            } else if (keypadMapping.containsKey(c)) {
                result+=keypadMapping.get(c);
            }
        }
        return result.toString();
    }
}
